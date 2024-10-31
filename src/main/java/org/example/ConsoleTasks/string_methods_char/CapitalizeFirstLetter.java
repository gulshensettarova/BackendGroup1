package org.example.ConsoleTasks.string_methods_char;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sözü daxil edin: ");
        String inputWord = scanner.nextLine();
        System.out.println("Nəticə: " + capitalizeFirstLetter2(inputWord));
    }

    public static String capitalizeFirstLetter1(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public static String capitalizeFirstLetter2(String word){
        int upperLetterIndex=word.charAt(0)-32;
        char upperLetter= (char) upperLetterIndex;
        String result="";
        result+=upperLetter;
        if(word!=null && !word.isEmpty()){
            for(int i=1;i<word.length();i++){
                result+=word.charAt(i);
            }
            return result;
        }
        return word;
    }
}
