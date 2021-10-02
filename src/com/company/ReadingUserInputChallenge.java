package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {
//    -Read 10 numbers from the console entered by the user and print the sum of those numbers.
//    -Create a Scanner like we did in the previous video.
//    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//    -If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
//    -Use the nextInt() method to get the number and add it to the sum.
//    -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
//    -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");

            boolean isInteger = scanner.hasNextInt();
            if (isInteger) {
                int userInput = scanner.nextInt();
                sum += userInput;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Your sum is: " + sum);
        scanner.close();
    }
}
