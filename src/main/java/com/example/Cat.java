package com.example;

public class Cat {


    private final Logger logger = Logger.getInstance(); // or Logger.INSTANCE;

    public void meow() {
        logger.log("Meow");
    }

}
