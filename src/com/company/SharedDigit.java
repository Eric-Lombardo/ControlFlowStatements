package com.company;

public class SharedDigit {
//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//    If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers,
//    such as 2 in 12 and 23; otherwise, the method should return false.

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true (the digit 2 appears in both numbers)
        System.out.println(hasSharedDigit(9, 99)); // false (9 is not within the range of 10-99)
        System.out.println(hasSharedDigit(15, 55)); // true (the digit 5 appears in both numbers)
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) return false;

        // Since num1 and num2 can only be 10-99
        // I will find all 4 possible digits with brute force
        int digit1 = num1 % 10;
        int digit2 = (num1 / 10) % 10;
        int digit3 = num2 % 10;
        int digit4 = (num2 / 10) % 10;

        return digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4;
    }
}
