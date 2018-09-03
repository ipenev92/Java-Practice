package com.ivanp;

public class Main {
    public static void main(String[] args) {
        System.out.println("BaseHamburger tests:");
        BaseHamburger hamburger = new BaseHamburger("Basic", "White", "Beef", 8.70);
        hamburger.calculatePrice();
        hamburger.addHamburgerAddition1("Tomato", 0.24);
        hamburger.addHamburgerAddition2("Bacon", 0.75);
        hamburger.addHamburgerAddition3("Lettuce", 1.05);
        hamburger.addHamburgerAddition4("Cheese", 2.21);
        System.out.println("Total Burger price " + hamburger.calculatePrice());

        System.out.println("*************");

        System.out.println("HealthyBurger tests:");
        HealthlyBurger hburger = new HealthlyBurger("Chicken", 7.50);
        hburger.calculatePrice();
        hburger.addHamburgerAddition1("Tomato", 0.24);
        hburger.addHamburgerAddition2("Bacon", 0.75);
        hburger.addHamburgerAddition3("Lettuce", 1.05);
        hburger.addHamburgerAddition4("Cheese", 2.21);
        hburger.addHealthyAddition1("Carrot", 0.27);
        hburger.addHealthyAddition2("More cheese", 2.07);
        System.out.println("Total HealthyBurger price: " + hburger.calculatePrice());

        System.out.println("*************");

        System.out.println("DeluxeBurger tests");
        DeluxeBurger dburger = new DeluxeBurger();
        dburger.calculatePrice();
        dburger.addHamburgerAddition3("Shouldn't let me add this", 0.01);
        System.out.println("Total DeluxeBurger price: " + dburger.calculatePrice());
    }
}
