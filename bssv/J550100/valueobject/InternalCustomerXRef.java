package tcc.e1.bssv.J550100.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.JP550100.valueobject.CustomerRequest;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalCustomerXRef extends ValueObject implements Serializable
{
    private String szCustomerIdTCC = null;
    private String szAccountNumberTCC = null;
    private String szCustomerName = null;
    private String szStoreId = null;
    private MathNumeric mnAddressNumber = null;
    private String szErrorFlag = null;
    private String szErrorMessage = null;
    private String szXrefMode = null;
    
    public InternalCustomerXRef()
    {
    }

    public void loadFromCustomerRequest(CustomerRequest req)
    {
        if(req != null)
        {
            /* Copy string values */
            this.szAccountNumberTCC = req.getAccountNumberTCC();
            this.szCustomerIdTCC = req.getCustomerIdTCC();
            this.szCustomerName = req.getFirstName() + " " + req.getLastName();
            this.szStoreId = req.getStoreId();
        }
    }

    public void setSzXrefMode(String szXrefMode)
    {
        this.szXrefMode = szXrefMode;
    }

    public String getSzXrefMode()
    {
        return szXrefMode;
    }

    public void setSzCustomerIdTCC(String szCustomerIdTCC)
    {
        this.szCustomerIdTCC = szCustomerIdTCC;
    }

    public String getSzCustomerIdTCC()
    {
        return szCustomerIdTCC;
    }

    public void setSzAccountNumberTCC(String szAccountNumberTCC)
    {
        this.szAccountNumberTCC = szAccountNumberTCC;
    }

    public String getSzAccountNumberTCC()
    {
        return szAccountNumberTCC;
    }

    public void setSzCustomerName(String szCustomerName)
    {
        this.szCustomerName = szCustomerName;
    }

    public String getSzCustomerName()
    {
        return szCustomerName;
    }

    public void setSzStoreId(String szStoreId)
    {
        this.szStoreId = szStoreId;
    }

    public String getSzStoreId()
    {
        return szStoreId;
    }

    public void setMnAddressNumber(MathNumeric mnAddressNumber)
    {
        this.mnAddressNumber = mnAddressNumber;
    }

    public MathNumeric getMnAddressNumber()
    {
        return mnAddressNumber;
    }

    public void setSzErrorFlag(String szErrorFlag)
    {
        this.szErrorFlag = szErrorFlag;
    }

    public String getSzErrorFlag()
    {
        return szErrorFlag;
    }

    public void setSzErrorMessage(String szErrorMessage)
    {
        this.szErrorMessage = szErrorMessage;
    }

    public String getSzErrorMessage()
    {
        return szErrorMessage;
    }
}
