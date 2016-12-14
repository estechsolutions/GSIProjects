package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CommerceItems extends ValueObject implements Serializable {

    private CommerceItem[] commerceItem = null;

    public void setCommerceItem(CommerceItem[] commerceItem) {
        this.commerceItem = commerceItem;
    }

    public CommerceItem[] getCommerceItem() {
        return commerceItem;
    }

    /**
     * TODO: Default public constructor for instantiating: CommerceItems
     */
    public CommerceItems() {
    }
}
