package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class StoreInfo extends ValueObject implements Serializable {

    private PhysicalStoreInfo physicalStoreInfo = null;

    /**
     * TODO: Default public constructor for instantiating: StoreInfo
     */
    public StoreInfo() {
    }

    public void setPhysicalStoreInfo(PhysicalStoreInfo physicalStoreInfo) {
        this.physicalStoreInfo = physicalStoreInfo;
    }

    public PhysicalStoreInfo getPhysicalStoreInfo() {
        return physicalStoreInfo;
    }
}
