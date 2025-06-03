package org.example.ConsoleTasks.oop.book;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zəhmət olmasa seçim edin:");
        System.out.println(Menu.menu);
        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();
    }

    public static void operate(int operation){
         switch (operation){
             case 1:
                 Scanner sc=new Scanner(System.in);
                 Book b=new Book();
                 System.out.println("Kitabin adini daxil edin: ");
                 b.name="Test";
                 b.price=12;
                 b.author=new Author("Gulshan");
                 Database.books[Database.lastIndex]=b;
                 Database.lastIndex++;
                 break;
             case 2: break;
             case 3: break;
             case 4: break;
             case 5: break;
             case 6: break;
         }
    }
}
