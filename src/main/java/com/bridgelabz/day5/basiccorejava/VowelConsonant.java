package com.bridgelabz.day5.basiccorejava;
/*
 * @author: Nikhil Deshmukh
 * Java Program to Check Whether an Alphabet is Vowel or Consonant.
 */
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        // Scanner class object for User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter to check whether it is Vowel or Consonant: ");
        char input = scanner.next().charAt(0);
        // Checking for Character is Vowel or Consonant
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(input + " Alphabet is a Vowel.");
                break;
            default:
                System.out.println(input + " Alphabet is a Consonant.");
        }
    }
}