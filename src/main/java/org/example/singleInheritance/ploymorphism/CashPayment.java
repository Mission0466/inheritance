package org.example.singleInheritance.ploymorphism;

public class CashPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }
}
