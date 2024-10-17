package org.example.ConsoleTasks.lesson3;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sözü daxil edin: ");
        String inputWord = scanner.nextLine();
        String capitalizedWord = capitalizeFirstLetter(inputWord);
        System.out.println("Nəticə: " + capitalizedWord);
    }

    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
