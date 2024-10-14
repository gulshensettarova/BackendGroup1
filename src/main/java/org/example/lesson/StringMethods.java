package org.example.lesson;

public class StringMethods{
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "hello World!";
        boolean b = s1.equalsIgnoreCase(s2);
        s1 = s1.toLowerCase();
        s1 = s1.toUpperCase();
        s1 = s1.substring(4, 8);
        s1 = s1.substring(1);
        s1 = "   Hello World!   ";

        s1 = s1.trim();
        s1 = s1.replace("lo", "A");

        System.out.println(s1);
        int index = s1.lastIndexOf("l", 7);
        System.out.println(index);
    }
}
