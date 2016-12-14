package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderHeader extends ValueObject implements Serializable
{
    
    private OrderInfo orderInfo = null;
    private AgentInfo agentInfo = null;
    private StoreInfo storeInfo= null;
    private CustomerInfo customerInfo = null;
    private MiscInfo miscInfo = null;
    private OrderPriceInfo orderPriceInfo = null;


    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    public void setStoreInfo(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    public StoreInfo getStoreInfo() {
        return storeInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setMiscInfo(MiscInfo miscInfo) {
        this.miscInfo = miscInfo;
    }

    public MiscInfo getMiscInfo() {
        return miscInfo;
    }

    public void setOrderPriceInfo(OrderPriceInfo orderPriceInfo) {
        this.orderPriceInfo = orderPriceInfo;
    }

    public OrderPriceInfo getOrderPriceInfo() {
        return orderPriceInfo;
    }

}
