package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CommerceItem extends ValueObject implements Serializable {

    private CommerceItemInfo commerceItemInfo = null;
    
    private ItemPriceInfo itemPriceInfo = null;


    public void setCommerceItemInfo(CommerceItemInfo commerceItemInfo) {
        this.commerceItemInfo = commerceItemInfo;
    }

    public CommerceItemInfo getCommerceItemInfo() {
        return commerceItemInfo;
    }

    public void setItemPriceInfo(ItemPriceInfo itemPriceInfo) {
        this.itemPriceInfo = itemPriceInfo;
    }

    public ItemPriceInfo getItemPriceInfo() {
        return itemPriceInfo;
    }

    /**
     * TODO: Default public constructor for instantiating: CommerceItem
     */
    public CommerceItem() {
    }
}
