package org.example.lesson;

import java.util.Scanner;

public class CharStringMethods {

    public static String test(int a, int b){
        int c = a+b;
        for(int i=0; i<10; i++){
            if(i==5){
                int y = 6;
                return "i 5-e beraber oldu";
            }else{
                return "i 5-e beraber deyil";
            }
        }

        System.out.println("Salam");
        String s = "cem 6-dan boyuk deyil";
        return s;
    }
    public static void main(String[] args) {
        int a = 10;
       sum(a, 3L);
    }


    public static int factorial(int number){
        if(number==1){
            return 1;
        }
        return number * factorial(number-1); // 3 *  2 factorial(2)  2 * factorial(1)  = 2
    }


    public static void sum(int a, int b){ // overload , signature, say-da ferq, tipde ferq
        int sum = a+b;
        System.out.println("sum = "+sum);
    }

    public static void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("sum = "+sum);
    }

    public static void sum(int x, double b){
        double sum = x+b;
        System.out.println("sum = "+sum);
    }


    public static void sum(double bsad, float asd){
        double sum = bsad+asd;
        System.out.println("sum = "+sum);
    }

    public static void sum(float bsad, double asd){
        double sum = bsad+asd;
        System.out.println("sum = "+sum);
    }

    public static double sum(int alma , long l){
        double sum = alma+l;
        return sum; // pass by value; pass by reference
    }



}
