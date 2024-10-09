package org.example.ConsoleTasks.lesson_2_2;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Vurma Cədvəli
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
