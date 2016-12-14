package tcc.e1.bssv.JP550100;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

import tcc.e1.bssv.JP550100.valueobject.Address;
import tcc.e1.bssv.JP550100.valueobject.CustomerReply;
import tcc.e1.bssv.JP550100.valueobject.CustomerRequest;
import tcc.e1.bssv.JP550100.valueobject.EmailDetails;
import tcc.e1.bssv.JP550100.valueobject.PhoneDetails;

public class TestCustomerManagerTCC
{
    public static void main(String[] args)
    {
        CustomerRequest request = new CustomerRequest();
        
        request.setCustomerIdTCC("TCC-2740009");
        request.setFirstName("Sally");
        request.setLastName("Buogery");
        
        Address addr = new Address();
        addr.setAddressLine1("1234 Main Street");
        addr.setCity("Silver Spring");
        addr.setCountry("US");
        addr.setState("MD");
        addr.setZipCode("20903");
        
        request.setHomeAddress(addr);
        request.setShipAddress(addr);
        
        EmailDetails[] emails = new EmailDetails[2];
        emails[0] = new EmailDetails();
        emails[0].setEmailAddress("sometimes@myplace.com");
        emails[0].setEmailType("E");
        emails[0].setDoNotEmail("N");  
        
        emails[1] = new EmailDetails();
        emails[1].setEmailAddress("sometimes@mail.com");
        emails[1].setEmailType("E");
        emails[1].setDoNotEmail("Y");

        request.setCustomerEmails(emails);
        
        PhoneDetails[] phones = new PhoneDetails[2];
        phones[0] = new PhoneDetails();
        phones[0].setPhoneNumber("202-321-1355");
        phones[0].setPhoneType("MOBILE");
        phones[0].setDoNotCall("Y");
        
        phones[1] = new PhoneDetails();
        phones[1].setPhoneNumber("202-434-4142");
        phones[1].setPhoneType("HOME");
        phones[1].setDoNotText("Y");
        
        request.setCustomerPhones(phones);

        try
        {
            CustomerManagerTCC cmtcc = new CustomerManagerTCC();
            CustomerReply reply = cmtcc.addOrUpdateCustomer(request);
            System.out.println("Customer Added or Updated Succesfully");
            System.out.println(reply.getAddressNumber());
        }
        catch(BusinessServiceException exp)
        {
            System.out.println("Some Exception occured");
        }
    }
}
