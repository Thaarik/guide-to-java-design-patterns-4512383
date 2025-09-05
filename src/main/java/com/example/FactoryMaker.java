package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

  private static final Map<String, Supplier<UIFactory>> uiTypes = new HashMap<>();

  static {
    uiTypes.put("RED", RedFactory::new);
    uiTypes.put("BLUE", BlueFactory::new);
  }

  public static UIFactory createFactory(String uiType){
    if(uiTypes.get(uiType) != null){
      return uiTypes.get(uiType).get();
    }else{
      throw new IllegalArgumentException("UI Type not supported");
    }
  }
  
}
