package com.ivanp;

public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("case model", "ASUS", "powersupply", new Dimensions(20, 50, 5));
        Monitor monitor = new Monitor("27 inch", "DELL", 27, new Resolution(20, 50));
        Motherboard motherboard = new Motherboard("mb model", "mb manufacturer", 5, 6, "bios2018");
        Keyboard keyboard = new Keyboard("kb model", "kb mf", new Info("black", 27));
        Mouse mouse = new Mouse("mouse model", "mouse manufacturer");

        PC pc = new PC(theCase, monitor, motherboard, mouse, keyboard);

        System.out.println("Case: ");
        System.out.println("Model: " +  pc.getTheCase().getModel());
        System.out.println("Manu: " + pc.getTheCase().getManufacturer());
        pc.getTheCase().pressPowerButton();
        System.out.println(" ");
        System.out.println("Motherboard:");
        System.out.println("Model: " + pc.getMotherboard().getModel());
        pc.getMotherboard().loadProgram("Windows 10");
        System.out.println(" ");
        System.out.println("Monitor:");
        System.out.println("Model: " + pc.getMonitor().getModel());
        pc.getMonitor().drawPixelAt(50, 20, "red");
        System.out.println(" ");
        System.out.println("Mouse:");
        System.out.println("Model: " + pc.getMouse().getModel());
        pc.getMouse().click("right");
        pc.getMouse().click("forward");
        System.out.println(" ");
        System.out.println("Keyboard");
        System.out.println("Manu: " + pc.getKeyboard().getManufacturer());
        System.out.println("Color: " + pc.getKeyboard().getInfo().getColor());
        pc.getKeyboard().type("this was very long, but satisfying.");

        // using a private method (calling public powerUp(), which calls private drawLogo()
        System.out.println("******");
        pc.powerUp();
        System.out.println("******");
    }
}
