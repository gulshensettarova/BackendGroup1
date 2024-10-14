package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=100;i++){
            count=0;
            for(int j=2;j<i;j++){//2,3,4
                if(i%j==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println(i+" Murekkeb");
            }
            else{
                System.out.println(i+" Sade");
            }
        }
    }
}
