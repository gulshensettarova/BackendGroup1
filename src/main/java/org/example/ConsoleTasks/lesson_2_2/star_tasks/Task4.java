package org.example.ConsoleTasks.lesson_2_2.star_tasks;

public class Task4 {
    public static void main(String[] args) {
        int counter=0;
        for(int i=1;i<=5;i++){
           for(int j=1;j<=i;j++){
               counter++;
               System.out.print(counter +" ");
           }
            System.out.println();
        }
    }
}
