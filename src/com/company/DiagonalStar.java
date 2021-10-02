package com.company;

public class DiagonalStar {
//    Write a method named printSquareStar with one parameter of type int named number.
//    If number is < 5, the method should print "Invalid Value".
//    The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
//
//    EXAMPLE 1
//    printSquareStar(5); should print the following:
//        *****
//        ** **
//        * * *
//        ** **
//        *****
//
//    EXAMPLE 2
//    printSquareStar(8); should print the following:
//            ********
//            **    **
//            * *  * *
//            *  **  *
//            *  **  *
//            * *  * *
//            **    **
//            ********
//
//    * In the first or last row
//    * In the first or last column
//    * When the row number equals the column number
//    * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

    public static void main(String[] args) {
        printSquareStar(2);
        System.out.println("====================================");
        printSquareStar(5);
        System.out.println("====================================");
        printSquareStar(8);
        System.out.println("====================================");
        printSquareStar(21);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                // IntelliJ suggests I use StringBuilder instead of String to add "*" or " " to starRowString
                StringBuilder starRowString = new StringBuilder();
                for (int j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == number - 1 || j == number - 1 || i == j || j + 1 == number - i) {
                        starRowString.append("*");
                    } else {
                        starRowString.append(" ");
                    }
                }

                System.out.println(starRowString);
            }
        }
    }
}
