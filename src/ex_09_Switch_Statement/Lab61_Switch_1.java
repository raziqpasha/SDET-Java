package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab61_Switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter day which u like:");
        System.out.println("enter character:");

        //  int day =sc.nextInt(); //=> corect
      //  byte day = sc.nextByte(); //=> corect
       // short day = sc.nextShort(); //=> corect
    //   char c =sc.next().charAt(0); //=> corect bcz '0' is alll vsllues it will go one by one
 String day ="Tuesday";
        //      char c =sc.next().charAt(1);//=> not corect  //.charAt(1) gives the second character,
        //      i.e.,'p' in "Apple" => Wrong way to declare


        //  long day =sc.nextLong(); //=> corect ->So long is NOT allowed in switch,
        //  and you’ll get a compile-time error like:
/*
        switch (c) {
            case 64:
                System.out.println("monday");
                break;
            case 65:
                System.out.println("tuesday");
                break;
            case 66:
                System.out.println("wednesday");
                break;
            case 67:
                System.out.println("thrusday");
                break;

            default:
                System.out.println("invalid days");
                break;
        }

 */

        switch(day){
            case "Monday":
                System.out.println("today is monday string");
                break;
            case "Tuesday":
                System.out.println("today is tuesday string");
                break;
            default:
                System.out.println("did not find any weekends string");
                break;
        }
    }
}
