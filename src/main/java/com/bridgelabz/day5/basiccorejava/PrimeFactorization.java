package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Print the prime factors of number N.
 * I/P -> Number to find the prime factors
 * c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
 * d. O/P -> Print the prime factors of number N.
 */

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        //Scanner Class Take Input From User
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("The prime factors of " + n + " = ");
        while (n % 2 == 0) {                                // If n is even, print 2. Divide n by 2
            System.out.print(2 + " ");
            n = n / 2;
        }
        //For to get Prime Factor
        for (int i = 3; i <= Math.sqrt(n); i += 2) {        //If n is odd, i will take values from 3 till squareroot of n, i=i+2 gives odd numbers only
            while (n % i == 0) {                            //If n is divisible by i
                System.out.print(i + " ");                  //Print i
                n = n / i;                                    //Divide n by i
            }                                               //for loop continues
        }
        if (n > 2)                                          //Now if n is greater than 2, it will be a prime number greater than 2
            System.out.print(n);                            //Print the value of n
    }
}