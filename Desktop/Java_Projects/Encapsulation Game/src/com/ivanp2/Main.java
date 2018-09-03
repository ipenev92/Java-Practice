package com.ivanp2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        Printer printer2 = new Printer(50, false);

        System.out.println(printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
        pagesPrinted = printer.printPages(7);
        System.out.println(printer.getPagesPrinted());

        System.out.println(" ");
        System.out.println("*****");
        System.out.println(" ");

        System.out.println(printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(4);
        System.out.println(printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(7);
        System.out.println(printer2.getPagesPrinted());
    }
}
