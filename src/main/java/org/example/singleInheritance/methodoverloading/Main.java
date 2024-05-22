package org.example.singleInheritance.methodoverloading;

public class Main {
    public static void main(String[] args){
       System.out.println(Adder.add(11,11));
       System.out.println(Adder.add(11,10, 11));
        System.out.println(Adder.add(11.22f,10, 11));

    }
}
