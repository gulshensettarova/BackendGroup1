package org.example.lesson;

import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2]; // 111
        array[0] = 6;
        array[1] = 8;
        int a = 5;

        System.out.println("a = "+a);  // 5
        System.out.println("massivin 0-ci elementi : " + array[0]); // 6
        System.out.println("massivin 1-ci elementi : " + array[1]); // 8

        changeVariableValue(a);
        changeArrayValue(array);

        System.out.println("--------------------------");


        System.out.println("a = "+a); // 10 5
        System.out.println("massivin 0-ci elementi : " + array[0]); // 10 6
        System.out.println("massivin 1-ci elementi : " + array[1]); // 8  8

    }


    public static void changeVariableValue(int a){
        a = 10;
    }

    public static void changeArrayValue(int[] alma){
        alma[0] = 10;
    }
}
