package com.bridgelabz.day5.functionalprograms;
/*
 * @author: Nikhil Deshmukh
 * Sum of three Integer adds to ZERO
 * a. Desc -> Program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0
 * b. I/P -> N number of integer, and N integer input array
 * c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
 * d. O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
 */
import java.util.Scanner;

public class SumOfThreeIntegers {
    //Scanner Object for User input
    static Scanner s = new Scanner(System.in);
    static void sum0count(int n) {
        //Array and Variable Declaration
        int[] arr = new int[n];
        int count = 0;
        //Taking array element input from user
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //Checking for the Triplet which sum add to zero
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
                    }
                }
            }
        }
        System.out.println("Total pairs are " + count);
    }

    public static void main(String[] args) {
        System.out.println("Enter no of inputs");
        //Scanner Object for User input
        int n = s.nextInt();
        sum0count(n);
    }
}