package org.example.ConsoleTasks.string_methods_char;

import java.util.Random;


public class reverseWord {
    public static void main(String[] args) {
        Random rnd=new Random();
        System.out.println((char)rnd.nextInt(65535));
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Soz daxil edin: ");
//        String text=sc.next();
//        System.out.println(reverseText(text));


    }

    public static String reverseText(String text){
        String result="";
        for(int i=text.length()-1;i>=0;i--){
           result+=text.charAt(i);
        }
        return result;

    }
}

