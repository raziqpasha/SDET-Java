package ex_06_Ternary_Operator;

public class Lab45_Ternary_1 {
    public static void main(String[] args) {
        int age=10;
       int result1 = age>=18 ? 19 : 7; // integer datatype bcz the coditional statement
        // shud be supported integer only and if ur condt stat is in string , the datatpe shud be string and
        // string is not datatype it is a class.
        System.out.println(result1);


        String result = age<=18 ? "Yes age is grater" : "No age is not greater";
        System.out.println(result);

        float number =3.14f;
        String result2= number >0 ? "Positive" : "negative";
        System.out.println(result2);

    }
}
