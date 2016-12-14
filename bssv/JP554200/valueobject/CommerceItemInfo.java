package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CommerceItemInfo extends ValueObject implements Serializable {
    /**
     * Commerce Line Item Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String commerceLineItemId = null;

    /**
     * SKU Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String skuId = null;

    /**
     * quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String quantity = null;
    
    /**
     * Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String serialNumber = null;

    public void setCommerceLineItemId(String commerceLineItemId) {
        this.commerceLineItemId = commerceLineItemId;
    }

    public String getCommerceLineItemId() {
        return commerceLineItemId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setFulfillmentDate(Calendar fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    public Calendar getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    /**
     * fulfillmentDate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  8 <br>
     */
    private Calendar fulfillmentDate = null;
    
    /**
     * itemStatus
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String itemStatus = null;

    /**
     * TODO: Default public constructor for instantiating: CommerceItemInfo
     */
    public CommerceItemInfo() {
    }
}
