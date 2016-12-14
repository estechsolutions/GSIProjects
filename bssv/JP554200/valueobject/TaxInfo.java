package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class TaxInfo extends ValueObject implements Serializable
{
    private String state = null;
    private Money amount = null;

    /**
     * TODO: Default public constructor for instantiating: TaxInfo
     */
    public TaxInfo()
    {
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public void setAmount(Money amount)
    {
        this.amount = amount;
    }

    public Money getAmount()
    {
        return amount;
    }
}
