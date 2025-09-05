package com.example;

public class RedFactory implements UIFactory{
  
  @Override
  public Button createButton(){
    return new RedButton();
  }

  @Override
  public ScrollBar createScrollBar(){
    return new RedScrollBar();
  }
}
