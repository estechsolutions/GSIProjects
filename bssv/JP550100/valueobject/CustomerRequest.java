package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CustomerRequest extends ValueObject implements Serializable
{
    private String customerIdTCC = null;
    private String accountNumberTCC = null;
    private Calendar dateOfBirth = null;
    private String firstName = null;
    private String lastName = null;
    private String employerName = null;
    private String jobTitle = null;
    private Calendar lastActivityDate = null;
    private Calendar lastPurchaseDate = null;
    private String login = null;
    private Calendar registrationDate = null;
    private String customerType = null;
    private String notes = null;
    private String employeeId = null;
    private String storeId = null;
    
    /* Address information */
    private Address homeAddress = null;
    private Address shipAddress = null;
    
    /* Verizon account numbers */
    private VerizonDetails verizonInfo = null;
    
    /* Customer email data */
    private EmailDetails customerEmails[] = null;
    
    /* Phone information */
    private PhoneDetails customerPhones[] = null;
    
    /* Business Details */
    private BusinessDetails businessInfo = null;

    /**
     * TODO: Default public constructor for instantiating: CustomerRequest
     */
    public CustomerRequest()
    {
    }

    public void setCustomerIdTCC(String customerIdTCC)
    {
        this.customerIdTCC = customerIdTCC;
    }

    public String getCustomerIdTCC()
    {
        return customerIdTCC;
    }

    public void setAccountNumberTCC(String accountNumberTCC)
    {
        this.accountNumberTCC = accountNumberTCC;
    }

    public String getAccountNumberTCC()
    {
        return accountNumberTCC;
    }

    public void setDateOfBirth(Calendar dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public Calendar getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setEmployerName(String employerName)
    {
        this.employerName = employerName;
    }

    public String getEmployerName()
    {
        return employerName;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setLastActivityDate(Calendar lastActivityDate)
    {
        this.lastActivityDate = lastActivityDate;
    }

    public Calendar getLastActivityDate()
    {
        return lastActivityDate;
    }

    public void setLastPurchaseDate(Calendar lastPurchaseDate)
    {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public Calendar getLastPurchaseDate()
    {
        return lastPurchaseDate;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getLogin()
    {
        return login;
    }

    public void setRegistrationDate(Calendar registrationDate)
    {
        this.registrationDate = registrationDate;
    }

    public Calendar getRegistrationDate()
    {
        return registrationDate;
    }

    public void setCustomerType(String customerType)
    {
        this.customerType = customerType;
    }

    public String getCustomerType()
    {
        return customerType;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setStoreId(String storeId)
    {
        this.storeId = storeId;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public void setHomeAddress(Address homeAddress)
    {
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress()
    {
        return homeAddress;
    }

    public void setShipAddress(Address shipAddress)
    {
        this.shipAddress = shipAddress;
    }

    public Address getShipAddress()
    {
        return shipAddress;
    }

    public void setVerizonInfo(VerizonDetails verizonInfo)
    {
        this.verizonInfo = verizonInfo;
    }

    public VerizonDetails getVerizonInfo()
    {
        return verizonInfo;
    }

    public void setCustomerEmails(EmailDetails[] customerEmails)
    {
        this.customerEmails = customerEmails;
    }

    public EmailDetails[] getCustomerEmails()
    {
        return customerEmails;
    }

    public void setCustomerPhones(PhoneDetails[] customerPhones)
    {
        this.customerPhones = customerPhones;
    }

    public PhoneDetails[] getCustomerPhones()
    {
        return customerPhones;
    }

    public void setBusinessInfo(BusinessDetails businessInfo)
    {
        this.businessInfo = businessInfo;
    }

    public BusinessDetails getBusinessInfo()
    {
        return businessInfo;
    }
}
