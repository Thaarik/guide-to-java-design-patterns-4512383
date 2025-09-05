package com.example;

public class FrenchAdapter extends FrenchLocalizedMessage implements LocalizedMessage {

 @Override
  public void sayHello() {
   sayBonjour();
  }

  @Override
  public void sayBonjour(){
    System.out.println("Bonjour!!!!!!!!!!!!!!!!!!!!!!!!");
  }

}
