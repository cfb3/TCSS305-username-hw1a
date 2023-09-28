
package model;

import java.math.BigDecimal;


public final class StoreItem implements Item {


    public StoreItem(final String name, final BigDecimal price) {

    }

    public StoreItem(final String name, final BigDecimal price, final int bq,
                     final BigDecimal bp) {
    }


    public String getName() {
        return null;
    }


    public BigDecimal getPrice() {
        return null;
    }


    public int getBulkQuantity() {
        return 0;
    }


    public BigDecimal getBulkPrice() {
        return null;
    }


    public boolean isBulk() {
        return false;
    }

    public String toString() {
        return null;
    }

}
