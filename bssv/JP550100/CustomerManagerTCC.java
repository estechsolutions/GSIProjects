package tcc.e1.bssv.JP550100;

import java.util.ArrayList;

import oracle.e1.bssv.J0100004.ContactQueryProcessor;
import oracle.e1.bssv.J0100004.valueobject.InternalGetContacts;
import oracle.e1.bssv.J0100004.valueobject.InternalGetContactsWhereFields;
import oracle.e1.bssv.J0100004.valueobject.InternalShowContacts;
import oracle.e1.bssv.J0100007.valueobject.InternalShowPhones;
import oracle.e1.bssv.J0100008.valueobject.InternalShowElectronicAddresses;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssv.J0100021.CustomerProcessor;
import oracle.e1.bssv.J0100021.valueobject.InternalProcessCustomer;
import oracle.e1.bssv.JP010000.valueobject.Address;
import oracle.e1.bssv.JP010000.valueobject.AddressBook;
import oracle.e1.bssv.JP010000.valueobject.ConfirmProcessAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ContactRecord;
import oracle.e1.bssv.JP010000.valueobject.ElectronicAddress;
import oracle.e1.bssv.JP010000.valueobject.ElectronicAddressRecord;
import oracle.e1.bssv.JP010000.valueobject.PhoneNumber;
import oracle.e1.bssv.JP010000.valueobject.ProcessAddressBook;
import oracle.e1.bssv.JP010000.valueobject.Processing;
import oracle.e1.bssv.JP010020.CustomerManager;
import oracle.e1.bssv.JP010020.valueobject.ConfirmProcessCustomer;
import oracle.e1.bssv.JP010020.valueobject.ProcessCustomer;

import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.util.E1Message;

import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J550100.CustomerMgrTCC;
import tcc.e1.bssv.J550100.valueobject.InternalCustomerXRef;
import tcc.e1.bssv.JP550100.valueobject.BusinessDetails;
import tcc.e1.bssv.JP550100.valueobject.CustomerReply;
import tcc.e1.bssv.JP550100.valueobject.CustomerRequest;
import tcc.e1.bssv.JP550100.valueobject.EmailDetails;
import tcc.e1.bssv.JP550100.valueobject.PhoneDetails;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class CustomerManagerTCC extends PublishedBusinessService
{
    private static final String ADDRESS_VERSION = "ZJDE0001";
    private static final String CUSTOMER_VERSION = "ZJDE0001";
    private static final String PROCESSING_MODE_ADD = "1";
    private static final String PROCESSING_MODE_CHANGE = "2";
    
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public CustomerManagerTCC()
    {
    }

    /**
     * Published method for addOrUpdateCustomer TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected addOrUpdateCustomer
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public CustomerReply addOrUpdateCustomer(CustomerRequest vo) throws BusinessServiceException
    {
        return addOrUpdateCustomer(null, null, vo);
    }

    /**
     * Protected method for CustomerManagerTCC PublishedBusinessService. addOrUpdateCustomer will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected CustomerReply addOrUpdateCustomer(IContext context, IConnection connection,
                                                CustomerRequest custReq) throws BusinessServiceException
    {
        //perform all work within try block, finally will clean up any connections.
        try
        {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "addOrUpdateCustomer", custReq);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
 
            //Load internal class with data passed in           
            InternalCustomerXRef xRefData = new InternalCustomerXRef();
            xRefData.loadFromCustomerRequest(custReq);

            //Call internal cross reference function to obtain E1 address number if available.
            messages.addMessages(CustomerMgrTCC.addCustomerXrefRecord(context, connection, xRefData));
            
            //load standard published interface
            ProcessCustomer procCustomerVO = createProcessCustomer(context,connection,custReq, xRefData);

            //Call the standard bssv            
            ConfirmProcessCustomer procCustomerReply = processTCCCustomer(context, connection, procCustomerVO);
            
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors())
            {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            CustomerReply custReply = new CustomerReply();
            custReply.setE1MessageList(messages);
            
            //Update XRef with address number
            ConfirmProcessAddressBook confirmAddrBook = procCustomerReply.getConfirmProcessAddressBook();
            if(confirmAddrBook != null)
            {
                Entity addrEntity = confirmAddrBook.getEntity();
                if(addrEntity != null)
                {
                    xRefData.setMnAddressNumber(new MathNumeric(addrEntity.getEntityId()));
                    custReply.setAddressNumber(addrEntity.getEntityId());
                    custReply.setCustomerIdTCC(custReq.getCustomerIdTCC());                    
                    CustomerMgrTCC.updateCustomerXrefRecord(context, connection, xRefData);
                }
            }

            finishPublishedMethod(context, "addOrUpdateCustomer");
            //return outVO, filled with return values and messages
            return custReply;
        }
        finally
        {
            //Call close to clean up all remaining connections and resources.
            close(context, "addOrUpdateCustomer");
        }
    }
    
    protected ProcessAddressBook createProcessAddressBook(IContext context, IConnection connection, CustomerRequest custReq, InternalCustomerXRef xRefData)
    {
        ProcessAddressBook procAddrBook = new ProcessAddressBook();
        if(procAddrBook != null)
        {
            //Create address book
            AddressBook addrBook = new AddressBook();
            
            //Load address into address book 
            if(addrBook != null)
            {
                //Set values
                addrBook.setEntityName(custReq.getLastName()+", "+custReq.getFirstName());
                addrBook.setEntityTypeCode("C");
                
                // Check to see if a business customer and if so set code to C else code is N
                if (custReq.getCustomerType().compareToIgnoreCase("business")==0 || custReq.getCustomerType().compareToIgnoreCase("c")==0){
                    addrBook.setPersonCorporationCode("C");
                }else{
                    addrBook.setPersonCorporationCode("N"); 
                }               
                               
                //set the version and processing mode
                Processing procMode = new Processing();
                if(procMode != null)
                {
                    procMode.setActionType(xRefData.getSzXrefMode());
                    procMode.setProcessingVersion(ADDRESS_VERSION);
                    addrBook.setProcessing(procMode);
                }
                InternalShowContacts contactData = new InternalShowContacts();
                //set the entity
                Entity addrEntity = new Entity();
                if(addrEntity != null) 
                {
                    addrEntity.setEntityLongId(xRefData.getSzCustomerIdTCC());
                    if(xRefData.getSzXrefMode().equals(PROCESSING_MODE_CHANGE))
                    {
                        addrEntity.setEntityId(xRefData.getMnAddressNumber().intValue());
                        // if the XrefMode is 2 "Update" then need to Get Contact Information so the line number can be useed on the update
                       contactData = getContactDetails(context,connection,xRefData.getMnAddressNumber().intValue(), custReq);                        
                    }
                    addrBook.setEntity(addrEntity);
                }

                //Define the mailing address
                Address addr = new Address();
                if(addr != null)
                {
                    addr.setMailingName(xRefData.getSzCustomerName());
                    
                    tcc.e1.bssv.JP550100.valueobject.Address reqAddr = custReq.getShipAddress();
                    addr.setAddressLine1(reqAddr.getAddressLine1());
                    addr.setAddressLine2(reqAddr.getAddressLine2());
                    addr.setCity(reqAddr.getCity());
                    addr.setStateCode(reqAddr.getState());
                    addr.setPostalCode(reqAddr.getZipCode());
                }
                addrBook.setAddress(addr);




                //set electronic addresses
                EmailDetails[] customerEmails = custReq.getCustomerEmails();
                if(customerEmails != null && customerEmails.length > 0)
                {
                    ElectronicAddress[] emails = new ElectronicAddress[customerEmails.length];
                    if(emails != null)
                    {
                        for(int x=0; x<customerEmails.length; x++)
                        {
                            emails[x] = new ElectronicAddress();
                            if(xRefData.getSzXrefMode().equals(PROCESSING_MODE_CHANGE)){
                              // If the processing mode is change then call the NER to delete all email records
                            }
                            
                            emails[x].setActionType(PROCESSING_MODE_ADD);                            
                            emails[x].setElectronicAddress(customerEmails[x].getEmailAddress());
                            if (customerEmails[x].getEmailType().compareToIgnoreCase("personal")==0){
                                emails[x].setElectronicAddressTypeCode("P");
                            }else{
                                emails[x].setElectronicAddressTypeCode("E");
                            }

                            emails[x].setMessageIndicatorCode(0);
                            if(customerEmails[x].getDoNotEmail().equals("N"))
                            {
                                emails[x].setMessageIndicatorCode(1);
                            }
                        }
                    }
                    addrBook.setElectronicAddresses(emails);
                }

                //set phone numbers
                PhoneDetails[] customerPhones = custReq.getCustomerPhones();
                if(customerPhones != null && customerPhones.length > 0)
                {
                    PhoneNumber[] phones = new PhoneNumber[customerPhones.length];
                    if(phones != null)
                    {
                        for(int x=0; x<customerPhones.length; x++)
                        {
                            phones[x] = new PhoneNumber();
                            
                            phones[x].setPhoneNumber(customerPhones[x].getPhoneNumber());
                            
                            phones[x].setPhoneTypeCode(""); // the default is blank for business
                            if(customerPhones[x].getPhoneType().equals("HOME"))
                                phones[x].setPhoneTypeCode("HOM");
                            if(customerPhones[x].getPhoneType().equals("WORK"))
                                phones[x].setPhoneTypeCode("W");
                            if(customerPhones[x].getPhoneType().equals("MOBILE"))
                                phones[x].setPhoneTypeCode("M");
                            if(customerPhones[x].getPhoneType().equals("FAX"))
                                phones[x].setPhoneTypeCode("FAX");
                            if(customerPhones[x].getPhoneType().equals("H"))
                                phones[x].setPhoneTypeCode("HOM");
                            if(customerPhones[x].getPhoneType().equals("W"))
                                phones[x].setPhoneTypeCode("W");
                            if(customerPhones[x].getPhoneType().equals("M"))
                                phones[x].setPhoneTypeCode("M");
                            if(customerPhones[x].getPhoneType().equals("F"))
                                phones[x].setPhoneTypeCode("FAX");

                            
                            if(xRefData.getSzXrefMode().equals(PROCESSING_MODE_CHANGE)){
                                // Call the NER to delete the phone numbers
                            }
                            phones[x].setActionType(PROCESSING_MODE_ADD);
                            
                        }
                    }
                    addrBook.setPhoneNumbers(phones);
                }

                /*
                addrBook.setBusinessUnit(null);
                addrBook.setCallSalesTeamAlignment(null);
                addrBook.setCategoryCodesAddressBook(null);
                addrBook.setClassifications(null);
                addrBook.setCreditMessageCode(null);
                addrBook.setEmployeeGroupApprovalsCode(null);
                addrBook.setEntityNameSecondary(null);
                addrBook.setEntityTaxIdAdditional(null);
                addrBook.setIndustryClassificationCode(null);
                addrBook.setIsEntityTypeEmployee(null);
                addrBook.setIsEntityTypeNettingIndicator(null);
                addrBook.setIsEntityTypePayables(null);
                addrBook.setIsEntityTypePurchaser(null);
                addrBook.setIsEntityTypeReceivables(null);
                addrBook.setLanguageCode(null);
                addrBook.setParent(null);
                addrBook.setPersonCorporationCode(null);
                addrBook.setRelatedAddress1(null);
                addrBook.setRelatedAddress2(null);
                addrBook.setRelatedAddress3(null);
                addrBook.setRelatedAddress4(null);
                addrBook.setRelatedAddress5(null);
                addrBook.setRelatedAddress6(null);
                addrBook.setRemark(null);
                addrBook.setStatistics(null);
                addrBook.setStock(null);
                addrBook.setTaxExemptCertificate(null);
                addrBook.setUserReservedData(null);
                */
            }
            
            procAddrBook.setAddressBook(addrBook);
        }
        return procAddrBook;
    }
    
    protected ProcessCustomer createProcessCustomer(IContext context, IConnection connection, CustomerRequest custReq,  InternalCustomerXRef xRefData)
    {
        ProcessCustomer custProc = new ProcessCustomer();
        if(custReq != null)
        {
            custProc.setProcessAddressBook(createProcessAddressBook(context,connection,custReq, xRefData));

            Processing procMode = new Processing();
            if(procMode != null)
            {
                procMode.setActionType(xRefData.getSzXrefMode());
                procMode.setProcessingVersion(CUSTOMER_VERSION);
                custProc.setProcessing(procMode);
            }

            /*
            custProc.setAlternateAddressNumber(null);
            custProc.setAlternatePayor(null);
            custProc.setBillingInstructions(null);
            custProc.setCategoryCodesCustomer(null);
            custProc.setCollection(null);
            custProc.setCredit(null);
            custProc.setCustomer(null);
            custProc.setCustomerShipNotice(null);
            custProc.setDates(null);
            custProc.setDeductionManager(null);
            custProc.setDeductionManager(null);
            custProc.setDistribution(null);
            custProc.setDistribution(null);
            custProc.setFinancial(null);
            custProc.setInvoice(null);
            custProc.setModelJournalEntry(null);
            custProc.setParent(null);
            custProc.setTax(null);
            custProc.setUserReservedData(null);
            */
        }
        return custProc;
    }
    
    protected ConfirmProcessCustomer processTCCCustomer(IContext context, IConnection connection, 
                                                        ProcessCustomer vo) throws BusinessServiceException 
    {
        //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
        E1MessageList messages = new E1MessageList();
        // Create a new internal vo based on the published vo passed in.
        InternalProcessCustomer internalVO = new InternalProcessCustomer();

        //Get the addressBook VO
        E1MessageList mapMessages =
            vo.getProcessAddressBook().mapFromPublished(context,
                                                        connection,
                                                        internalVO.getInternalProcessAddressBook());

        mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE,
                                      E1Message.WARNING_MSG_TYPE);
        messages.addMessages(mapMessages);

        //Call formatters and utilities
        mapMessages = vo.mapFromPublished(context, connection, internalVO);

        mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE,
                                      E1Message.WARNING_MSG_TYPE);
        messages.addMessages(mapMessages);

        //Call BSSV CustomerProcessor passing context and internal VO
        E1MessageList sbfMessages = CustomerProcessor.processCustomer(context, connection, internalVO);
        //Add messages returned from BSSV to message list for Published Business Service.
        messages.addMessages(sbfMessages);
        //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
        //If messages contains errors, throw the exception

        if (messages.hasErrors()) 
        {
            //get the string representation of all the messages
            String error = messages.getMessagesAsString();
            //Throw new BusinessServiceException
            throw new BusinessServiceException(error, context);
        }

        //Exception was not thrown, so create the confirm VO from internal VO
        ConfirmProcessCustomer confirmVO = new ConfirmProcessCustomer(internalVO);

        //if a value was passed in the company field pass back the unformatted value
        if ((vo.getCustomer().getCompany() != null) &&
            (vo.getCustomer().getCompany().length()) != 0) 
        {
            confirmVO.getConfirmCustomer().setCompany(vo.getCustomer().getCompany());
        }

        confirmVO.setE1MessageList(messages);

        //return outVO, filled with return values and messages
        return confirmVO;
    } 
    
    protected InternalShowContacts getContactDetails(IContext context, IConnection connection, Integer custAB, CustomerRequest custReq){
        E1MessageList messages = new E1MessageList();
        InternalGetContacts internalContact = new InternalGetContacts();
        InternalGetContactsWhereFields whereFields = new InternalGetContactsWhereFields();
        whereFields.setF0111_AN8(custAB);
        internalContact.setQueryWhereFields(whereFields);
        messages.addMessages(ContactQueryProcessor.getContacts(context, connection,internalContact));
        InternalShowContacts contactdetail = new InternalShowContacts();
        if (messages.hasErrors()){
            String error = messages.getMessagesAsString();
        }else{
            if (internalContact.getQueryResults() != null){
                contactdetail = internalContact.getQueryResults(0);
            }
        }       
        
        return contactdetail;
    }
    
    protected MathNumeric getEmailLineNumber(InternalShowContacts contactEmail,String EmailAddress){
        
        MathNumeric lineNumber;
        ArrayList emailList = new ArrayList(0);
        if (contactEmail.getInternalElectronicAddresses() != null){
            emailList = contactEmail.getInternalElectronicAddresses();
        }
        
        if (emailList.size() > 0){
            lineNumber = new MathNumeric(1);
        }else{
            lineNumber = new MathNumeric(0);
        }
        
        return lineNumber;
    }
   
   
    protected MathNumeric getPhoneLineNumber(InternalShowContacts contactPhone,String phoneNumber, String phoneType){
        
        MathNumeric lineNumber = new MathNumeric(0);
        if (contactPhone.getInternalPhones() != null){
        ArrayList phoneList = contactPhone.getInternalPhones();
            for (int i=0; i<phoneList.size(); i++){
                InternalShowPhones onePhone = (InternalShowPhones)phoneList.get(i);
                if (phoneType.compareToIgnoreCase(onePhone.getF0115_PHTP().trim())==0){
                    lineNumber = onePhone.getF0115_RCK7();
                }
            }
        }
        return lineNumber;
    }   
    
}
