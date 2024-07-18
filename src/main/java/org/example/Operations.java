package org.example;

public class Operations {

    public static double add(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        while (b == 0.0 ) {
            System.out.println("division bei null");

        }
        return a / b;

    }

//    public static double mod(double a, double b) {
//        return a % b;
//    }

}
