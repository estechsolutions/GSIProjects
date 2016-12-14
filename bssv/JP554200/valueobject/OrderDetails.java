package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderDetails extends ValueObject implements Serializable
{
    private OrderLine[] orderLines = null;

    /**
     * TODO: Default public constructor for instantiating: OrderDetails
     */
    public OrderDetails()
    {
    }

    public void setOrderLines(OrderLine[] orderLines)
    {
        this.orderLines = orderLines;
    }

    public OrderLine[] getOrderLines()
    {
        return orderLines;
    }
}
