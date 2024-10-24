package org.example.ConsoleTasks.lesson_2_2.star_tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//                *            1: 4b  1u  4b
//              * * *          2: 3b  3u  3b
//            * * * * *        3: 2b  5u  2b
//          * * * * * * *      4: 1b  7u  1b
//        * * * * * * * * *    5: 0b  9u  0b

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for(int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i+(i-1); j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
