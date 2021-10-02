package com.company;

public class PerfectNumber {
//    What is the perfect number?
//    A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//    Proper positive divisors are positive integers that fully divide the perfect number without leaving
//    a remainder and exclude the perfect number itself.
//    For example, take the number 6:
//    Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
//    and the sum of its proper divisors is 1 + 2 + 3 = 6.
//    Therefore, 6 is a perfect number (as well as the first perfect number).
//
//
//    Write a method named isPerfectNumber with one parameter of type int named number.
//    If number is < 1, the method should return false.
//    The method must calculate if the number is perfect. If the number is perfect, the method should
//    return true; otherwise, it should return false.

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(isPerfectNumber(28)); // true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(isPerfectNumber(5)); // false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(isPerfectNumber(-1)); // false since the number is < 1
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 0;
        int temp = number - 1;

        while (temp > 0) {
            if (number % temp == 0) {
                sum += temp;
            }
            temp--;
        }

        return sum == number;
    }
}
