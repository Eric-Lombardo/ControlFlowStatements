package com.company;

public class FirstLastDigitSum {
//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//    The method needs to find the first and the last digit of the parameter number passed to
//    the method, using a loop and return the sum of the first and the last digit of that number.
//    If the number is negative then the method needs to return -1 to indicate an invalid value.

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(0)); // 0
        System.out.println(sumFirstAndLastDigit(5)); // 10
        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        if (number < 10) return number + number;

        int temp = number;
        int sum = temp % 10;
        while (temp > 0) {
            if (temp / 10 == 0) break;
            temp /= 10;
        }

        return temp + sum;
    }
}
