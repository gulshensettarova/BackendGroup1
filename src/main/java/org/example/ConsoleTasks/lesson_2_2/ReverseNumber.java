package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //İstifadəçidən bir ədəd daxil etməsini istəyin və onu əksinə çevirərək çap edin (məsələn, 12345 daxil edilərsə, 54321 çıxsın).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Nəticəni göstərin
        System.out.println("Daxil etdiyiniz ədədin əksi: " + reversedNumber);
    }
}
