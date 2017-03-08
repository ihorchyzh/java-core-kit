package com.ihorchyzh.app.classwork.lesson15poly4;

import java.util.Objects;

/**
 * Created by ihorchyzh on 3/6/17.
 */
public class WoodEquals {

    public int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WoodEquals)) {
            return false;
        }
        WoodEquals woodEquals = (WoodEquals) o;
        return quantity == woodEquals.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}
