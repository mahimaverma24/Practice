package com.ca.mahima.designpattern.factory.pattern;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
