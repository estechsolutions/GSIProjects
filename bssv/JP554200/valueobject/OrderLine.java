package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderLine extends ValueObject implements Serializable
{
    private Item product;
    private BigDecimal productQuantity;
    private Money productUnitPrice = null;
    private Money totalDiscounts = null;
    private Money salePrice = null;
    private TaxInfo saleTax = null;
    private Money shipPrice = null;
    private TaxInfo shipTax = null;
    private PriceAdjustment[] adjustments = null;
    private PlanInfo planDetails = null;
    private Commission[] verizonCommissions = null;

    /**
     * TODO: Default public constructor for instantiating: OrderLine
     */
    public OrderLine()
    {
    }

    public void setProduct(Item product)
    {
        this.product = product;
    }

    public Item getProduct()
    {
        return product;
    }

    public void setProductQuantity(BigDecimal productQuantity)
    {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getProductQuantity()
    {
        return productQuantity;
    }

    public void setProductUnitPrice(Money productUnitPrice)
    {
        this.productUnitPrice = productUnitPrice;
    }

    public Money getProductUnitPrice()
    {
        return productUnitPrice;
    }

    public void setTotalDiscounts(Money totalDiscounts)
    {
        this.totalDiscounts = totalDiscounts;
    }

    public Money getTotalDiscounts()
    {
        return totalDiscounts;
    }

    public void setSalePrice(Money salePrice)
    {
        this.salePrice = salePrice;
    }

    public Money getSalePrice()
    {
        return salePrice;
    }

    public void setSaleTax(TaxInfo saleTax)
    {
        this.saleTax = saleTax;
    }

    public TaxInfo getSaleTax()
    {
        return saleTax;
    }

    public void setShipPrice(Money shipPrice)
    {
        this.shipPrice = shipPrice;
    }

    public Money getShipPrice()
    {
        return shipPrice;
    }

    public void setShipTax(TaxInfo shipTax)
    {
        this.shipTax = shipTax;
    }

    public TaxInfo getShipTax()
    {
        return shipTax;
    }

    public void setAdjustments(PriceAdjustment[] adjustments)
    {
        this.adjustments = adjustments;
    }

    public PriceAdjustment[] getAdjustments()
    {
        return adjustments;
    }

    public void setPlanDetails(PlanInfo planDetails)
    {
        this.planDetails = planDetails;
    }

    public PlanInfo getPlanDetails()
    {
        return planDetails;
    }

    public void setVerizonCommissions(Commission[] verizonCommissions)
    {
        this.verizonCommissions = verizonCommissions;
    }

    public Commission[] getVerizonCommissions()
    {
        return verizonCommissions;
    }
}
