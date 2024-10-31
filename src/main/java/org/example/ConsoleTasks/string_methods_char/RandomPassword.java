package org.example.ConsoleTasks.string_methods_char;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
          int passwordLength = 12;
          System.out.println("Generated Password: " + generateRandomPassword2(12));
    }
    public static String generateRandomPassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";
        String combinedChars = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;
        Random random = new Random();
        String password = "";
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(combinedChars.length());
            password+=combinedChars.charAt(randomIndex);
        }
        return password.toString();
    }

    public static String generateRandomPassword2(int length){
        String result="";
        char character;
        Random rnd=new Random();
        int random_index=0;
        for(int i=0;i<length;i++){
            random_index= rnd.nextInt(65535);
           if((random_index>=32 && random_index<=63)
                   || (random_index>=65 && random_index<=96)
                   || (random_index>=123 && random_index<=126)
           ){
            character=(char) random_index;
            result+=character;
           }
           else{
               i--;
           }
        }
        return result;
    }
}
