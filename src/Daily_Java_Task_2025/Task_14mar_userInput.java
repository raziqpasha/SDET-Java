package Daily_Java_Task_2025;

import java.util.Scanner;

//Take a user input - Name, Age and Salary and print them in the end.

public class Task_14mar_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your salary");
        long salary=sc.nextLong();

        System.out.println("my name is:"+name);
        System.out.println("my age is:"+age);

        System.out.println("my salary is:"+salary);




    }
}
