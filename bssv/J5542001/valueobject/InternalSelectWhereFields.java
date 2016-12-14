package tcc.e1.bssv.J5542001.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalSelectWhereFields extends ValueObject implements Serializable {


    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric F4211_AN8 = null;



    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_BEGIN_TRDJ = null;


    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_END_TRDJ = null;


    public void setF4211_AN8(MathNumeric F4211_AN8) {
        this.F4211_AN8 = F4211_AN8;
    }

    public MathNumeric getF4211_AN8() {
        return F4211_AN8;
    }

    public void setF4211_BEGIN_TRDJ(Date F4211_BEGIN_TRDJ) {
        this.F4211_BEGIN_TRDJ = F4211_BEGIN_TRDJ;
    }

    public Date getF4211_BEGIN_TRDJ() {
        return F4211_BEGIN_TRDJ;
    }

    public void setF4211_END_TRDJ(Date F4211_END_TRDJ) {
        this.F4211_END_TRDJ = F4211_END_TRDJ;
    }

    public Date getF4211_END_TRDJ() {
        return F4211_END_TRDJ;
    }

 
}
