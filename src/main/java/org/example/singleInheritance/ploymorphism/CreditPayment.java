package org.example.singleInheritance.ploymorphism;

public class CreditPayment implements Payment{
    @Override  // runtime ploymorphism
    public void pay() {
        System.out.println("This is credit payment");
    }
}
