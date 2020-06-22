package com.company;

public class Main {

    public static void main(String[] args) {
        // Testing min and max values of int
        // Using wrapper class to find min and max values of int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Example of underflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        // Example of overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
    }
}
