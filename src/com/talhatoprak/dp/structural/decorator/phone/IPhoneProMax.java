package com.talhatoprak.dp.structural.decorator.phone;

import java.math.BigDecimal;

public class IPhoneProMax extends IPhonePro{
    public IPhoneProMax(Phone phone) {
        super(phone);
    }

    @Override
    public String getName() {
        return super.getName()+" Max";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount()+1;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice()
                .add(BigDecimal.valueOf(100));
    }
}
