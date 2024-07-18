package org.example;

import java.util.Scanner;

public class Inputs {
    private Scanner scanner;

    public Inputs() {
        scanner = new Scanner(System.in);
    }

    public double getInputs(String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextDouble()) {

            System.out.println("Ungültige eingabe" + prompt);

            scanner.next();
        }

        return scanner.nextDouble();
    }

    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operation (+, -, *, /): ");
        String operation = scanner.next();

        while (!operation.matches("[+\\-*/]")) {
            System.out.print("Ungültige Operation. Bitte gib eine von die Opertionen: +, -, *, / ");
            operation = scanner.next();
        }
        scanner.close();
        return operation;
    }
}

