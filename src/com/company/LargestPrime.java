package com.company;

public class LargestPrime {
//    Write a method named getLargestPrime with one parameter of type int named number.
//    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//    The method should calculate the largest prime factor of a given number and return it.
//    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(217)); // return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(0)); // return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(45)); // return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(-1)); // return -1 since the parameter is negative
        System.out.println(getLargestPrime(7)); // return 7
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int tempNum = number;
        for (int i = number - 1; i >= 2; i--) {
            if (tempNum % i == 0) {
                tempNum = i;
            }
        }

        return  tempNum;
    }
}
