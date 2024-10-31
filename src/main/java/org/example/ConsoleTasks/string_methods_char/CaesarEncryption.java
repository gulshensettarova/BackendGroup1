package org.example.ConsoleTasks.string_methods_char;

import java.util.Scanner;

public class CaesarEncryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text=sc.nextLine();
        System.out.println("Result: "+encryptWithCaesarCipher(text));
    }
    public static String encryptWithCaesarCipher(String text){
        String encryptedText="";
        int asciiCode;
        for(char character:text.toCharArray()){
         asciiCode=character-2;
         encryptedText+=(char)asciiCode;
        }
        return encryptedText;
    }
}
