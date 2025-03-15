package ex_08_If_Condition;

import java.util.Scanner;

public class Lab58_If_Else_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the AGE:");
            int age = sc.nextInt();

        if (age >18){
            System.out.println("rights to vote");
        }
        else{
            System.out.println("not allowed in voting room");
        }
    }
}
