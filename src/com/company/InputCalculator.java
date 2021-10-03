package com.company;

import java.util.Scanner;

public class InputCalculator {
//    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//    When the user enters something that is not an int then
//    it needs to print a message in the format "SUM = XX AVG = YY".
//    XX represents the sum of all entered numbers of type int.
//    YY represents the calculated average of all numbers of type long.
//
//    EXAMPLE 1:
//    INPUT:
//    1
//    2
//    3
//    4
//    5
//    a
//    OUTPUT
//    SUM = 15 AVG = 3
//
//    EXAMPLE 2:
//    INPUT:
//    hello
//    OUTPUT:
//    SUM = 0 AVG = 0

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg;
        int count = 0;
        boolean isFirstIteration = true;

        while (true) {
            boolean isInteger = scanner.hasNextInt();

            if (isInteger) {
                int userInput = scanner.nextInt();
                if (isFirstIteration) {
                    sum = userInput;
                    isFirstIteration = false;
                } else {
                    sum += userInput;
                }
            } else {
                break;
            }

            count++;
            scanner.nextLine();
        }

        avg =  (long) Math.ceil((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
