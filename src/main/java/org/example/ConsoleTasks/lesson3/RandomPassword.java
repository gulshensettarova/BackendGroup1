package org.example.ConsoleTasks.lesson3;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        int passwordLength = 12; // Parolun uzunluğu
        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
    // Təsadüfi parol yaradan metod
    public static String generateRandomPassword(int length) {
        // Parolda istifadə olunacaq simvolların toplusu
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";

        // Bütün simvolları birləşdiririk
        String combinedChars = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(combinedChars.length());
            password.append(combinedChars.charAt(randomIndex));
        }
        return password.toString();
    }
}
