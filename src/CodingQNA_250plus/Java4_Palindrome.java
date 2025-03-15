package CodingQNA_250plus;

import java.util.Scanner;

public class Java4_Palindrome {
    public static void main(String[] args) {
        //✅ Palindrome Checker:
        //Create a program that checks whether a given string is a palindrome.
        // A palindrome is a word or phrase that reads the same backward as forward
        // (ignoring spaces, punctuation, and capitalization).
        // Use an if-else statement to determine if the string is a palindrome.

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Palindrome number:");
     int PlandromeNum =sc.nextInt();
     int reverse=0;
     int original =PlandromeNum;
// int plandrom=141; ->(reverse)351

        while(PlandromeNum!=0){
            int digit = PlandromeNum%10; //modulus
             reverse = reverse *10 + digit; // reverse
            PlandromeNum =PlandromeNum/10; // dive
        }
        if(original==reverse){
            System.out.println(reverse + " it is palindrome");
        }
        else{
            System.out.println(reverse + " it is not palindrome");
        }
    }
}
