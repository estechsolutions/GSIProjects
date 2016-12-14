package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Calendar;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

import tcc.e1.bssv.J5542001.valueobject.InternalSalesOrderHistory_V4211AB;
import tcc.e1.bssv.J5542001.valueobject.InternalSelectResults;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetSalesOrderHistoryReply extends MessageValueObject implements Serializable {

    /**
     * Sales Order Customer Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private String customerNumber = null;

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setSoHistoryDetail(GetSalesOrderHistoryDetail[] soHistoryDetail) {
        this.soHistoryDetail = soHistoryDetail;
    }

    public GetSalesOrderHistoryDetail[] getSoHistoryDetail() {
        return soHistoryDetail;
    }


    private GetSalesOrderHistoryDetail[] soHistoryDetail = null;

    /**
     * TODO: Default public constructor for instantiating: ResponseGetSalesOrderHistory
     */
    public GetSalesOrderHistoryReply() {
    }

    public GetSalesOrderHistoryReply(InternalSalesOrderHistory_V4211AB internalVO){
        ArrayList soHistory = new ArrayList();
        
        if (internalVO.getQueryResults() != null){
            for(int i=0; i<internalVO.getQueryResults().size(); i++){
                InternalSelectResults oneResultHistoryRec = internalVO.getQueryResults(i);
                GetSalesOrderHistoryDetail oneHistoryDetailRec = new GetSalesOrderHistoryDetail();
                oneHistoryDetailRec.setOrderNumberJDE(oneResultHistoryRec.getF4211_DOCO().intValue());
                oneHistoryDetailRec.setCompanyNumberJDE(oneResultHistoryRec.getF4211_KCOO());
                oneHistoryDetailRec.setOrderTypeJDE(oneResultHistoryRec.getF4211_DCTO());
                oneHistoryDetailRec.setLineNumberJDE(oneResultHistoryRec.getF4211_LNID().bigDecimalValue());
                oneHistoryDetailRec.setBranchPlantJDE(oneResultHistoryRec.getF4211_MCU());
                oneHistoryDetailRec.setItemNumberJDE(new Integer(oneResultHistoryRec.getF4211_ITM().intValue()));
                oneHistoryDetailRec.setProductNumberJDE(oneResultHistoryRec.getF4211_LITM());
                oneHistoryDetailRec.setDescriptionItemJDE(oneResultHistoryRec.getF4211_DSC1());
                oneHistoryDetailRec.setAmountExtendedPriceJDE(oneResultHistoryRec.getF4211_AEXP().bigDecimalValue());
                oneHistoryDetailRec.setDateRequestedJDE(oneResultHistoryRec.getF4211_DRQJ());
                oneHistoryDetailRec.setDateTransactionJDE(oneResultHistoryRec.getF4211_TRDJ());
                oneHistoryDetailRec.setSoldToAddressNumberJDE(new Integer(oneResultHistoryRec.getF4211_AN8().intValue()));
                oneHistoryDetailRec.setShipToAddressNumberJDE(new Integer(oneResultHistoryRec.getF4211_SHAN().intValue()));
                
                
                soHistory.add(oneHistoryDetailRec);
                                                                                        
            }
            GetSalesOrderHistoryDetail[] tmpSOHistoryDetail = new GetSalesOrderHistoryDetail[soHistory.size()];
            soHistory.toArray(tmpSOHistoryDetail);
            this.setSoHistoryDetail(tmpSOHistoryDetail);
        }
    }


}
