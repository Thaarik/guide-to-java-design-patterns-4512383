package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var lightOperationExecutor = new LightOperationExecutor();
        light.isOn();
        // light.turnOnLight();
        lightOperationExecutor.executeOperation(new TurnOnLightOperation(light));
        light.isOn();
        // light.turnOffLight();
        lightOperationExecutor.executeOperation(new TurnOffLightOperation(light));
        light.isOn();

    }

}
