package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class MiscInfo extends ValueObject implements Serializable {
    /**
     * Default Tax Rate Used
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  1 <br>
     */
    private Boolean defaultTaxRateUsed = null;



    /**
     * CCRS Commission Calculated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  1 <br>
     */
    private Boolean CCRSCommissionCalculated = null;
    /**
     * TODO: Default public constructor for instantiating: MiscInfo
     */
    public MiscInfo() {
    }

    public void setDefaultTaxRateUsed(Boolean defaultTaxRateUsed) {
        this.defaultTaxRateUsed = defaultTaxRateUsed;
    }

    public Boolean getDefaultTaxRateUsed() {
        return defaultTaxRateUsed;
    }

    public void setCCRSCommissionCalculated(Boolean CCRSCommissionCalculated) {
        this.CCRSCommissionCalculated = CCRSCommissionCalculated;
    }

    public Boolean getCCRSCommissionCalculated() {
        return CCRSCommissionCalculated;
    }
}
