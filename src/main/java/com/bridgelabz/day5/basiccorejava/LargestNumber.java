package com.bridgelabz.day5.basiccorejava;

import java.util.Scanner;
/*
 * @author: Nikhil Deshmukh
 * Java Program to Find the Largest Among Three Numbers
 */
public class LargestNumber {
    public static void main(String[] args) {
        // Variable Declaration
        int a, b, c;
        // Scanner class objet for User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        a = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        b = scanner.nextInt();
        System.out.println("Enter the Third Number: ");
        c = scanner.nextInt();
        // Checking for the Largest Number using if-else
        if (a > b && a > c) {
            System.out.println(a + " is the largest Number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest Number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}