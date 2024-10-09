package org.example.ConsoleTasks;

import java.util.Scanner;

public class Lesson_2_2 {
    public static void main(String[] args) {

//  1-dən 100-ə qədər sadə və mürəkkəb ədədləri tapan proqram yazın.
        Scanner input = new Scanner(System.in);
        int count=0;
        for(int i=3;i<=100;i++){
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println(i+" Mürəkkəb ədəddir");
            }
            else{
                System.out.println(i+" Sadə ədəddir");
            }
        }


//   -------------------------------------------------------------------------------
//   Vurma cedveli
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                System.out.print(i+"*"+j+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }

    }
}
