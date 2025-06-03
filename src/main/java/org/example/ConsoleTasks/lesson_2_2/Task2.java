package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a,b;
        char c;
        Scanner sc= new Scanner(System.in);
        System.out.println("a ededini daxil edin: ");
        a=sc.nextInt();
        System.out.println("b ededini daxil edin :");
        b= sc.nextInt();
        System.out.println("simvolu daxil edin :");
        c=sc.next().charAt(0);
        switch (c){
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/':if(b!=0)System.out.println(a/b);break;
            default:System.out.println(" daxil edilen melumat yanlisdir !");
        }

    }
}
