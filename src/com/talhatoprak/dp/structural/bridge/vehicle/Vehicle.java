package com.talhatoprak.dp.structural.bridge.vehicle;

public abstract class Vehicle {
    SteeringWheel steeringWheel;
    abstract void move(int direction, int speed);
}
