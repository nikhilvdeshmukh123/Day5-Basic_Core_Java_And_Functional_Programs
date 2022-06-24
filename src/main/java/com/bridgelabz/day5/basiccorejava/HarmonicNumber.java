package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Power of two
 * a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * b. I/P -> The Harmonic Value N. Ensure N != 0
 * c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
 * d. O/P -> Print the Nth Harmonic Value.
 */
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        // Scanner Object for Taking Input from User
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        System.out.println("Harmonic Series is ");
        if (n > 0) {
            // Repeat until the Harmonic Sequence complete
            for (double i = 1; i <= n; i++) {
                sum += 1 / i;
                System.out.print("1/" + i + "+");
            }
            System.out.println("\n The harmonic sum is " + sum);
        } else {
            System.out.println("n cannot be zero");
        }
    }
}