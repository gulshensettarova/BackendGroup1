package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //İstifadəçidən iki rəqəm daxil etməsini və operatoru (+, -, *, /) soruşun. switch-case istifadə edərək əməliyyatı yerinə yetirin və nəticəni göstərin.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = scanner.nextDouble();

        System.out.print("Operatoru daxil edin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Nəticə: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Nəticə: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Nəticə: " + result);
                break;
            case '/':
                // Bölmə əməliyyatı üçün sıfıra bölmə yoxlaması
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Nəticə: " + result);
                } else {
                    System.out.println("Xəta: Sıfıra bölmək olmaz.");
                }
                break;
            default:
                System.out.println("Xəta: Düzgün operator daxil edin.");
        }

    }
}
