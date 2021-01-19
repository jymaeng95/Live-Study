package com.livestudy.tenth;

public class ATM {
    public static void main(String[] args) {
        Bank bank = new Bank(0);
        Thread person1 = new Thread(() -> {
            bank.deposit(5000);
        });

        Thread person2 = new Thread(() ->{
           bank.withdraw(1000);
        });

        person1.start();
        person2.start();;
    }
}
