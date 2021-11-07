package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Topping implements Toastable {
    private String name;
    protected Toastable toastTopping;
    protected BigDecimal price;
    private List<Topping> toppings = new ArrayList<>();

    public Topping(Toastable toasTopping,String name, BigDecimal price) {
        this.toastTopping = toasTopping;
        toppings.add(this);
        this.name = name;
        this.price = price;
        System.out.println("Topping added: "+name+"\t price:"+price+"\t cost: "+calculatePrice());
    }

    @Override
    public List<Topping> getToppings() {
        if(toastTopping==null){
            List<Topping> toppings =new ArrayList<>();
            toppings.add(this);
            return toppings;
        }
        List<Topping> toppings = toastTopping.getToppings();
        toppings.add(this);
        return toppings;
    }

    @Override
    public BigDecimal calculatePrice() {
        return toastTopping.calculatePrice().add(this.price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
