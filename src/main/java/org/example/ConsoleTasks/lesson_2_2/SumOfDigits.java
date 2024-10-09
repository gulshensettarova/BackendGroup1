package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //Verilmiş ədədin rəqəmləri cəmini tapan proqram yazın
        Scanner sc = new Scanner(System.in);
        int n =0;
        int sum = 0;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("The sum is: "+sum);

    }
}
