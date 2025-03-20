package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab60_Switch {
    public static void main(String[] args) {
        //## Switch Statements
        //- Multiple Condition or statements.
        //- Java switch statement executes one statement from **multiple conditions.
        //- Java switch expressions must be of** byte, short, int, long(with its Wrapper type),
        // enums and String**.
        //- Beginning with JDK7, it also works with enumerated types.
        //- The value for a case must be constant or literal. **Variables are not allowed.**

        Scanner sc=new Scanner(System.in);
        System.out.println("enter day which u like:");
        int day =sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
                default :
                    System.out.println("invalid days");
                    break;

        }
    }
}
