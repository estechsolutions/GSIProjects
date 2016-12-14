package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J5542001.valueobject.InternalSalesOrderHistory_V4211AB;
import tcc.e1.bssv.J5542001.valueobject.InternalSelectWhereFields;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetSalesOrderHistoryRequest extends ValueObject implements Serializable {


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
    private String customerNumber = null;

    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar startDate = null;


    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar endDate = null;

    /**
     * TODO: Default public constructor for instantiating: GetSalesOrderHistoryRequest
     */
    public GetSalesOrderHistoryRequest() {
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public E1MessageList mapFromPublishedVOtoInternalVO(IContext context, IConnection connection, InternalSelectWhereFields queryWhereFields, Integer abNumber){
     E1MessageList messages = new E1MessageList();
        
        queryWhereFields.setF4211_AN8(new MathNumeric(abNumber));
        queryWhereFields.setF4211_BEGIN_TRDJ(this.getStartDate().getTime());
        queryWhereFields.setF4211_END_TRDJ(this.getEndDate().getTime());
     
     return messages;
    }

}
