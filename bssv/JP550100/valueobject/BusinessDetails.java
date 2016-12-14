package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BusinessDetails extends ValueObject implements Serializable
{
    private String businessName = null;
    private String taxExemptNumber = null;
    private String authorizedUsers[] = null;
    private String userName = null;

    /**
     * TODO: Default public constructor for instantiating: BusinessDetails
     */
    public BusinessDetails()
    {
    }

    public void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public void setTaxExemptNumber(String taxExemptNumber)
    {
        this.taxExemptNumber = taxExemptNumber;
    }

    public String getTaxExemptNumber()
    {
        return taxExemptNumber;
    }

    public void setAuthorizedUsers(String[] authorizedUsers)
    {
        this.authorizedUsers = authorizedUsers;
    }

    public String[] getAuthorizedUsers()
    {
        return authorizedUsers;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }
}
