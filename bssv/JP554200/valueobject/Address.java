package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Address extends ValueObject implements Serializable
{
    private String address1 = null;
    private String address2 = null;
    private String city = null;
    private String state = null;
    private String zipCode = null;
    private String country = null;

    /**
     * TODO: Default public constructor for instantiating: Address
     */
    public Address()
    {
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getAddress2()
    {
        return address2;
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
}
