package org.example.ConsoleTasks.lesson_2_2.star_tasks;

public class Task5 {
    public static void main(String[] args) {
        int counter=0;
        for(int i=0;i<5;i++){
            counter=1;
            for(int j=1;j<=i+1;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
}
