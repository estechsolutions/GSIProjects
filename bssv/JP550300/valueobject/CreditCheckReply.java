package tcc.e1.bssv.JP550300.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssv.JP010020.valueobject.ShowCustomerCreditInformation;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CreditCheckReply extends MessageValueObject implements Serializable
{
    /**
     * TCC Customer ID
     * <p>
     * TODO: Customer number from ATG
     */
    private String customerIdTCC = null;
    private BigDecimal accountTotalCredit = null;
    private BigDecimal accountCreditBalance = null;
    private BigDecimal accountPurchaseOnCredit = null;
    
    /**
     * TODO: Default public constructor for instantiating: CreditCheckReply
     */
    public CreditCheckReply()
    {
    }
    
    public CreditCheckReply(ShowCustomerCreditInformation scci)
    {
        if(scci != null)
        {
            this.accountPurchaseOnCredit = scci.getAmountTotalExposure();
            this.accountTotalCredit = scci.getAmountCreditLimit();
            if(this.accountTotalCredit != null && this.accountPurchaseOnCredit != null)
            {
                this.accountCreditBalance = this.accountTotalCredit.subtract(this.accountPurchaseOnCredit);
            }
        }
    }

    public void setCustomerIdTCC(String customerIdTCC)
    {
        this.customerIdTCC = customerIdTCC;
    }

    public String getCustomerIdTCC()
    {
        return customerIdTCC;
    }

    public void setAccountTotalCredit(BigDecimal accountTotalCredit)
    {
        this.accountTotalCredit = accountTotalCredit;
    }

    public BigDecimal getAccountTotalCredit()
    {
        return accountTotalCredit;
    }

    public void setAccountCreditBalance(BigDecimal accountCreditBalance)
    {
        this.accountCreditBalance = accountCreditBalance;
    }

    public BigDecimal getAccountCreditBalance()
    {
        return accountCreditBalance;
    }

    public void setAccountPurchaseOnCredit(BigDecimal accountPurchaseOnCredit)
    {
        this.accountPurchaseOnCredit = accountPurchaseOnCredit;
    }

    public BigDecimal getAccountPurchaseOnCredit()
    {
        return accountPurchaseOnCredit;
    }
}
