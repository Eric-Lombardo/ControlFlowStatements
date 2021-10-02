package com.company;

public class EvenDigitSum {
//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        int temp = number;

        while(temp > 0) {
            int lastDigit = temp % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            temp /= 10;
        }

        return sum;
    }
}
