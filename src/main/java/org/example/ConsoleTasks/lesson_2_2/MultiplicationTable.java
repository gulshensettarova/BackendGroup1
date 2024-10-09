package org.example.ConsoleTasks.lesson_2_2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //İstifadəçidən bir rəqəm daxil etməsini soruşun və həmin rəqəmin vurma cədvəlini for döngüsü ilə çap edin.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
