package CodingQNA_250plus;

import java.util.Scanner;

public class Java1_UserInput {
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
        sc.close();  // In small programs, nothing big will happen -> if we dont use scanner.close().
       // But in large applications, not closing scanners
        // or other resources can cause memory leaks or resource exhaustion.
    }
}
