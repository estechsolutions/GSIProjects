package tcc.e1.bssv.JP550100.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class VerizonDetails extends ValueObject implements Serializable
{
    private String verizonAccountNumber = null;

    /**
     * TODO: Default public constructor for instantiating: VerizonDetail
     */
    public VerizonDetails()
    {
    }
    
    public void setVerizonAccountNumber(String verizonAccountNumber)
    {
        this.verizonAccountNumber = verizonAccountNumber;
    }

    public String getVerizonAccountNumber()
    {
        return verizonAccountNumber;
    }
}
