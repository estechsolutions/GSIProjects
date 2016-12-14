package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PaymentInfo extends ValueObject implements Serializable {
    /**
     * Type Credit Card 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String typeCreditCard = null;


    public void setTypeCreditCard(String typeCreditCard) {
        this.typeCreditCard = typeCreditCard;
    }

    public String getTypeCreditCard() {
        return typeCreditCard;
    }


    /**
     * TODO: Default public constructor for instantiating: AgentInfo
     */
    public PaymentInfo() {
    }
}
