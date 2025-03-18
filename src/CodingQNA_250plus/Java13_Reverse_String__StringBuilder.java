package CodingQNA_250plus;

import java.util.Scanner;

public class Java13_Reverse_String__StringBuilder {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input =sc.nextLine();
String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);


    if(input.equals(reverse)){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}
