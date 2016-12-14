package tcc.e1.bssv.JP554200;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import tcc.e1.bssv.JP554200.valueobject.GetSalesOrderHistoryDetail;
import tcc.e1.bssv.JP554200.valueobject.GetSalesOrderHistoryReply;
import tcc.e1.bssv.JP554200.valueobject.GetSalesOrderHistoryRequest;

public class TestGetSalesOrderHistory {
    public static void main(String[] args) {


        GetSalesOrderHistoryRequest req = new GetSalesOrderHistoryRequest();
        
        try{
        String bdate = "05/01/2017";
        String edate = "07/01/2017";    
        DateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
       
        Date beginDate = fmt.parse(bdate);
        Date endDate = fmt.parse(edate);
            
        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.setTime(beginDate);
        
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        
        System.out.println("This is the begin Date: "+fmt.format(beginCalendar.getTime()));    
        System.out.println("This is the end Date: "+fmt.format(endCalendar.getTime()));    
            
      
        
        req.setCustomerNumber("TCC-2740001");
        req.setStartDate(beginCalendar);
        req.setEndDate(endCalendar);

        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }

        
        GetSalesOrderHistoryReply reply = new GetSalesOrderHistoryReply();
        
        SalesOrderManagerTCC mgr = new SalesOrderManagerTCC();
        
        try{
            reply = mgr.getSalesOrderHistory(req);
            System.out.println("Successfully Called the Internal Service");
            System.out.println("Total Number of records returned: "+reply.getSoHistoryDetail().length);
            
            GetSalesOrderHistoryDetail detail[] = new GetSalesOrderHistoryDetail[reply.getSoHistoryDetail().length];
            detail = reply.getSoHistoryDetail();
            for(int i=0; i<detail.length; i++){
                System.out.print(detail[i].getOrderNumberJDE()+"\t");
                System.out.print(detail[i].getItemNumberJDE()+"\t");
                System.out.println(detail[i].getDescriptionItemJDE());
            }
            
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }
        
    }
}
