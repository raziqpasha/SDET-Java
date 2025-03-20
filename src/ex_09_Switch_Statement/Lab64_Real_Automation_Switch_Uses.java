package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab64_Real_Automation_Switch_Uses {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Browser of ur choice:");
        String browser =sc.next();

        switch(browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("starting the chrome");
                System.out.println("............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "edge":
                System.out.println("starting the chrome");
                System.out.println("............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            default:
                System.out.println("opera browser is invalid , bcz opera has removed for execution of automation scripts");
                break;
        }
    }
}
