package com.talhatoprak.dp.structural.bridge.vehicle;

public class Car extends Vehicle{
    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel=steeringWheel;
    }

    @Override
    void move(int direction, int speed) {
        steeringWheel.setDirection(direction);
    }
}
