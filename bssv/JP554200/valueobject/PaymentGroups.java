package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PaymentGroups extends ValueObject implements Serializable {

    PaymentInfo[] paymentInfo = null;


    public void setPaymentInfo(PaymentInfo[] paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public PaymentInfo[] getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * TODO: Default public constructor for instantiating: PaymentGroups
     */
    public PaymentGroups() {
    }
}
