package org.example.ConsoleTasks.lesson_2_2;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        //x=10, y=8 ; 3-cü bir dəyişəndən istifadə etmədən x və y dəyişənlərinin qiymətini dəyişin.
        int x = 10;
        int y = 8;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x: " + x); // x: 8
        System.out.println("y: " + y); // y: 10
    }
}
