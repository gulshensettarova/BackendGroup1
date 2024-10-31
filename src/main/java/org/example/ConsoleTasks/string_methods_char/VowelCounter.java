package org.example.ConsoleTasks.string_methods_char;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sözü daxil edin: ");
        String sentence = scanner.nextLine();
        int vowelCount = countVowels(sentence);
        System.out.println("Sözdəki saitlərin sayı: " + vowelCount);
    }
    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
