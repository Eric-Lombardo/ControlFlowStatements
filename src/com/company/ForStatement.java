package com.company;

public class ForStatement {

    public static void main(String[] args) {
        // using a for statement call calculateInterest with
        // the amount of 10k with an interestRate of 2,3,4,5,6,7,8
        // print the results to console
        for (int i = 2; i < 9; i++) {
            String prepend = "10,000 at " + i + "% = ";
            System.out.println(prepend + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("===========================");

        // how would you modify the for loop to do the same
        // but in reverse (8,7,6,5,4,3,2)
        for (int i = 8; i >=2; i--) {
            String prepend = "10,000 at " + i + "% = ";
            System.out.println(prepend + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("===========================");

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int count = 0;

        for (int i = 5; i < 121; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }
            if (count >= 3) {
                System.out.println("I'm stopping after 3 primes found");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
