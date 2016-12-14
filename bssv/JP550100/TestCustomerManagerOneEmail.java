package tcc.e1.bssv.JP550100;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

import tcc.e1.bssv.JP550100.valueobject.Address;
import tcc.e1.bssv.JP550100.valueobject.BusinessDetails;
import tcc.e1.bssv.JP550100.valueobject.CustomerReply;
import tcc.e1.bssv.JP550100.valueobject.CustomerRequest;
import tcc.e1.bssv.JP550100.valueobject.EmailDetails;
import tcc.e1.bssv.JP550100.valueobject.PhoneDetails;

public class TestCustomerManagerOneEmail
{
    public static void main(String[] args)
    {
        CustomerRequest request = new CustomerRequest();
        
        request.setCustomerIdTCC("TCC-2840038");
        request.setFirstName("Sammy");
        request.setLastName("Kranjordy");
        request.setCustomerType("Business");
        
        Address addr = new Address();
        addr.setAddressLine1("1234 Main Street");
        addr.setCity("Silver Spring");
        addr.setCountry("US");
        addr.setState("MD");
        addr.setZipCode("20903");
        
        request.setHomeAddress(addr);
        request.setShipAddress(addr);
        
        EmailDetails[] emails = new EmailDetails[3];
        emails[0] = new EmailDetails();
        emails[0].setEmailAddress("jim@mail.com");
        emails[0].setEmailType("personal");
        emails[0].setDoNotEmail("N");          

        emails[1] = new EmailDetails();
        emails[1].setEmailAddress("SAMK@mail.com");
        emails[1].setEmailType("PERSONAL");
        emails[1].setDoNotEmail("N");

        emails[2] = new EmailDetails();
        emails[2].setEmailAddress("jimwork@mail.com");
        emails[2].setEmailType("work");
        emails[2].setDoNotEmail("N");

        request.setCustomerEmails(emails);
        
        PhoneDetails[] phones = new PhoneDetails[4];

        phones[0] = new PhoneDetails();
        phones[0].setPhoneNumber("202-321-1355");
        phones[0].setPhoneType("M");
        phones[0].setDoNotCall("Y");
        
        phones[1] = new PhoneDetails();
        phones[1].setPhoneNumber("203-434-4142");
        phones[1].setPhoneType("H");
        phones[1].setDoNotText("Y");

        phones[2] = new PhoneDetails();
        phones[2].setPhoneNumber("204-434-4142");
        phones[2].setPhoneType("W");
        phones[2].setDoNotText("Y");

        phones[3] = new PhoneDetails();
        phones[3].setPhoneNumber("205-434-4142");
        phones[3].setPhoneType("F");
        phones[3].setDoNotText("Y");
        
        request.setCustomerPhones(phones);

        BusinessDetails busDetail = new BusinessDetails();
        busDetail.setBusinessName("The Magic Kindom");
        request.setBusinessInfo(busDetail);

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
