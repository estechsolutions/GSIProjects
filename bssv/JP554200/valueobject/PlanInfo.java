package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PlanInfo extends ValueObject implements Serializable
{
    private String planType = null;
    private String planId = null;
    private String planCost = null;
    private String mobileNumber = null;
    private String portIn = null;

    /**
     * TODO: Default public constructor for instantiating: PlanInfo
     */
    public PlanInfo()
    {
    }

    public void setPlanType(String planType)
    {
        this.planType = planType;
    }

    public String getPlanType()
    {
        return planType;
    }

    public void setPlanId(String planId)
    {
        this.planId = planId;
    }

    public String getPlanId()
    {
        return planId;
    }

    public void setPlanCost(String planCost)
    {
        this.planCost = planCost;
    }

    public String getPlanCost()
    {
        return planCost;
    }

    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber()
    {
        return mobileNumber;
    }

    public void setPortIn(String portIn)
    {
        this.portIn = portIn;
    }

    public String getPortIn()
    {
        return portIn;
    }
}
