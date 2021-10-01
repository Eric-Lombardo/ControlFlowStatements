package com.company;

public class NumberPalindrome {
//    Write a method called isPalindrome with one int parameter called number.
//    The method needs to return a boolean.
//    It should return true if the number is a palindrome number otherwise it should return false.

//    Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//    Extract the last digit of the given number by performing the modulo division (remainder).
//    Store the last digit to some variable say lastDigit = num % 10.
//    Increase the place value of reverse by one.
//    To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//    Add lastDigit to reverse.
//    Since the last digit of the number is processed, remove the last digit of num. To remove
//    the last digit divide number by 10.
//    Repeat steps until number is not equal to (or greater than) zero.

    public static void main(String[] args) {
        System.out.println("is the a palindrome -> " + isPalindrome(-1221)); // true
        System.out.println("is the a palindrome -> " + isPalindrome(707)); // true
        System.out.println("is the a palindrome -> " + isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {
//        321 is 300 + 20 + 1

//        321 % 10 = 1;
//        321 / 10 = 32

//        32 % 10 = 2;
//        1 * 10 = 10 -> (10 + 2) * 10 = 120
//        32 / 10 = 3;

//        3 % 10 = 3;
//        (120 + 3) * 10 = 1230
//        3 / 10 = 0;


        int tempNum = Math.abs(number);
        int reverse = 0;
        System.out.println("input number is: " + tempNum);
        while(tempNum > 0) {
            int lastDigit  = tempNum % 10;
            reverse *= 10;
            reverse += lastDigit;
            System.out.println("reverse is: " + reverse);
            tempNum /= 10;
            System.out.println("new temp is: " + tempNum);
        }

        return reverse == Math.abs(number);
    }
}
