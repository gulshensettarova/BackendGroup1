package org.example.ConsoleTasks.string_methods_array;//

import java.util.Scanner;

public class StringCombinations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text=sc.nextLine();
        System.out.println("Result: ");
        printArray(generateCombinations(text));
    }
    public static String[] generateCombinations(String text){
     String[] result=new String[factorial(text.length())];
     int k=0;
     for(int i=0;i<text.length();i++){
         for(int j=0;j<text.length();j++){
             if(i!=j){
                 result[k]=swap(j,text);
                 k++;
             }

         }
     }

      return result;
    }
    public static String swap(int currentIndex,String txt){
        if (currentIndex < txt.length() - 1) {
            char[] chars = txt.toCharArray();
            char s1 = chars[currentIndex];
            char s2 = chars[currentIndex + 1];
            chars[currentIndex] = s2;
            chars[currentIndex + 1] = s1;
            String swappedTxt = new String(chars);
            return swap(currentIndex + 1,swappedTxt);
        }
        return txt;
    }


  public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
  }

  public static void printArray(String[] arr){
        for(String word:arr){
            System.out.println(word);
        }
  }
}
