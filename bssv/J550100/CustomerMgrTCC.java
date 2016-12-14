package tcc.e1.bssv.J550100;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;

import oracle.e1.bssvfoundation.connection.IConnection;

import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;

import oracle.e1.bssvfoundation.services.IBSFNService;

import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J550100.valueobject.InternalCustomerXRef;


/**
 * TODO: Java Doc for BusinessService
 */
public abstract class CustomerMgrTCC extends BusinessService
{
    private static final String PROCESSING_MODE_ADD = "1";
    private static final String PROCESSING_MODE_CHANGE = "2";

    /**
     * Calls the TCC_CustomerAddressXref(N5501001) business function which has the D5501001A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    public static E1MessageList addCustomerXrefRecord(IContext context, IConnection connection,
                                                             InternalCustomerXRef custXRef)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCustomerNumberTCC", custXRef.getSzCustomerIdTCC());
        bsfnParams.setValue("szName", custXRef.getSzCustomerName());
        bsfnParams.setValue("cCallMode", "A");

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "TCC_CustomerAddressXref", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        custXRef.setMnAddressNumber((MathNumeric) bsfnParams.getValue("mnAddressNumber"));
        custXRef.setSzErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        custXRef.setSzErrorMessage((String) bsfnParams.getValue("szErrorMessage"));
        
        //return NER errors as part of message as well.
        if(custXRef.getSzErrorFlag().equals("1"))
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", custXRef.getSzErrorMessage()));
            return returnMessages;            
        }
        
        MathNumeric mnAddrNum = custXRef.getMnAddressNumber();
        if(mnAddrNum != null)
        {
            if(mnAddrNum.intValue() == 0)
            {
                custXRef.setSzXrefMode(CustomerMgrTCC.PROCESSING_MODE_ADD);
            }
            else
            {
                custXRef.setSzXrefMode(CustomerMgrTCC.PROCESSING_MODE_CHANGE);
            }
        }

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    public static E1MessageList updateCustomerXrefRecord(IContext context, IConnection connection,
                                                             InternalCustomerXRef custXRef)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        custXRef.setSzXrefMode(CustomerMgrTCC.PROCESSING_MODE_CHANGE);

        // map input parameters from input value object
        bsfnParams.setValue("szCustomerNumberTCC", custXRef.getSzCustomerIdTCC());
        bsfnParams.setValue("mnAddressNumber", custXRef.getMnAddressNumber());
        bsfnParams.setValue("szName", custXRef.getSzCustomerName());
        bsfnParams.setValue("cCallMode", "U");

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();
            //execute business function
            bsfnService.execute(context, connection, "TCC_CustomerAddressXref", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        custXRef.setMnAddressNumber((MathNumeric) bsfnParams.getValue("mnAddressNumber"));
        custXRef.setSzErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        custXRef.setSzErrorMessage((String) bsfnParams.getValue("szErrorMessage"));

        //return NER errors as part of message as well.
        if (custXRef.getSzErrorFlag().equals("1"))
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", custXRef.getSzErrorMessage()));
            return returnMessages;
        }

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
    
    public static E1MessageList getCustomerXrefRecord(IContext context, IConnection connection,
                                                             InternalCustomerXRef custXRef)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        custXRef.setSzXrefMode(CustomerMgrTCC.PROCESSING_MODE_CHANGE);

        // map input parameters from input value object
        bsfnParams.setValue("szCustomerNumberTCC", custXRef.getSzCustomerIdTCC());
        bsfnParams.setValue("mnAddressNumber", custXRef.getMnAddressNumber());
        bsfnParams.setValue("cCallMode", "G");

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();
            //execute business function
            bsfnService.execute(context, connection, "TCC_CustomerAddressXref", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        custXRef.setMnAddressNumber((MathNumeric) bsfnParams.getValue("mnAddressNumber"));
        custXRef.setSzCustomerIdTCC((String)bsfnParams.getValue("szCustomerNumberTCC"));
        custXRef.setSzCustomerName((String) bsfnParams.getValue("szName"));
        custXRef.setSzErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        custXRef.setSzErrorMessage((String) bsfnParams.getValue("szErrorMessage"));

        //return NER errors as part of message as well.
        if (custXRef.getSzErrorFlag().equals("1"))
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", custXRef.getSzErrorMessage()));
            return returnMessages;
        }

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();        
    }

}
