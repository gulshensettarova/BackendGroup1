package org.example.ConsoleTasks.lesson_2_2.star_tasks;

public class Task6 {
    public static void main(String[] args) {
        int binaryCode=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(binaryCode+" ");
                if(binaryCode==0) binaryCode=1;
                else binaryCode=0;
            }
            System.out.println();
        }
    }
}
