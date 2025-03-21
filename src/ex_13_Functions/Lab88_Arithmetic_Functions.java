package ex_13_Functions;

import java.util.Scanner;

public class Lab88_Arithmetic_Functions {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter num1");
        int a=0;
        if(s.hasNextInt()){ // it will check the input first ,wheather it is an integer
            a =s.nextInt(); // then it will read it
            System.out.println("its an intege: "+ a); //then print
        }
        else{
            System.out.println("the value entered is not integer");
            System.exit(0);
        }
int div=division(10,9);
        System.out.println(div);
    }

    static int division(int a,int b){
        if(b==0){
            System.exit(0);
        }
        int res =a/b;
        return res;
    }

}
