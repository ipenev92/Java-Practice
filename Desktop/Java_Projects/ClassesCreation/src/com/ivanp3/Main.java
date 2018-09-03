package com.ivanp3;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(36);
        toyota.accelerate(50);
        toyota.accelerate(20);
        toyota.accelerate(-60);
        toyota.steer(45);
        toyota.accelerate(-10);
    }
}
