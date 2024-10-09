package org.example.ConsoleTasks.lesson_2_1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        //İstifadəçidən hər dəfə yeni bir ədəd istəyin və sıfır daxil edənə qədər daxil etdiyi ədədlərin cəmini tapın.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int number=0;
        do {
            System.out.println("Enter a number: ");
            number= sc.nextInt();
            sum+=number;
        }
        while (number > 0) ;
        System.out.println("The sum is: " + sum);

    }
}
