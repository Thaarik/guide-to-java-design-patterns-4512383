package com.example;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.checkout(Checkout.payWithCard);
        checkoutPage.checkout(Checkout.payWithBankTransfer);

    }

}
