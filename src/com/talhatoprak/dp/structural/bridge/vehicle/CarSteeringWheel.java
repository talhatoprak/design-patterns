package com.talhatoprak.dp.structural.bridge.vehicle;

public class CarSteeringWheel implements SteeringWheel{
    @Override
    public void setDirection(int direction) {
        System.out.println("Car direction set to "+direction);
    }
}
