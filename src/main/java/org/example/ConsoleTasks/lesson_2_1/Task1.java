package org.example.ConsoleTasks.lesson_2_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("musbet eded");
        }
        else if(n<0){
            System.out.println("menfi");

        }
        else if(n==0){
            System.out.println("sifir");
        }

    }
}
