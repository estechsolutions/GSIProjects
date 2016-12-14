package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

import tcc.e1.bssv.J5542001.valueobject.InternalSalesOrderHistory_V4211AB;
import tcc.e1.bssv.J5542001.valueobject.InternalSelectResults;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetSalesOrderHistoryDetail extends ValueObject implements Serializable {


    /** Specific Fields Required by the ATG System
     *  Per Response Document 
     * 
    */

    String id = null;
    
    String createdByOrderId = null;
    
    String storeId = null;
    
    String storeName = null;
    
    String completedDate = null;
    
    String agendId = null;
    
    String commissionableAgentId = null;
    
    String agentName = null;
    
    String commissionableAgentName = null;
    
    BigDecimal orderPriceInfoTotal = null;
    
    String specialInstructions = null;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCreatedByOrderId(String createdByOrderId) {
        this.createdByOrderId = createdByOrderId;
    }

    public String getCreatedByOrderId() {
        return createdByOrderId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setAgendId(String agendId) {
        this.agendId = agendId;
    }

    public String getAgendId() {
        return agendId;
    }

    public void setCommissionableAgentId(String commissionableAgentId) {
        this.commissionableAgentId = commissionableAgentId;
    }

    public String getCommissionableAgentId() {
        return commissionableAgentId;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setCommissionableAgentName(String commissionableAgentName) {
        this.commissionableAgentName = commissionableAgentName;
    }

    public String getCommissionableAgentName() {
        return commissionableAgentName;
    }

    public void setOrderPriceInfoTotal(BigDecimal orderPriceInfoTotal) {
        this.orderPriceInfoTotal = orderPriceInfoTotal;
    }

    public BigDecimal getOrderPriceInfoTotal() {
        return orderPriceInfoTotal;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /***************************End ATG FIELDS ****************************************/

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String companyNumberJDE = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer orderNumberJDE = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderTypeJDE = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal lineNumberJDE = null;


    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String branchPlantJDE = null;


    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer soldToAddressNumberJDE = null;

    /**
     * Address Number - Ship To
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SHAN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer shipToAddressNumberJDE = null;

    /**
     * Date - Requested
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateRequestedJDE = null;

    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateTransactionJDE = null;

 
    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer itemNumberJDE = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String productNumberJDE = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String descriptionItemJDE = null;


    /**
     * Amount - Extended Price
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AEXP <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal amountExtendedPriceJDE = null;

    /**
     * TODO: Default public constructor for instantiating: ResponseGetSalesOrderHistory
     */
    public GetSalesOrderHistoryDetail() {
    }


    public void setCompanyNumberJDE(String companyNumberJDE) {
        this.companyNumberJDE = companyNumberJDE;
    }

    public String getCompanyNumberJDE() {
        return companyNumberJDE;
    }

    public void setOrderNumberJDE(Integer orderNumberJDE) {
        this.orderNumberJDE = orderNumberJDE;
    }

    public Integer getOrderNumberJDE() {
        return orderNumberJDE;
    }

    public void setOrderTypeJDE(String orderTypeJDE) {
        this.orderTypeJDE = orderTypeJDE;
    }

    public String getOrderTypeJDE() {
        return orderTypeJDE;
    }

    public void setLineNumberJDE(BigDecimal lineNumberJDE) {
        this.lineNumberJDE = lineNumberJDE;
    }

    public BigDecimal getLineNumberJDE() {
        return lineNumberJDE;
    }

    public void setBranchPlantJDE(String branchPlantJDE) {
        this.branchPlantJDE = branchPlantJDE;
    }

    public String getBranchPlantJDE() {
        return branchPlantJDE;
    }


    public void setSoldToAddressNumberJDE(Integer soldToAddressNumberJDE) {
        this.soldToAddressNumberJDE = soldToAddressNumberJDE;
    }

    public Integer getSoldToAddressNumberJDE() {
        return soldToAddressNumberJDE;
    }

    public void setShipToAddressNumberJDE(Integer shipToAddressNumberJDE) {
        this.shipToAddressNumberJDE = shipToAddressNumberJDE;
    }

    public Integer getShipToAddressNumberJDE() {
        return shipToAddressNumberJDE;
    }

    public void setItemNumberJDE(Integer itemNumberJDE) {
        this.itemNumberJDE = itemNumberJDE;
    }

    public Integer getItemNumberJDE() {
        return itemNumberJDE;
    }

    public void setProductNumberJDE(String productNumberJDE) {
        this.productNumberJDE = productNumberJDE;
    }

    public String getProductNumberJDE() {
        return productNumberJDE;
    }

    public void setDescriptionItemJDE(String descriptionItemJDE) {
        this.descriptionItemJDE = descriptionItemJDE;
    }

    public String getDescriptionItemJDE() {
        return descriptionItemJDE;
    }

    public void setAmountExtendedPriceJDE(BigDecimal amountExtendedPriceJDE) {
        this.amountExtendedPriceJDE = amountExtendedPriceJDE;
    }

    public BigDecimal getAmountExtendedPriceJDE() {
        return amountExtendedPriceJDE;
    }


    public void setDateRequestedJDE(Calendar dateRequested){
        this.dateRequestedJDE = dateRequested;
    }
    
    public void setDateRequestedJDE(Date dateRequestedJulian){
        if(dateRequestedJulian != null){
            Calendar requestDate = Calendar.getInstance();
            requestDate.setTime(dateRequestedJulian);
            this.dateRequestedJDE = requestDate;
        }
    }

    public Calendar getDateRequestedJDE() {
        return dateRequestedJDE;
    }

    public void setDateTransactionJDE(Calendar dateTransactionJulian) {
        this.dateTransactionJDE = dateTransactionJulian;
    }

    public void setDateTransactionJDE(Date dateTransactionJulian) {
        if (dateTransactionJulian != null){
            Calendar transDate = Calendar.getInstance();
            transDate.setTime(dateTransactionJulian);
            this.dateTransactionJDE = transDate;
        }
        
    }

    public Calendar getDateTransactionJDE() {
        return dateTransactionJDE;
    }

}
