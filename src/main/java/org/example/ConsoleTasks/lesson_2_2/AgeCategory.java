package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();
        String category;

        if (age >= 0 && age <= 12) {
            category = "Uşaq";
        } else if (age >= 13 && age <= 30) {
            category = "Gənc";
        } else if (age >= 31 && age <= 59) {
            category = "Yetgin";
        } else if (age >= 60) {
            category = "Yaşlı";
        } else {
            category = "Yanlış yaş daxil edildi.";
        }
        System.out.println("Daxil etdiyiniz yaşa əsasən kateqoriya: " + category);
    }
}
