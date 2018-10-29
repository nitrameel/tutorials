package com.mlee;

public class Main {

    public static void main(String[] args) {
        // Char can also be a unicode character
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char RegisteredSymbol = '\u00AE';
        System.out.println("Registered symbol is: " + RegisteredSymbol);
    }
}
