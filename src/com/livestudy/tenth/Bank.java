package com.livestudy.tenth;

public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public  void deposit(int money) {
        synchronized (this) {
            balance += money;
            System.out.println(money + "원 입금 완료");
            System.out.println("잔고 : " + balance);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void withdraw(int money) {
        synchronized (this) {
            balance -= money;
            System.out.println(money + "원 출금 완료");
            System.out.println("잔고 : " + balance);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
