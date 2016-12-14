package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Item extends ValueObject implements Serializable
{
    private String itemNumber = null;
    private String serviceInfo = null;
    private String itemType = null;
    private String creditApplicationNumber = null;
    private String verizonOrderId = null;
    private String activationType = null;
    private String contractType = null;
    private String serialNumber = null;
    private String simCardNumber = null;
    private String cpeDevice = null;

    /**
     * TODO: Default public constructor for instantiating: Item
     */
    public Item()
    {
    }

    public void setItemNumber(String itemNumber)
    {
        this.itemNumber = itemNumber;
    }

    public String getItemNumber()
    {
        return itemNumber;
    }

    public void setServiceInfo(String serviceInfo)
    {
        this.serviceInfo = serviceInfo;
    }

    public String getServiceInfo()
    {
        return serviceInfo;
    }

    public void setItemType(String itemType)
    {
        this.itemType = itemType;
    }

    public String getItemType()
    {
        return itemType;
    }

    public void setCreditApplicationNumber(String creditApplicationNumber)
    {
        this.creditApplicationNumber = creditApplicationNumber;
    }

    public String getCreditApplicationNumber()
    {
        return creditApplicationNumber;
    }

    public void setVerizonOrderId(String verizonOrderId)
    {
        this.verizonOrderId = verizonOrderId;
    }

    public String getVerizonOrderId()
    {
        return verizonOrderId;
    }

    public void setActivationType(String activationType)
    {
        this.activationType = activationType;
    }

    public String getActivationType()
    {
        return activationType;
    }

    public void setContractType(String contractType)
    {
        this.contractType = contractType;
    }

    public String getContractType()
    {
        return contractType;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSimCardNumber(String simCardNumber)
    {
        this.simCardNumber = simCardNumber;
    }

    public String getSimCardNumber()
    {
        return simCardNumber;
    }

    public void setCpeDevice(String cpeDevice)
    {
        this.cpeDevice = cpeDevice;
    }

    public String getCpeDevice()
    {
        return cpeDevice;
    }
}
