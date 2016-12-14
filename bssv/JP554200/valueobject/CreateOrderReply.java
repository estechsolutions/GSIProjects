package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssv.JP420000.valueobject.ConfirmSOHeader;
import oracle.e1.bssv.JP420000.valueobject.ConfirmSalesOrder;
import oracle.e1.bssv.JP420000.valueobject.SalesOrderKey;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CreateOrderReply extends MessageValueObject implements Serializable
{
    private String orderNumberTCC = null;
    private Integer orderNumber = null;
    private String orderCompany = null;
    private String orderType = null;

    /**
     * TODO: Default public constructor for instantiating: CreateOrderReply
     */
    public CreateOrderReply()
    {
    }

    public void loadOrderReplyData(ConfirmSalesOrder cso)
    {
        if(cso != null)
        {
            ConfirmSOHeader csoh = cso.getHeader();
            if(csoh != null)
            {
                SalesOrderKey sok = csoh.getSalesOrderKey();
                if(sok != null)
                {
                    this.orderNumber = sok.getDocumentNumber();
                    this.orderCompany = sok.getDocumentCompany();
                    this.orderType = sok.getDocumentTypeCode();
                }
            }
        }
    }
    
    public void setOrderNumberTCC(String orderNumberTCC)
    {
        this.orderNumberTCC = orderNumberTCC;
    }

    public String getOrderNumberTCC()
    {
        return orderNumberTCC;
    }

    public void setOrderNumber(Integer orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderCompany(String orderCompany)
    {
        this.orderCompany = orderCompany;
    }

    public String getOrderCompany()
    {
        return orderCompany;
    }

    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }

    public String getOrderType()
    {
        return orderType;
    }
}
