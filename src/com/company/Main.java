package com.company;

public class Main {

    public static void main(String[] args) {
        // Testing min and max values of int
        // Using wrapper class to find min and max values of int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Finding min and max of int:");
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Example of underflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        // Example of overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        // Finding min and max of byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("\nFinding min and max of byte:");
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        // Finding min and max of short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("\nFinding min and max of short:");
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        // Place an 'L' after declaring a long
        long myLongValue = 100L;
        // Finding min and max of long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("\nFinding min and max of long:");
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        // Casting in Java
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);
        
        // Finding max and min of float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("\nFinding min and max of float:");
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);
        
        // Finding max and min of double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nFinding min and max of double:");
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        // int vs float vs double
        int myIntValue = 5 / 3;
        float myFloatValue = 5 / 3.0f;
        double myDoubleValue = 5 / 3.0d;
        System.out.println("\nMyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge:
        // Convert pounds to kilograms
        double weightInPounds = 200d;
        double weightInKilograms = weightInPounds * .45359237d;
        System.out.println("\nWeight in Kilograms = " + weightInKilograms);

        // Chars
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("\nTesting chars: ");
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00a9';
        System.out.println(myCopyrightChar);

        // Booleans - either true or false
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        // String - Not a primitive type, technically a class
        String myString = "This is a string";
        System.out.println("\nTesting Strings: ");
        System.out.println("myString = " + myString);
        myString = myString + ", and most sequences of characters.";
        System.out.println("myString = " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString = " + myString);

        // Cannot add string like the are ints, doubles, floats, etc
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // Int get converted and then added on to string, they do not add or have any type of calculation
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);
    }
}
