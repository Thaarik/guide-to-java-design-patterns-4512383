package com.example;

public class BlueFactory implements UIFactory{
  
  @Override
  public Button createButton(){
    return new BlueButton();
  }

  @Override
  public ScrollBar createScrollBar(){
    return new BlueScrollBar();
  }
}
