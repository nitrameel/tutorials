package com.mlee;

public class Main {

    public static void main(String[] args) {
        // width of int - 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of doulbe = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPoundValue = 200d;
        double myKilogramValue = myPoundValue * 0.45359237d;
        System.out.println(myPoundValue + " Pounds equals " + myKilogramValue + " Kilograms");

        double pi = 3.141_592_7d;
    }
}
