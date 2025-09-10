package com.example;

public class RoomII extends RoomDecorator{
  public RoomII(Room room){
    super(room);
  }

  @Override
  public void printFurniture(){
    super.printFurniture();
    System.out.println("Table");
  }
}
