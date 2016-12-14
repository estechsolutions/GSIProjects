package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CustomerReply extends MessageValueObject implements Serializable
{
    private String customerIdTCC = null;
    private Integer addressNumber = null;
    private String errorFlag = null;
    private String errorMessage = null;

    /**
     * TODO: Default public constructor for instantiating: CustomerReply
     */
    public CustomerReply()
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

    public void setAddressNumber(Integer addressNumber)
    {
        this.addressNumber = addressNumber;
    }

    public Integer getAddressNumber()
    {
        return addressNumber;
    }

    public void setErrorFlag(String errorFlag)
    {
        this.errorFlag = errorFlag;
    }

    public String getErrorFlag()
    {
        return errorFlag;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }
}
