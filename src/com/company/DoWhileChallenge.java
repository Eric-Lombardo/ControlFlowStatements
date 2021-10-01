package com.company;

public class DoWhileChallenge {
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    // Modify the while code above
    // Make it also record the total number of even numbers it has found
    // and break once 5 are found
    // and at the end, display the total number of even numbers found

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int number = 4;
        int finishNumber = 20;

        while(true) {
            if (number > finishNumber) break;
            if (count >= 5) break;

            if (isEvenNumber(number)) {
                count++;
                sum += number;
                System.out.println(number + " is an even number");
            }

            number++;
        }

        System.out.println("the total sum of evens in this range is: " + sum);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
