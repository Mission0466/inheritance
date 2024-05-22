package org.example.singleInheritance.methodoverloading;

public class Adder {

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static float add(float a, float b, float c){
        return a + b + c;
    }


}

// method signature
//add(int, int)