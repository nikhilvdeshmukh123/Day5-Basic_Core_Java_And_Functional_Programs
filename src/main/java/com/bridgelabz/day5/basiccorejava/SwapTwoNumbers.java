package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Java Program to Swap Two Numbers.
 */
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Variable Declaration
        int x, y, t;
        // Scanner Class Object for Taking User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number (x) :");
        x = input.nextInt();
        System.out.println("Enter the second number (y):");
        y = input.nextInt();
        // Performing Swapping operation by addition and subtraction
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("The numbers after swapping are x : " + x + " and y : " + y);
    }
}