package com.example;

public interface Checkout {

void checkout();

Checkout payWithCard = () -> System.out.println("Payment made with card");

Checkout payWithBankTransfer = () -> System.out.println("Payment made by bank transfer");

  
}
