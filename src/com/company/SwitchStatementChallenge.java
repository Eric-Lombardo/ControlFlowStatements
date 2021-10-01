package com.company;

public class SwitchStatementChallenge {
//    Create a switch statement
//    create a new char variable
//    create a switch statement testing for
//    A, B, C, D, or E
//    display a message if any of these are found and then break
//    add a default which displays a message saying not found

    public static void main(String[] args) {
        // For primitive type char
        char character = 'D';
        switch(character) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The character was either A, B, C, D, or E");
                System.out.println("In fact it was " + character);
                break;
            default:
                System.out.println("Sorry, nothing matched for " + character);
                break;
        }

        // For String
        String month = "May";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Brrr it's cold");
                break;
            case "may":
                System.out.println("It's my birthday");
                break;
            case "october":
                System.out.println("Spooky time");
                break;
            case "december":
                System.out.println("I hope I'm on the nice list");
                break;
            default:
                System.out.println("You can't just make up months you know");
                break;
        }
    }
}
