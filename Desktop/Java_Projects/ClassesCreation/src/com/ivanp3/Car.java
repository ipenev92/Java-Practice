package com.ivanp3;

public class Car extends Vehicle {
    private String color;
    private int wheels;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, String color, int wheels, int gears, int doors, boolean isManual) {
        super(name, size);
        this.color = color;
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        moving(speed, direction);
        System.out.println("Car changed velocity " + speed + ", direction " + direction);
    }
}
