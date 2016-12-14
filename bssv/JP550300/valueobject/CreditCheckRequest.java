package tcc.e1.bssv.JP550300.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CreditCheckRequest extends ValueObject implements Serializable
{
    /**
     * TCC Customer ID
     * <p>
     * TODO: Customer number from ATG
     */
    private String customerIdTCC = null;

    /**
     * TODO: Default public constructor for instantiating: CreditCheckRequest
     */
    public CreditCheckRequest()
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
}
