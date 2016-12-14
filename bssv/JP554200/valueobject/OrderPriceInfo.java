package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderPriceInfo extends ValueObject implements Serializable {
    /**
     * Currency Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String currencyCode = null;

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * TODO: Default public constructor for instantiating: OrderPriceInfo
     */
    public OrderPriceInfo() {
    }
}
