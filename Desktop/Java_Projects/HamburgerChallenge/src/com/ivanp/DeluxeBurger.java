package com.ivanp;

public class DeluxeBurger extends BaseHamburger {
    public DeluxeBurger() {
        super("Deluxe", "White", "Beef", 10.20);
        super.addHamburgerAddition1("Chips", 1.75);
        super.addHamburgerAddition2("Drinks", .75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add any more additional items.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add any more additional items.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add any more additional items.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add any more additional items.");
    }
}
