package org.example.ConsoleTasks.oop.person;

public class Person {

    public String name;
    public String surname;
    public int age;
    public String mail; // state-veziyyet ve behaviour - davranislari

    public static String nationality; // static - classin ozune aid olur.
    // non-static obyektin ozune aid olacaq.


    public void introduceYourSelf(){
        System.out.println(nationality);
        printNationality();
        System.out.println("My name is : "+name + " surname is:"+ surname);
    }

    public static void printNationality(){
        System.out.println(nationality);
    }
}
