package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Money extends ValueObject implements Serializable
{
    private String currencyCode = null;
    private BigDecimal amount = null;
    
    /**
     * TODO: Default public constructor for instantiating: Money
     */
    public Money()
    {
    }

    public void setCurrencyCode(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }
}
