package ex_14_Strings;

public class Lab95_Interview_p2 {
    public static void main(String[] args) {
        //scp
        String s1 ="Hello";
        String s2 ="Hello";

        //object area
        String s3 =new String("Hello");
        String s4 =new String("Hello");
        String s5 =new String("hello");
        String s6 =new String("Hello");


        //compare
        System.out.println(s1==s3); //false
        System.out.println(s1==s4);//false
        System.out.println(s2==s3);//false
        System.out.println(s4==s5);//false

        //equals
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equalsIgnoreCase(s5)); //true

        System.out.println(s3.equalsIgnoreCase(s6)); //true




    }
}
