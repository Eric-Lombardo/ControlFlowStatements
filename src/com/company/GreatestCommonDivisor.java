package com.company;

public class GreatestCommonDivisor {
//    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//    The method should return the greatest common divisor of the two numbers (int).
//    The greatest common divisor is the largest positive integer that can fully divide each of the integers
//            (i.e. without leaving a remainder).
//
//    For example 12 and 30:
//            12 can be divided by 1, 2, 3, 4, 6, 12
//            30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//    The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5 since both can be divided by 5 without a remainder
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6 since both can be divided by 6 without a remainder
        System.out.println(getGreatestCommonDivisor(9, 18)); // -1 since the first parameter is < 10
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9 since both can be divided by 9 without a remainder
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        // Find out which num is the lowest
        // the lowest num will be the "highest" num that can be potentially divisable for both
        // loop going down until you find a match
        int commonDivisor = 1;

        if (first < second) {
            int temp = first;
            while (temp > 0) {
                if (second % temp == 0 && first % temp == 0) {
                    commonDivisor = temp;
                    break;
                }
                temp--;
            }
        } else if (first > second) {
            int temp = second;
            while (temp > 0) {
                if (second % temp == 0 && first % temp == 0) {
                    commonDivisor = temp;
                    break;
                }
                temp--;
            }
        }

        return  commonDivisor;
    }
}
