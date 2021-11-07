package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;

public class Test {
    public static void doAyvalikToast(){
        Toastable ayvalikToast=new ToastBread("Toast Bread", BigDecimal.valueOf(7));
        ayvalikToast=new Cheese(ayvalikToast,"Cheddar cheese",BigDecimal.valueOf(3));
        ayvalikToast=new Tomato(ayvalikToast,"Tomato",BigDecimal.valueOf(2));
        ayvalikToast=new Ketchup(ayvalikToast,"ketchup",BigDecimal.valueOf(1));
        System.out.println("Total Cost: "+ayvalikToast.calculatePrice()+"TL");

    }
    public static void main(String[] args) {
        doAyvalikToast();
    }
}
