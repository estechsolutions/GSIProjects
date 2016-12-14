package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Address extends ValueObject implements Serializable
{
    private String addressLine1 = null;
    private String addressLine2 = null;
    private String city = null;
    private String state = null;
    private String zipCode = null;
    private String country = null;
    private String doNotMail = null;
    
    /**
     * TODO: Default public constructor for instantiating: Address
     */
    public Address()
    {
    }

    public void setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public void setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    public void setDoNotMail(String doNotMail)
    {
        this.doNotMail = doNotMail;
    }

    public String getDoNotMail()
    {
        return doNotMail;
    }
}
