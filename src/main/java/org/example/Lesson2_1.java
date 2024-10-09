package org.example;

import java.util.Scanner;

public class Lesson2_1 {
    public static void main(String[] args) {
        //İstifadəçidən 1-dən 12-ə qədər bir ədəd istəyin. Daxil edilən dəyərə uyğun fəsli çıxarın ( 1,2 və 12 : qış, 3,4,5 :yaz və s.)        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1-dən 12-ə qədər ədəd daxil edin: ");
//        byte month=sc.nextByte();
//         String season=switch (month){
//             case 12,1,2-> "Qish";
//             case 3,4,5 -> "Yaz";
//             case 6,7,8->"Yay";
//             case 9,10,11->"Payiz";
//             default -> "1 ve 12 arasi bir deyer daxil edin";
//         };
//        System.err.println(season);

        //------------------------------------------------------------------------------
        //İstifadəçidən hər dəfə yeni bir ədəd istəyin və sıfır daxil edənə qədər daxil etdiyi ədədlərin cəmini tapın.
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//        int number=0;
//        do {
//            System.out.println("Enter a number: ");
//            number= sc.nextInt();
//            sum+=number;
//        }
//        while (number > 0) ;
//        System.out.println("The sum is: " + sum);

        //--------------------------------------------------------------------------------

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
