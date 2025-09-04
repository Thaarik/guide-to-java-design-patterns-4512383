package com.example;

public class Cat {


    private final Logger logger = Logger.getInstance(); // Logger.INSTANCE does not work when class is used for
                                                        // singleton

    public void meow() {
        logger.log("Meow");
    }

}
