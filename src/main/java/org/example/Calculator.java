// Calculator.java
package org.example;

public class Calculator {
    public static void main(String[] args) {
        Inputs inputHandler = new Inputs();

        double a = inputHandler.getInputs("Geben Sie erste Zahl ein: ");
        double b = inputHandler.getInputs("Geben Sie zweite Zahl ein: ");
        String operation = inputHandler.getOperation();

        double result = 0;

        switch (operation) {
            case "+":
                result = Operations.add(a, b);
                break;
            case "-":
                result = Operations.sub(a, b);
                break;
            case "*":
                result = Operations.mul(a, b);
                break;
            case "/":
                result = Operations.div(a, b);
                break;
            default:
                System.out.println("Ungültige Ergebnis.");
                return;
        }

        System.out.println("Ergebnis: " + result);
    }
}
