package com.company;

import java.util.Scanner;

public class MinAndMaxChallenge {
//    -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//    -Before the user enters the number, print the message gEnter number:h
//    -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//    Hint:
//    -Use an endless while loop.
//
//    Bonus:
//    -Create a project with the name MinAndMaxInputChallenge.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isFirstIteration = true;

        System.out.println("Enter number: ");

        while (true) {
            boolean isInteger = scanner.hasNextInt();

            if (isInteger) {
                int userInput = scanner.nextInt();
                if (isFirstIteration) {
                    min = userInput;
                    max = userInput;
                    isFirstIteration = false;
                }
                if (userInput < min) min = userInput;
                if (userInput > max) max = userInput;
            } else {
                System.out.println("The min number is: " + min);
                System.out.println("The max number is: " + max);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
