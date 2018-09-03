package com.ivanp;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("4010 4010 0602 1202", 652.0,
                "Ivan Penev", "ipenev@apsl.net", "692141064");

        account.setBalance(5120.5);

        System.out.println(account.getBalance());
        account.depositFunds(500);
        account.withdrawFunds(1000);
        account.withdrawFunds(200);
    }
}
