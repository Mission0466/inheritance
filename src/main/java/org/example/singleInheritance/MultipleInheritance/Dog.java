package org.example.singleInheritance.MultipleInheritance;

public class Dog implements Animal,Pet{
    @Override
    public void eat() {
        System.out.println("THe dog eats food");
    }

    @Override
    public void play() {
        System.out.println("The dog plays");
    }

    public void bark(){
        System.out.println("The dog barks");
    }
}
