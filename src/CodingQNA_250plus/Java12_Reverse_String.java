package CodingQNA_250plus;

import java.util.Scanner;

public class Java12_Reverse_String {
    public static void reverseWord(char[] arrSentence) {
//        int start = 0;
//        int end = arrSentence.length - 1;
//        while (start < end) {
            reverse(arrSentence, 0, arrSentence.length-1);

            int start=0;
            for(int end=0;end<=arrSentence.length-1;end++){
                if (arrSentence[end] == ' ') {
              reverse(arrSentence,start,end-1);
start =end+1;

                }
            }
        }
//    }

    public static void reverse(char[] arr,int i,int j){

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name to reverse string");
        String input = sc.nextLine();

        char[] arrSentence = input.toCharArray(); // java -> a v a j
        reverseWord(arrSentence);
        System.out.println(new String(arrSentence));
    }
}
