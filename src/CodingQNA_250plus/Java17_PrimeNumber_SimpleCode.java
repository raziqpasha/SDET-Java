package CodingQNA_250plus;

import java.util.Scanner;

public class Java17_PrimeNumber_SimpleCode {
    public static void main(String[] args) {
        /*
        A prime number is a number greater than 1 that has only two factors:
1 and itself.
Examples: 2, 3, 5, 7, 11, 13, 17, 19, 23…
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number num:");
        int num = sc.nextInt();
        boolean status = true;
        if (num <= 1)
            status = false;

        for (int i = 2; i <= num/2; i++) {

            if (num % i == 0) {
                status = false;
                break;
            }
        }
            if (status) {
                System.out.println("it is a prime number");
            } else {
                System.out.println("it is not a prime number");
            }
        }

    }


