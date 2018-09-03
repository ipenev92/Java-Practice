package com.ivanp2;

public class Main {
    public static void main(String[] args) {
        VipCustomer ivan = new VipCustomer();
        VipCustomer navi = new VipCustomer("Navi", 99999.0, "navip");
        VipCustomer vina = new VipCustomer("Vina", "vina");

        System.out.println("***** Ivan *****");
        System.out.println(ivan.getName());
        System.out.println(ivan.getCreditLimit());
        System.out.println(ivan.getEmail());
        System.out.println();

        System.out.println("***** Navi *****");
        System.out.println(navi.getName());
        System.out.println(navi.getCreditLimit());
        System.out.println(navi.getEmail());
        System.out.println();

        System.out.println("***** Vina *****");
        System.out.println(vina.getName());
        System.out.println(vina.getCreditLimit());
        System.out.println(vina.getEmail());
        System.out.println();
    }
}
