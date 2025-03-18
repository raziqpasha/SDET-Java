package CodingQNA_250plus;

import java.util.Scanner;

// ✅Prime Nuber checker
//a prime number is only divisible by 1 and itself, and not divisible by any other number.
//2, 3, 5, 7, 11, 13, 17, 19
//23, 29, 31, 37, 41, 43, 47
//53, 59, 61, 67, 71, 73, 79
//83, 89, 97, ... -> these all r prime numbers

public class Java11_Prime_Numbers {
    public static boolean isPrimeNumber(int num){
            if(num<=1){
                return false;
            }
            else if(num ==2 || num ==3){
                return true;
            }
            else if(num%2==0 || num%3==0){
                return false;
            }

            //see if the number is not divisble , then its a prime number
        for(int i=5;i*i<=num;i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
int num =sc.nextInt();
if(isPrimeNumber(num)){
    System.out.println("is prime number");
}
else{
    System.out.println("it is not prime number");
}

    }
}
