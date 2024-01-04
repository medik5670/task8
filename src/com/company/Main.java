package com.company;

public class Main {

    public static void main(String[] args) {
        int initialАmount = 100;
        int checksum = 1000;
        int accountReplenishment;
        int bonusReceived;
        int finalScore;

        accountReplenishment = 1200;

        if (accountReplenishment > checksum) {
            bonusReceived = accountReplenishment / 100;
        } else {
            bonusReceived = 0;
        }
        finalScore = initialАmount + bonusReceived + accountReplenishment;
        System.out.println("Баланс:" + finalScore);
        System.out.println("Количество бонусных рублей:" + bonusReceived);
    }

}