package com.company;

public class Main {

    public static void main(String[] args) {
        var sentence = "May the force be with you";

        var result = returnsTheLargestLetterInAlphabeticalOrder(sentence);
        System.out.println(result);

    }

    public static String returnsTheLargestLetterInAlphabeticalOrder(String str) {
        var validatedString = validateString(str);
        var highestLetter = largestCharacter(validatedString);
        return String.valueOf(highestLetter).toLowerCase();

    }

    public static String validateString(String str) {
        return str.replaceAll("[^A-Za-z ]", "");
    }

    public static char largestCharacter(String str) {
        char result = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            result = result > str.charAt(i) ? result : str.charAt(i);
        }
        return result;
    }
}

