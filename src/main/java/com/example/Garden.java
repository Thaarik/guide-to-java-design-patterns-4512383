package com.example;

public class Garden {

    public static void main(String[] args) {

        var sunflower1 = FlowerFactory.creatFlower("SunFlower");
        var sunflower2 = FlowerFactory.creatFlower("SunFlower");
        var sunflower3 = FlowerFactory.creatFlower("SunFlower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.creatFlower("Rose");
        var rose2 = FlowerFactory.creatFlower("Rose");
        var rose3 = FlowerFactory.creatFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);

    }

}
