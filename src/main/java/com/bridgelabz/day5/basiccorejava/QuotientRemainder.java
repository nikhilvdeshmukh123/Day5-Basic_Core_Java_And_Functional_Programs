package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Java Program to Compute Quotient and Remainder
 */
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Scanner Class To Take Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter the Divisor: ");
        int divisor = input.nextInt();
        if (divisor != 0) {
            // Formula to get Quotient Or Remainder
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            // Displaying the value of Quotient Or Remainder
            System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder);
        } else
            System.out.println("Cannot be divided by 0");
    }
}