package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CommissionableStoreInfo extends ValueObject implements Serializable {
    /**
     * Contact Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String commissionableStoreId = null;

    public void setCommissionableStoreId(String commissionableStoreId) {
        this.commissionableStoreId = commissionableStoreId;
    }

    public String getCommissionableStoreId() {
        return commissionableStoreId;
    }

    /**
     * TODO: Default public constructor for instantiating: CommissionableStoreInfo
     */
    public CommissionableStoreInfo() {
    }
}
