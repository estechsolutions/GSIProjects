package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CreateOrderRequest extends ValueObject implements Serializable
{
    private OrderHeader orderHeader = null;
    private CommerceItems commerceItems = null;
    private PaymentGroups paymentGroups = null;
    private OrderOptions options = null;

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setCommerceItems(CommerceItems commerceItems) {
        this.commerceItems = commerceItems;
    }

    public CommerceItems getCommerceItems() {
        return commerceItems;
    }

    public void setPaymentGroups(PaymentGroups paymentGroups) {
        this.paymentGroups = paymentGroups;
    }

    public PaymentGroups getPaymentGroups() {
        return paymentGroups;
    }

    public void setOptions(OrderOptions options) {
        this.options = options;
    }

    public OrderOptions getOptions() {
        return options;
    }
}
