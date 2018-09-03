package com.ivanp;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Ivan", 50, "Scythe");

        System.out.println("Initial health is " + player.getHealth());
//        player.loseHealth(-50);
////
////        System.out.println(player.getHealth());
    }
}