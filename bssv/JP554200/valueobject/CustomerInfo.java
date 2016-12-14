package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CustomerInfo extends ValueObject implements Serializable {
    /**
     * TCC Customer Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String tccCustomerId = null;

    public void setTccCustomerId(String tccCustomerId) {
        this.tccCustomerId = tccCustomerId;
    }

    public String getTccCustomerId() {
        return tccCustomerId;
    }

    /**
     * TODO: Default public constructor for instantiating: CustomerInfo
     */
    public CustomerInfo() {
    }
}
