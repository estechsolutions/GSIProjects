package tcc.e1.bssv.JP554200;

import java.math.BigDecimal;

import java.util.ArrayList;

import oracle.e1.bssv.J4100050.ItemSearchQueryProcessor;
import oracle.e1.bssv.J4100050.valueobject.InternalGetItemSearch;
import oracle.e1.bssv.J4100050.valueobject.InternalShowItemSearch;
import oracle.e1.bssv.J4200010.SalesOrderProcessor;
import oracle.e1.bssv.J4200010.valueobject.InternalProcessSalesOrder;
import oracle.e1.bssv.JP420000.SalesOrderManager;
import oracle.e1.bssv.JP420000.valueobject.ConfirmSalesOrder;
import oracle.e1.bssv.JP420000.valueobject.Pricing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOCustomer;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetail;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailBilling;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSODetailProduct;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeader;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeaderBilling;
import oracle.e1.bssv.JP420000.valueobject.ProcessSOHeaderProcessing;
import oracle.e1.bssv.JP420000.valueobject.ProcessSalesOrder;
import oracle.e1.bssv.JP420000.valueobject.UserReservedData;
import oracle.e1.bssv.util.J4100010.valueobject.ItemGroupCustomer;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J550100.CustomerMgrTCC;
import tcc.e1.bssv.J550100.valueobject.InternalCustomerXRef;
import tcc.e1.bssv.J5542001.valueobject.InternalSalesOrderHistory_V4211AB;
import tcc.e1.bssv.JP554200.valueobject.CreateOrderReply;
import tcc.e1.bssv.JP554200.valueobject.CreateOrderRequest;
import tcc.e1.bssv.JP554200.valueobject.Entity;
import tcc.e1.bssv.JP554200.valueobject.GetSalesOrderHistoryReply;
import tcc.e1.bssv.JP554200.valueobject.GetSalesOrderHistoryRequest;
import tcc.e1.bssv.JP554200.valueobject.OrderHeader;
import tcc.e1.bssv.JP554200.valueobject.OrderOptions;
import tcc.e1.bssv.J5542001.InternalSelectSalesOrderHistory;
import tcc.e1.bssv.JP554200.valueobject.CommerceItem;
import tcc.e1.bssv.JP554200.valueobject.PaymentInfo;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class SalesOrderManagerTCC extends PublishedBusinessService
{
    protected static String SO_ADD_ACTION = "1";

    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public SalesOrderManagerTCC()
    {
    }

    /**
     * Published method for createSalesOrder TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected createSalesOrder
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public CreateOrderReply createSalesOrder(CreateOrderRequest vo) throws BusinessServiceException
    {
        return createSalesOrder(null, null, vo);
    }

    /**
     * Protected method for SalesOrderManagerTCC PublishedBusinessService. createSalesOrder will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected CreateOrderReply createSalesOrder(IContext context, IConnection connection,
                                                CreateOrderRequest orderReq) throws BusinessServiceException
    {
        //perform all work within try block, finally will clean up any connections.
        try
        {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "createSalesOrder", orderReq);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            
            
            //Create the standard processSalesOrder value object
            ProcessSalesOrder pso = createProcessSalesOrder(context, connection, orderReq);
            
            //call standard sales order
            ConfirmSalesOrder cso = callStdProcessSalesOrder(context, connection, pso);
            
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors())
            {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            CreateOrderReply confirmVO = new CreateOrderReply();
            confirmVO.setOrderNumberTCC(orderReq.getOrderHeader().getOrderInfo().getOrderId());
            confirmVO.loadOrderReplyData(cso);
            confirmVO.setE1MessageList(messages);

            finishPublishedMethod(context, "createSalesOrder");

            //return outVO, filled with return values and messages
            return confirmVO;
        }
        finally
        {
            //Call close to clean up all remaining connections and resources.
            close(context, "createSalesOrder");
        }
    }


    /**
     * Published method for getSalesOrderHistory TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getSalesOrderHistory
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public GetSalesOrderHistoryReply getSalesOrderHistory(GetSalesOrderHistoryRequest vo)throws BusinessServiceException{
        return getSalesOrderHistory(null, null, vo);
    }


    /**
     * Protected method for SalesOrderManagerTCC PublishedBusinessService. getSalesOrderHistory will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected GetSalesOrderHistoryReply getSalesOrderHistory(IContext context, IConnection connection, GetSalesOrderHistoryRequest historyReq) throws BusinessServiceException {

        //perform all work within try block, finally will clean up any connections.
        try
        {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getSalesOrderHistory", historyReq);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
          
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            InternalSalesOrderHistory_V4211AB internalVO = new InternalSalesOrderHistory_V4211AB();
            
            //TODO: Call the TCC Customer to E1 Addressbook service which will take a string customerNumber and return the Integer ABNumber
            
            //Begin Stub code:
            InternalCustomerXRef custXRef = new InternalCustomerXRef();
            custXRef.setSzCustomerIdTCC(historyReq.getCustomerNumber());
            
            Integer ABNumber = new Integer(0);
            
            try{
                messages.addMessages(CustomerMgrTCC.getCustomerXrefRecord(context, connection, custXRef));
                ABNumber = custXRef.getMnAddressNumber().intValue();
                // Replace logic with the call to the custom service.
               // ABNumber = new Integer(historyReq.getCustomerNumber());
            }catch (Exception exp){
                String error = "Customer Number is invalid please check the value: "+historyReq.getCustomerNumber();
                context.getBSSVLogger().app(context,error);
                throw new BusinessServiceException(error, context);
            }
            
            //End Stub code.
            
            historyReq.mapFromPublishedVOtoInternalVO(context, connection, internalVO.getQueryWhereFields(), ABNumber);
            
            InternalSelectSalesOrderHistory.selectSO_V4211AB(context, connection, internalVO);
            

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors())
            {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            GetSalesOrderHistoryReply confirmVO = new GetSalesOrderHistoryReply(internalVO);
            confirmVO.setE1MessageList(messages);

            finishPublishedMethod(context, "getSalesOrderHistory");

            //return outVO, filled with return values and messages
            return confirmVO;
        }
        finally
        {
            //Call close to clean up all remaining connections and resources.
            close(context, "getSalesOrderHistory");
        }       
    }

    protected InternalCustomerXRef loadAddressXRefData(IContext context, IConnection connection, String refId)
    {
        InternalCustomerXRef xRefData = new InternalCustomerXRef();
        xRefData.setSzCustomerIdTCC(refId);
        xRefData.setSzXrefMode("G");

        CustomerMgrTCC.getCustomerXrefRecord(context, connection, xRefData);
        return xRefData;
    }

    protected ProcessSalesOrder createProcessSalesOrder(IContext context, IConnection connection, CreateOrderRequest custRef)
    {
        ProcessSalesOrder pso = new ProcessSalesOrder();
        
        //create header
        ProcessSOHeader psoh = new ProcessSOHeader();
        OrderHeader oh = custRef.getOrderHeader();
        if(psoh != null && oh != null)
        {
            //load the business unit
            psoh.setBusinessUnit(oh.getStoreInfo().getPhysicalStoreInfo().getPhysicalStoreId());
           
            //load customer PO
            psoh.setCustomerPO(oh.getOrderInfo().getOrderId());
        }
        
        //set version and action code
        ProcessSOHeaderProcessing psohp = new ProcessSOHeaderProcessing();
        if(psohp != null)
        {
            psohp.setActionType(SO_ADD_ACTION);
            OrderOptions options = custRef.getOptions();
            if(options != null)
            {
                psohp.setProcessingVersion(options.getJdeSOVersion());
            }
            psoh.setProcessing(psohp);
        }
        
        //create shipTo
        ProcessSOCustomer shipTo = new ProcessSOCustomer();
        Entity shipToEntity = new Entity(); 
        shipToEntity.setEntityIdTCC(oh.getCustomerInfo().getTccCustomerId());
        if(shipTo != null && shipToEntity != null)
        {
            InternalCustomerXRef xRefShip = loadAddressXRefData(context, connection, shipToEntity.getEntityIdTCC());
            if(xRefShip != null)
            {
                MathNumeric addrNum = xRefShip.getMnAddressNumber();
                oracle.e1.bssv.util.J0100010.valueobject.Entity custEntity = new oracle.e1.bssv.util.J0100010.valueobject.Entity();
                custEntity.setEntityId(addrNum);
                shipTo.setCustomer(custEntity);
                psoh.setShipTo(shipTo);
            }
        }
        
        //create soldTo
        ProcessSOCustomer soldTo = new ProcessSOCustomer();
        Entity soldToEntity = new Entity(); 
        soldToEntity.setEntityIdTCC(oh.getCustomerInfo().getTccCustomerId());
        if(soldTo != null && soldToEntity != null)
        {
            InternalCustomerXRef xRefSold = loadAddressXRefData(context, connection, soldToEntity.getEntityIdTCC());
            if(xRefSold != null)
            {
                MathNumeric addrNum = xRefSold.getMnAddressNumber();
                oracle.e1.bssv.util.J0100010.valueobject.Entity custEntity = new oracle.e1.bssv.util.J0100010.valueobject.Entity();
                custEntity.setEntityId(addrNum);
                soldTo.setCustomer(custEntity);
                psoh.setSoldTo(soldTo);
            }
        }
        
        //determine number of detail nodes
        int lineCount = 0;
        CommerceItem[] orderLines = null;
        if (custRef.getCommerceItems().getCommerceItem() != null){
            lineCount = custRef.getCommerceItems().getCommerceItem().length;     
            orderLines = new CommerceItem[lineCount];
            orderLines = custRef.getCommerceItems().getCommerceItem();
        }
        
        
        /**
        OrderDetails details = custRef.getDetails();
        OrderLine[] orderLines = null;
        if(details != null)
        {
            orderLines = details.getOrderLines();
            if(orderLines != null)
            {
                lineCount = orderLines.length;
            }
        }
        **/
        
        //create detail node
        if(lineCount > 0)
        {
            ProcessSODetail[] lineDetails = new ProcessSODetail[lineCount];
            int x=0;            
            for(x=0; x<lineCount; x++)
            {
                lineDetails[x] = new ProcessSODetail();
                lineDetails[x].setDocumentLineNumber(new BigDecimal(x+1));
                lineDetails[x].setBusinessUnit(oh.getStoreInfo().getPhysicalStoreInfo().getPhysicalStoreId());
                
                //set the line action
                ProcessSODetailProcessing psodp = new ProcessSODetailProcessing();
                psodp.setActionType(SO_ADD_ACTION);
                lineDetails[x].setProcessing(psodp);
                
                
                
                
                //set the product information
                ProcessSODetailProduct product = new ProcessSODetailProduct(); 
                String saleItem = orderLines[x].getCommerceItemInfo().getSkuId();
                if(saleItem != null)
                {
                    lineDetails[x].setQuantityOrdered(new BigDecimal(orderLines[x].getCommerceItemInfo().getQuantity()));
                    ItemGroupCustomer igc = new ItemGroupCustomer();
                    igc.setItemId(new Integer(getItemNumber(context, connection, saleItem)));
                    product.setItem(igc);
                    product.setLotNumber(orderLines[x].getCommerceItemInfo().getSerialNumber());
                    lineDetails[x].setProduct(product);  

                    UserReservedData userReservedData = new UserReservedData();    
                    userReservedData.setUserReservedReference(orderLines[x].getCommerceItemInfo().getCommerceLineItemId());
                    lineDetails[x].setUserReservedData(userReservedData);

                    if (orderLines[x].getCommerceItemInfo().getItemStatus() !=null){
                       if (orderLines[x].getCommerceItemInfo().getItemStatus().trim().equalsIgnoreCase("DELIVERED")){
                            lineDetails[x].setStatusCodeLast("520");
                            lineDetails[x].setStatusCodeNext("520");
                        }
                    }

                    
                    if (orderLines[x].getItemPriceInfo().getItemPrice().getItemPrice() != null){
                        ProcessSODetailBilling billing = new ProcessSODetailBilling();
                        Pricing price = new Pricing();
                        price.setPriceUnitDomestic(orderLines[x].getItemPriceInfo().getItemPrice().getItemPrice());
                        billing.setPricing(price);
                        
                        //  Per Dan 12/7 if CASHPAYMENT then set the Carrrier AN8 to the phsical store id
                        // if (saleItem.trim().equalsIgnoreCase("CASHPAYMENT")){
                        //    oracle.e1.bssv.util.J0100010.valueobject.Entity carrierEntity = new oracle.e1.bssv.util.J0100010.valueobject.Entity();
                        //     carrierEntity.setEntityId(new Integer(oh.getStoreInfo().getPhysicalStoreInfo().getPhysicalStoreId()));
                        //     billing.setCarrier(carrierEntity);
                        // }
                        
                        lineDetails[x].setBilling(billing);
                    }
                    
                }
            }
            
           
            psoh.setDetail(lineDetails);                        
            pso.setHeader(psoh);
        }
        return pso;
    }
    
    
    protected Integer getItemNumber(IContext context, IConnection connection, String LITM) {
        
        //Take the ItemNumber LITM from the CreateOrderRequest and pass it to the J4100050 to return the ITM and use that for the createProcessSalesOrder
        // This is a temp fix until the patch is recieved from Oracle Support 8/30/16 -Eric
                E1MessageList messages = new E1MessageList();
                Integer ITM;
        
                InternalGetItemSearch getItemSearch = new InternalGetItemSearch();
                getItemSearch.setF4101_LITM(LITM);
                messages.addMessages(ItemSearchQueryProcessor.getItemSearch(context, connection, getItemSearch));
                if (messages.hasErrors()){
                    String error = "Failed to find ItemNumber in F4101: "+messages.getMessagesAsString();
                    context.getBSSVLogger().app(context, error);
                    ITM = 0;
                }else{
                    ArrayList aList =  getItemSearch.getQueryResultRecords();
                    InternalShowItemSearch searchItem = (InternalShowItemSearch) aList.get(0);
                    ITM = new Integer(searchItem.getF4101_ITM().intValue()); 
                }
                return ITM;
    }
    
    
    protected ConfirmSalesOrder callStdProcessSalesOrder(IContext context, IConnection connection, ProcessSalesOrder vo) throws BusinessServiceException
    {
        //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
        E1MessageList messages = new E1MessageList();

        // Create a new internal vo based on the published vo passed in.
        InternalProcessSalesOrder internalVO = new InternalProcessSalesOrder();

        //Call routine mapFromPublished that contains entity processor, item processor, formatters and
        //maps values from vo to internalVO.
        messages.addMessages(vo.mapFromPublished(context, connection, internalVO));

        //Call BSSV SalesOrderProcessor passing context and internal VO
        //Add messages returned from BSSV to message list for Published Business Service.
        if (!messages.hasErrors()) 
        {
            messages.addMessages(SalesOrderProcessor.processSalesOrder(context, connection, internalVO));
        }

        //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
        //If messages contains errors, throw the exception
        if (messages.hasErrors()) 
        {
            //get the string representation of all the messages
            String error = messages.getMessagesAsString();
            //Throw new BusinessServiceException
            throw new BusinessServiceException(error, context);
        }

        //Exception was not thrown, so create the confirm VO from internal VO
        ConfirmSalesOrder confirmVO = new ConfirmSalesOrder(internalVO, vo);

        confirmVO.setE1MessageList(messages);
        //return confirmVO, mapped with return values and messages
        return confirmVO;
    }
}
