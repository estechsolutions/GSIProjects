package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ItemPriceInfo extends ValueObject implements Serializable {


    private ItemPrice itemPrice = null;

    public void setItemPrice(ItemPrice itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemPrice getItemPrice() {
        return itemPrice;
    }

    /**
     * TODO: Default public constructor for instantiating: ItemPriceInfo
     */
    public ItemPriceInfo() {
    }
}
