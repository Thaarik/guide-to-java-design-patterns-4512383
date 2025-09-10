package com.example;

public class RoomI extends RoomDecorator{
  public RoomI(Room room){
    super(room);
  }

  @Override
  public void printFurniture(){
    super.printFurniture();
    System.out.println("Couch");
  }
}
