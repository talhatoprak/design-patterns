package com.talhatoprak.dp.structural.bridge.vehicle;

public class Boat extends Vehicle{
    public Boat(SteeringWheel steeringWheel) {
        this.steeringWheel=steeringWheel;
    }

    @Override
    void move(int direction, int speed) {
        steeringWheel.setDirection(direction);
    }
}
