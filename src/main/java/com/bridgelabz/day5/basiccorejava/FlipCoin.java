package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Flip Coin and print percentage of Heads and Tails
 * a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
 * b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
 * c. O/P -> Percentage of Head vs Tails
 */
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        // Variables declaration
        int heads = 0;
        int tails = 0;
        // Scanner class object to taking user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin : ");
        int n = in.nextInt();
        if (n > 0) {
            // for loop to flip coin number of times
            for (int i = 0; i < n; i++) {
                // Random Function to get value between 0 and 1.
                double face = Math.random();
                // Counting the Head and Tail Occurance
                if (face > 0.5)
                    heads++;
                else
                    tails++;
            }
            // Calculating Percentage of Head vs Tail
            float hp = heads * 100 / n;
            float ht = tails * 100 / n;
            // Print Head & Tail Counts
            System.out.println("Heads : " + heads);
            System.out.println("Tails : " + tails);
            // Printing Percentage of Head vs Tail
            System.out.println("Percentage of Heads : " + hp);
            System.out.println("Percentage of Tails : " + ht);
        } else {
            System.out.println("Invalid Number. Please Enter Valid Number.");
        }
    }
}