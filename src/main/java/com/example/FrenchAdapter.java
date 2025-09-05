package com.example;

public class FrenchAdapter implements LocalizedMessage {

  private final FrenchLocalizedMessage frenchLocalizedMessage;

  public FrenchAdapter() {
    this.frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

 @Override
  public void sayHello() {
   frenchLocalizedMessage.sayBonjour();
  }

}
