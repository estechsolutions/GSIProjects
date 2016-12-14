package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PhoneDetails extends ValueObject implements Serializable
{
    private String phoneNumber = null;
    private String phoneType = null;
    private String doNotCall = null;
    private String doNotText = null;

    /**
     * TODO: Default public constructor for instantiating: PhoneDetails
     */
    public PhoneDetails()
    {
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneType(String phoneType)
    {
        this.phoneType = phoneType;
    }

    public String getPhoneType()
    {
        return phoneType;
    }

    public void setDoNotCall(String doNotCall)
    {
        this.doNotCall = doNotCall;
    }

    public String getDoNotCall()
    {
        return doNotCall;
    }

    public void setDoNotText(String doNotText)
    {
        this.doNotText = doNotText;
    }

    public String getDoNotText()
    {
        return doNotText;
    }
    
    public String getAreaCodePart()
    {
        if(this.phoneNumber != null)
        {
            return phoneNumber.substring(0,3);
        }
        return "";
    }

    public String getPhoneNumberPart()
    {
        if(this.phoneNumber != null)
        {
            return phoneNumber.substring(3);
        }
        return "";
    }
}
