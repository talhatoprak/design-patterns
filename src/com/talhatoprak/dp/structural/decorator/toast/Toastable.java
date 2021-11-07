package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;
import java.util.List;

public interface Toastable {
    BigDecimal calculatePrice();
    List<Topping> getToppings();
}
