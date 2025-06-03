package org.example.ConsoleTasks.string_methods_char;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sözü daxil edin: ");
        String sentence = scanner.nextLine();
        String result = removeVowels(sentence);
        System.out.println("Nəticə: " + result);
    }

    public static String removeVowels(String sentence) {
        String result = "";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (!vowels.contains(String.valueOf(currentChar))) {
                result += currentChar;
            }
        }
        return result;
    }

}
