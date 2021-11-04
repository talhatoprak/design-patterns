package com.talhatoprak.dp.structural.decorator.coffeshop;

public class CoffeShopTest {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        Coffee colombian = new ColombianCoffee();

        System.out.println(String.format("Order is ready\n- %s: %.2f\n- %s: %.2f\nTotal: %.2f",
                latte.getName(),
                latte.getPrice(),
                colombian.getName(),
                colombian.getPrice(),
                latte.getPrice().add(colombian.getPrice())));

    }
}
