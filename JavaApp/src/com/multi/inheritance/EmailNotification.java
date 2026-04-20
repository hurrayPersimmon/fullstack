package com.multi.inheritance;

public class EmailNotification extends Notification {
    EmailNotification() {

    }

    @Override
    public void send() {
        System.out.println("Email Notification send");
    }
}
