package ex_09_Switch_Statement;

import java.util.Scanner;
/*
✅ What is enum?
enum is a keyword in Java used to define a set of constant values (fixed values that don't change).
enum is like a special class that contains a group of predefined constants.

 */

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

public class Lab62_Switch_Enum {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("enter the values:");
        String values = sc.next().toUpperCase();// Convert to uppercase to match enum values
        try{
            Day d = Day.valueOf(values); // convert string to enum
            switch (d){
                case MONDAY:
                    System.out.println("Start of the week");
                    break;
                case WEDNESDAY:
                    System.out.println("Midweek");
                    break;
                case FRIDAY:
                    System.out.println("Weekend is near");
                    break;
                default:
                    System.out.println("Just another working day");
            }
        }
        catch ( IllegalArgumentException e){
            System.out.println("inva;id wweekday are added");
        }

    }
}
