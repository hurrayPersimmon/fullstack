package com.multi.solid.ocp;

public class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " cards");
    }
}
