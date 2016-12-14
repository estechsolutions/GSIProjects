package tcc.e1.bssv.JP554200;

import java.math.BigDecimal;

import oracle.e1.bssv.JP420000.SalesOrderManager;
import oracle.e1.bssv.JP420000.valueobject.ConfirmSalesOrder;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOCustomer;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetail;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProduct;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeader;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeaderProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSalesOrder;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssv.util.J4100010.valueobject.ItemGroupCustomer;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public class TestSalesOrderManager
{
    protected static String SO_ADD_ACTION = "1";
    protected static String SO_VERSION = "ZJDE0006";
    
    public static void main(String[] args)
    {
        ProcessSalesOrder pso = new ProcessSalesOrder();
        
        //create header
        ProcessSOHeader psoh = new ProcessSOHeader();
        psoh.setBusinessUnit("          30");
        psoh.setCustomerPO("CS0705-001");
        
        //set version and action code
        ProcessSOHeaderProcessing psohp = new ProcessSOHeaderProcessing();
        psohp.setActionType(SO_ADD_ACTION);
        psohp.setProcessingVersion(SO_VERSION);
        psoh.setProcessing(psohp);
        
        //create shipTo
        ProcessSOCustomer shipTo = new ProcessSOCustomer();
        Entity custEntity = new Entity();
        custEntity.setEntityId(60257);
        shipTo.setCustomer(custEntity);
        psoh.setShipTo(shipTo);
        
        //create soldTo
        psoh.setSoldTo(shipTo);
        
        //create detail node
        ProcessSODetail[] lineDetails = new ProcessSODetail[1];
        lineDetails[0] = new ProcessSODetail();
        lineDetails[0].setDocumentLineNumber(new BigDecimal(1));
        
        //set the line action
        ProcessSODetailProcessing psodp = new ProcessSODetailProcessing();
        psodp.setActionType(SO_ADD_ACTION);
        lineDetails[0].setProcessing(psodp);
        
        //set the product information
        ProcessSODetailProduct product = new ProcessSODetailProduct();
        ItemGroupCustomer igc = new ItemGroupCustomer();
        igc.setItemProduct("2200");
        product.setItem(igc);
        lineDetails[0].setProduct(product);
            
        psoh.setDetail(lineDetails);
        
        pso.setHeader(psoh);
        
        try
        {
            SalesOrderManager som = new SalesOrderManager();
            ConfirmSalesOrder cso = som.processSalesOrder(pso);
            
            System.out.println("Success!!");
        }
        catch(BusinessServiceException exp)
        {
            System.out.println("Some Exception Occured!!");
        }
        catch(Exception exp)
        {
            System.out.println("Non BSSV Exception");
        }
    }
}
