package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        //Istifadəçidən alınan ədədin faktorialını tapan proqram yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktorialını hesablamaq üçün ədəd daxil edin: ");
        int number = scanner.nextInt();
        long factorial = 1;

        if (number < 0) {
            System.out.println("Xəta: Faktorial yalnız müsbət ədədlər üçün hesablanır.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Faktorialın hesablanması
            }
            // Nəticəni göstərin
            System.out.println(number + " ədədinin faktorialı: " + factorial);
        }
    }
}
