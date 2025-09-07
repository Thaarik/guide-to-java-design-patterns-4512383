package com.example;

public class Note implements Composite{

    private final char value;

    public Note(char value) {
        this.value = value;
    }

    // Replaced
    // public void play() {
    //     System.out.println(value);
    // }

    @Override
    public void toPlay(){
        System.out.println("Note value is "+ value);
    }

}
