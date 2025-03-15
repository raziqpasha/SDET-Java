package CodingQNA_250plus;

import java.util.Scanner;

public class Java5_LeapYear {
    public static void main(String[] args) {
        //✅ Leap Year Checker:
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year to check leap year:");
        int year = sc.nextInt();
     //    int year =2024;
    //    boolean isLeapYear = false;
        for (int i = 2000; i <= year; i++) {
            if ((i % 4 == 0 && i % 100 == 0) || (i % 400 == 0)) {
                System.out.println(i + "is loop Year");

               // isLeaopYear=false;
            }
       /*     if (isLeapYear) {
                System.out.println(year + " is a leapyear");

            } else {
                System.out.println(year + " is not leap year");
            }
*/
            else{
                System.out.println(i + "is not loop Year");            }

        }
        }
    }

