package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        ATM atm = buildATMChain();
        atm.dispense(request);
    }

    public static ATM buildATMChain(){
        var usdATM = new UsDollarATM(null);
        var euroATM = new EuroATM(usdATM);
        return euroATM;
    }

}
