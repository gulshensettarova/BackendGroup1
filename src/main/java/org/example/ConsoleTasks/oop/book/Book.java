package org.example.ConsoleTasks.oop.book;

public class Book {

    public String name;
    public Author author;
    public float price;
    public static float VAT=0.1f;

    public float calculateAmount(){
        return this.price*(1-VAT);
    }
    public void displayInfo(){
        System.out.println("Book name is :"+name+"\nauthor is :"+author.name+"\n"+"price is :" +price);
    }
    public void apllyDiscount(float amount){
        this.price-=amount;
        System.out.println("New price is :"+calculateAmount());
    }
}
