package com.company;

public class NumberToWords {
//    Write a method called numberToWords with one int parameter named number.
//    The method should print out the passed number using words for the digits.
//    If the number is negative, print "Invalid Value".
//    To print the number as words, follow these steps:
//
//    1. Extract the last digit of the given number using the remainder operator.
//    2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
//    those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if
//    the digit is 0, "One" if the digit is 1, and so on.
//    3. Remove the last digit from the number.
//    4. Repeat Steps 2 through 4 until the number is 0.
//
//    The logic above is correct, but in its current state, the words will be printed in reverse order. For example,
//    if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
//    To overcome this problem, write a second method called reverse.
//    The method reverse should have one int parameter and return the reversed number (int). For example, if the
//    number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//    Use the method reverse within the method numberToWords in order to print the words in the correct order.
//    Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100
//    is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should
//    print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//    The method getDigitCount should have one int parameter called number and return the count of the digits in
//    that number. If the number is negative, return -1 to indicate an invalid value.
//    For example, if the number has a value of 100, the method getDigitCount should return 3 since the number
//    100 has 3 digits (1, 0, 0).

    public static void main(String[] args) {
        System.out.println(reverse(-121)); // -121
        System.out.println(reverse(1212)); // 2121
        System.out.println(reverse(1234)); // 4321
        System.out.println(reverse(100)); // 1
        System.out.println("=============================================");
        numberToWords(123); // print "One Two Three".
        numberToWords(1010); // print "One Zero One Zero".
        numberToWords(1000); // print "One Zero Zero Zero".
        numberToWords(-12); // print "Invalid Value" since the parameter is negative.
        numberToWords(0); // print "Zero"
        System.out.println("=============================================");
        System.out.println(getDigitCount(0)); // return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); // return 3
        System.out.println(getDigitCount(-12)); // return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); // return 4 since there are 4 digits in the number
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number < 10) return 1;

        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int reverse(int number) {
        int tempNum = Math.abs(number);
        int reverse = 0;

        while(tempNum > 0) {
            int lastDigit  = tempNum % 10;
            reverse *= 10;
            reverse += lastDigit;
            tempNum /= 10;
        }

        return number < 0 ? reverse * -1 : reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        if (number == 0) System.out.println("Zero");

        int reversedNumber = reverse(number);
        int temp = reversedNumber;

        while (temp > 0) {
            int lastDigit = temp % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }

            temp /= 10;
        }

        for (int i = 0; i < getDigitCount(number) - getDigitCount(reversedNumber); i++) {
            System.out.println("Zero");
        }
    }
}
