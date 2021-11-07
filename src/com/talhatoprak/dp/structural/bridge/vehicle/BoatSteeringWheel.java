package com.talhatoprak.dp.structural.bridge.vehicle;

public class BoatSteeringWheel implements SteeringWheel{
    @Override
    public void setDirection(int direction) {
        System.out.println("Boat direction set to "+direction);
    }
}
