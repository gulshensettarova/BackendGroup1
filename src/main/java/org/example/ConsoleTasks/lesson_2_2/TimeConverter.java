package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        //İstifadəçidən dəqiqə daxil etməsini soruşun və həmin dəqiqələri saat və dəqiqə formatında göstərin (/ və % operatorları ilə).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dəqiqələri daxil edin: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Nəticəni göstərin
        System.out.println("Daxil etdiyiniz " + minutes + " dəqiqə " + hours + " saat və " + remainingMinutes + " dəqiqəyə bərabərdir.");

    }
}
