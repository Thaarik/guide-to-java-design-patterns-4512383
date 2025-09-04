package com.example;

public class VendingMachine {

    Snack getSnack(String snackType) {
        if (snackType.equalsIgnoreCase("Drink")) {
            return new Drink();
        } else if (snackType.equalsIgnoreCase("ChocolateBar")) {
            return new ChocolateBar();
        } else {
            return new Chips();
        }
    }
}
