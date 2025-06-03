package org.example.ConsoleTasks.oop.person;

public class OOPIntro {
    //OOP -- Object Oriented Programming.  class ve obyekt, camelCase
    public static void main(String[] args) {
        Person person = new Person();
    }
    public static void changeObject(Person person){
        person.name = "Samir";
    }

    public static void changeInt(int a){
        a = 6;
    }
}
