package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Java Program to Check Whether a Number is Even or Odd
 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Scanner class Object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number to check Even or Odd: ");
        int n = scanner.nextInt();
        // Checking for even or odd Number
        if (n % 2 == 0) {
            System.out.println(n + " is a Even Number.");
        } else {
            System.out.println(n + " is a Odd Number.");
        }
    }
}
