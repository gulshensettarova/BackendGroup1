package org.example.ConsoleTasks.string_methods_char;

import java.util.Scanner;

public class camelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text=sc.nextLine();
        System.out.println("Result: "+camelCase(text));
    }
    public static String camelCase(String text){
        String result="";
        char firstChar;
        String[] splitedWord=text.split(" ");
        for(int i=0;i<splitedWord.length;i++){
            firstChar=splitedWord[i].charAt(0);
            if(i==0){
                if(firstChar>='A' && firstChar<='Z') firstChar+=32;
            }
            else{
                if(firstChar>='a' && firstChar<='z') firstChar-=32;
            }
            result+=firstChar+splitedWord[i].substring(1);

        }
        return result;
    }
}
