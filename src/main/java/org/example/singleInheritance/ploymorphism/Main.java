package org.example.singleInheritance.ploymorphism;

public class Main {
    public static void main(String[] args){
        Payment p = new CashPayment();
        p.pay();

        Payment p2 = new CreditPayment();
        p2.pay();

    }
}
