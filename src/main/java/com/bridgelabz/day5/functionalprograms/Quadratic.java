package com.bridgelabz.day5.functionalprograms;

import java.util.Scanner;
/*
 * @author: Nikhil Deshmukh
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 * can be found using a formula (Note: Take a, b and c as input values)
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 */
public class Quadratic {
    public static void main(String[] args) {
        // Scanner class Object for User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Enter the value of c");
        int c = input.nextInt();
        // Calculating Delta Value
        int delta = b * b - 4 * a * c;
        // Calculating and Displaying Root1 & Root2 of X
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The real roots of quadratic equation are " + x1 + " and " + x2);
        } else
            System.out.println("The roots of quadratic equation are Imaginary.");
    }
}