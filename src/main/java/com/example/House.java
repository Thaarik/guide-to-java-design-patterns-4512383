package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        var roomI = new RoomI(room);
        roomI.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var roomII = new RoomII(roomI);
        roomII.printFurniture();
    }

}
