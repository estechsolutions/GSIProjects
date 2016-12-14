package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ItemPrice extends ValueObject implements Serializable {
    /**
     * Item Price
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  19 <br>
     * EnterpriseOne decimal places: 7 <br>
     */
    private BigDecimal itemPrice = null;



    /**
     * Item Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  19 <br>
     * EnterpriseOne decimal places: 7 <br>
     */
    private BigDecimal itemCost = null;

 
    /**
     * Authorization Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  19 <br>
     * EnterpriseOne decimal places: 7 <br>
     */
    private String authCode = null;   
    
 
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthCode() {
        return authCode;
    }
    

    /**
     * TODO: Default public constructor for instantiating: ItemPrice
     */
    public ItemPrice() {
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

}
