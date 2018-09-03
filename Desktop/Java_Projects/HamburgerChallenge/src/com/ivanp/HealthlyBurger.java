package com.ivanp;

public class HealthlyBurger extends BaseHamburger {
    private String healty1Name;
    private double healthy1Price;
    private String healthy2Name;
    private double healthy2Price;

    public HealthlyBurger(String meat, double price) {
        super("Healthy Burger", "Brown rye", meat, price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healty1Name = name;
        this.healthy1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthy2Name = name;
        this.healthy2Price = price;
    }

    @Override
    public double calculatePrice() {
        double hamburgerPrice = super.calculatePrice();
        if (this.healty1Name != null) {
            hamburgerPrice += this.healthy1Price;
            System.out.println("Added " + this.healty1Name + " for an extra " + this.healthy1Price);
        }

        if (this.healthy2Name != null) {
            hamburgerPrice += this.healthy2Price;
            System.out.println("Added " + this.healthy2Name + " for an extra " + this.healthy2Price);
        }

        return hamburgerPrice;
    }
}