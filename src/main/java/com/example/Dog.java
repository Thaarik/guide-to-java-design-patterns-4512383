package com.example;

public class Dog {

    private final Logger logger = Logger.getInstance(); // Logger.INSTANCE does not work when class is used for singleton

    public void woof() {
        logger.log("Woof");
    }



}
