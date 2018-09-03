package com.ivanp3;

public class Toyota extends Car {
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Toyota", "4WD", "red", 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        System.out.println("New velocity: " + newVelocity);

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity >= 20 && newVelocity <= 35) {
            changeGear(2);
        } else if (newVelocity >= 35 && newVelocity <= 50) {
            changeGear(3);
        } else if (newVelocity >= 50 && newVelocity <= 65) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
