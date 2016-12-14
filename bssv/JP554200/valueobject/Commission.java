package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Commission extends ValueObject implements Serializable
{
    private String commissionType = null;
    private Money commissionAmount = null;
    /**
     * TODO: Default public constructor for instantiating: Commission
     */
    public Commission()
    {
    }

    public void setCommissionType(String commissionType)
    {
        this.commissionType = commissionType;
    }

    public String getCommissionType()
    {
        return commissionType;
    }

    public void setCommissionAmount(Money commissionAmount)
    {
        this.commissionAmount = commissionAmount;
    }

    public Money getCommissionAmount()
    {
        return commissionAmount;
    }
}
