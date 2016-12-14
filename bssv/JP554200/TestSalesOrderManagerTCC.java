package tcc.e1.bssv.JP554200;

import java.math.BigDecimal;

import oracle.e1.bssv.JP420000.SalesOrderManager;
import oracle.e1.bssv.JP420000.valueobject.ConfirmSalesOrder;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;

import tcc.e1.bssv.JP554200.valueobject.CommerceItem;
import tcc.e1.bssv.JP554200.valueobject.CommerceItemInfo;
import tcc.e1.bssv.JP554200.valueobject.CommerceItems;
import tcc.e1.bssv.JP554200.valueobject.CreateOrderReply;
import tcc.e1.bssv.JP554200.valueobject.CreateOrderRequest;
import tcc.e1.bssv.JP554200.valueobject.CustomerInfo;
import tcc.e1.bssv.JP554200.valueobject.Entity;
import tcc.e1.bssv.JP554200.valueobject.Item;
import tcc.e1.bssv.JP554200.valueobject.ItemPrice;
import tcc.e1.bssv.JP554200.valueobject.ItemPriceInfo;
import tcc.e1.bssv.JP554200.valueobject.OrderDetails;
import tcc.e1.bssv.JP554200.valueobject.OrderHeader;
import tcc.e1.bssv.JP554200.valueobject.OrderInfo;
import tcc.e1.bssv.JP554200.valueobject.OrderLine;
import tcc.e1.bssv.JP554200.valueobject.PaymentGroups;
import tcc.e1.bssv.JP554200.valueobject.PaymentInfo;
import tcc.e1.bssv.JP554200.valueobject.PhysicalStoreInfo;
import tcc.e1.bssv.JP554200.valueobject.StoreInfo;

public class TestSalesOrderManagerTCC
{
    public static void main(String[] args)
    {
        CreateOrderRequest cor = new CreateOrderRequest();
        
        //create order header
        OrderHeader oh = new OrderHeader();
        OrderInfo of = new OrderInfo();
        of.setOrderId("TCC-1012");
        oh.setOrderInfo(of);
        
        CustomerInfo custInfo = new CustomerInfo();
        custInfo.setTccCustomerId("TCC-2740010");
        oh.setCustomerInfo(custInfo);

        StoreInfo storeInfo = new StoreInfo();
        PhysicalStoreInfo psi = new PhysicalStoreInfo();
        psi.setPhysicalStoreId("100418");
        storeInfo.setPhysicalStoreInfo(psi);
        oh.setStoreInfo(storeInfo);
        
        cor.setOrderHeader(oh);
        
        //create order detail
        CommerceItems od = new CommerceItems();
        CommerceItem[] lineData = new CommerceItem[1];
        lineData[0] = new CommerceItem();
        
        CommerceItemInfo itemInfo = new CommerceItemInfo();
        itemInfo.setSkuId("DEBBSA000052");
        //itemInfo.setSkuId("ACPHAP000970");
  //      itemInfo.setSericalNumber("12345601");
        itemInfo.setQuantity("1");
        lineData[0].setCommerceItemInfo(itemInfo);
        ItemPriceInfo priceInfo = new ItemPriceInfo();
        ItemPrice price = new ItemPrice();
        price.setItemPrice(new BigDecimal(555.00));
        priceInfo.setItemPrice(price);
        lineData[0].setItemPriceInfo(priceInfo);
                
        od.setCommerceItem(lineData);
        cor.setCommerceItems(od);
        
        
 
        
        try
        {
            SalesOrderManagerTCC somTCC = new SalesOrderManagerTCC();
            CreateOrderReply reply = somTCC.createSalesOrder(cor);
            
            System.out.println("Success!!");
            System.out.println("Order Number: "+reply.getOrderNumber());
            System.out.println("Order Company: "+reply.getOrderCompany());
            System.out.println("Order Type: "+reply.getOrderType());
        }
        catch(BusinessServiceException exp)
        {
            System.out.println("Some Exception Occured!!");
            System.out.println(exp.getMessage());
        }
        catch(Exception exp)
        {
            System.out.println("Non BSSV Exception");
        }
    }
}
