package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PaymentMethod extends ValueObject implements Serializable
{
    private Money amount = null;
    private String method = null;

    /**
     * TODO: Default public constructor for instantiating: PaymentMethod
     */
    public PaymentMethod()
    {
    }

    public void setAmount(Money amount)
    {
        this.amount = amount;
    }

    public Money getAmount()
    {
        return amount;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public String getMethod()
    {
        return method;
    }
}
