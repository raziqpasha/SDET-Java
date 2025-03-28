package ex_15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab102_Array_Sort_Using_Builtinfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the 5 elements in the array:");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("---------------- array will get sort here");
      //  System.out.println(arr[i]);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
