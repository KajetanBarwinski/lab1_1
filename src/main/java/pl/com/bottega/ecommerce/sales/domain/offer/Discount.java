package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {// discount
    String discountCause;
    BigDecimal discount;

    public Discount() {
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount=discount;
    }

    public void setDiscountCause(String discountCause) {
        this.discountCause=discountCause;
    }
}