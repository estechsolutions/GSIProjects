package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class EmailDetails extends ValueObject implements Serializable
{
    private String emailAddress = null;
    private String emailType = null;
    private String doNotEmail = null;

    /**
     * TODO: Default public constructor for instantiating: EmailDetails
     */
    public EmailDetails()
    {
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailType(String emailType)
    {
        this.emailType = emailType;
    }

    public String getEmailType()
    {
        return emailType;
    }

    public void setDoNotEmail(String doNotEmail)
    {
        this.doNotEmail = doNotEmail;
    }

    public String getDoNotEmail()
    {
        return doNotEmail;
    }
}
