package com.example;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

  private static final Map<String, Flower> flowerCache = new HashMap<>();

  public static Flower creatFlower(String name){
    // if(flowerCache.containsKey(name)){
    //   return flowerCache.get(name);
    // }
    // var flower = new Flower(name);
    // flowerCache.put(name, flower);
    // return flowerCache.get(name);

    // or

    return flowerCache.computeIfAbsent(name, Flower::new);
  } 
  
}
