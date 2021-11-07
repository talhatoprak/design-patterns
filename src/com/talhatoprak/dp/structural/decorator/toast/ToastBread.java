package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ToastBread  implements Toastable{
    private String name;
    private BigDecimal price;

    public ToastBread(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        System.out.println("Topping added: "+name+"\t price:"+price+"\t cost: "+calculatePrice());
    }

    @Override
    public BigDecimal calculatePrice() {
        return price;
    }

    @Override
    public List<Topping> getToppings() {
        return new ArrayList<Topping>();
    }
}
