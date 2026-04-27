package com.multi.solid.ocp;

public class CashPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println(amount + " cash payment");
    }
}
