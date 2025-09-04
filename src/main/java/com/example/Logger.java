package com.example;

public final class Logger {

    private Logger(){};

    private static Logger INSTANCE;

    public static Logger getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
