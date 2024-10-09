package org.example.ConsoleTasks.lesson_2_2.star_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for(int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
