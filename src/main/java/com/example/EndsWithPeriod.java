package com.example;

public class EndsWithPeriod implements Expression {

  private final FirstLetterStartsWithCapitalLetter firstLetterStartsWithCapitalLetter = new FirstLetterStartsWithCapitalLetter();

  @Override
  public String interpret(String context){
    context = context.concat(".");
    return firstLetterStartsWithCapitalLetter.interpret(context);
  }
  
}
