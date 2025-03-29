package ex_15_Arrays;

import java.util.Scanner;

public class Lab110_userInput_2darray {
    public static void main(String[] args) {
     //   int[] a=null;
     //   System.out.println(a[0]); //NullPointerException
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int n1 =sc.nextInt();
        System.out.println("Enter column size");
        int n2 =sc.nextInt();

        System.out.println("Enter 2d array:");

        int arr[][] = new int[n1][n2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
