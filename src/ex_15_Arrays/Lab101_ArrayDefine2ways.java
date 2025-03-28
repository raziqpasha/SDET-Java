package ex_15_Arrays;

public class Lab101_ArrayDefine2ways {
    public static void main(String[] args) {
        //2 ways to define an arry
        int[] arr ={1,2,3,4,5,5};

        //integer array
        int marks[] =new int[10];// fixed size
        marks[0]=10;
        marks[1]=50;
    //    .
     //   .
        marks[9]=100;
      //  marks[10]=1000;

        System.out.println(marks[1]);//50
      //  System.out.println(marks[10]);//.ArrayIndexOutOfBoundsException

        //string array
        String str[] = new String[3];
        str[0]="rp";
        System.out.println(str[0]); //rp

        //boolean array
        boolean bool[] = new boolean[3];
        bool[0]=true;
        bool[1]=false;
        bool[2]=true;
        System.out.println(bool[1]);//false



    }
}
