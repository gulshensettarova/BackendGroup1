package org.example.ConsoleTasks.lesson_2_1;

import java.util.Scanner;

public class FindSeasonByMonth {
    public static void main(String[] args) {
//        İstifadəçidən 1-dən 12-ə qədər bir ədəd istəyin. Daxil edilən dəyərə uyğun fəsli çıxarın ( 1,2 və 12 : qış, 3,4,5 :yaz və s.)
        Scanner sc = new Scanner(System.in);
        System.out.println("1-dən 12-ə qədər ədəd daxil edin: ");
        byte month=sc.nextByte();
         String season=switch (month){
             case 12,1,2-> "Qish";
             case 3,4,5 -> "Yaz";
             case 6,7,8->"Yay";
             case 9,10,11->"Payiz";
             default -> "1 ve 12 arasi bir deyer daxil edin";
         };
         switch (month){
             case 1,2,12:System.out.println("Qish");break;
             case 3,4,5:System.out.println("Yaz");break;
             case 6,7,8:System.out.println("Yay");break;
             case 9,10,11:System.out.println("Payiz");break;
             default:
                 System.out.println("-----------");
         }

    }
}
