package org.example;

import com.ibm.library.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sum, difference, product, quotient, x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        x = sc.nextDouble();

        System.out.println("Enter second number:");
        y = sc.nextDouble();


        sum = calculator.add(x, y);
        difference = calculator.sub(x, y);
        product = calculator.multiplication(x, y);
        quotient = calculator.division(x, y);

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}