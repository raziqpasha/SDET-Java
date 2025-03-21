package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab83_while_Loop_GussingTheNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int numberToGusses= r.nextInt(100);

        Scanner sc = new Scanner(System.in);


        int iteration=0;
        while(true){
            System.out.println("enter the n value:");
            int n = sc.nextInt();

            if(n>numberToGusses){
                System.out.println("too high number out of exception");
            }

            else if(n < numberToGusses){
                System.out.println("goood think of number and expected value");
            }
            else{
                System.out.println(" the number id nor low or high it invalid");
                break;
            }
            iteration++;

        }

    }
}
