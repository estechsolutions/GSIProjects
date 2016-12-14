package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PriceAdjustment extends ValueObject implements Serializable
{
    private String couponCode = null;
    private String promotionId = null;
    private Money discount = null;
    private String discountType = null;
    private String discountReason = null;

    /**
     * TODO: Default public constructor for instantiating: PriceAdjustment
     */
    public PriceAdjustment()
    {
    }

    public void setCouponCode(String couponCode)
    {
        this.couponCode = couponCode;
    }

    public String getCouponCode()
    {
        return couponCode;
    }

    public void setPromotionId(String promotionId)
    {
        this.promotionId = promotionId;
    }

    public String getPromotionId()
    {
        return promotionId;
    }

    public void setDiscount(Money discount)
    {
        this.discount = discount;
    }

    public Money getDiscount()
    {
        return discount;
    }

    public void setDiscountType(String discountType)
    {
        this.discountType = discountType;
    }

    public String getDiscountType()
    {
        return discountType;
    }

    public void setDiscountReason(String discountReason)
    {
        this.discountReason = discountReason;
    }

    public String getDiscountReason()
    {
        return discountReason;
    }
}
