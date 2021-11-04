package com.talhatoprak.dp.structural.decorator.phone;

import java.math.BigDecimal;

public class IPhone implements Phone{

    @Override
    public String getName() {
        return "Apple IPhone";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(100);
    }
}
