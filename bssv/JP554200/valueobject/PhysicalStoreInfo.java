package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PhysicalStoreInfo extends ValueObject implements Serializable {
    public void setPhysicalStoreId(String physicalStoreId) {
        this.physicalStoreId = physicalStoreId;
    }

    public String getPhysicalStoreId() {
        return physicalStoreId;
    }

    public void setCommissionableStoreInfo(CommissionableStoreInfo commissionableStoreInfo) {
        this.commissionableStoreInfo = commissionableStoreInfo;
    }

    public CommissionableStoreInfo getCommissionableStoreInfo() {
        return commissionableStoreInfo;
    }

    /**
     * Physical Store Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String physicalStoreId = null;
    
    private CommissionableStoreInfo commissionableStoreInfo = null;

    /**
     * TODO: Default public constructor for instantiating: PhysicalStoreInfo
     */
    public PhysicalStoreInfo() {
    }
}
