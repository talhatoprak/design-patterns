package com.talhatoprak.dp.structural.bridge.vehicle;

public class Test {
    public void vehicleDemo(){
        Vehicle car=new Car(new CarSteeringWheel());
        car.move(20,30);

        Vehicle boat=new Boat(new BoatSteeringWheel());
        boat.move(40,80);
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.vehicleDemo();
    }
}
