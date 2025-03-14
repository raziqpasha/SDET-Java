package ex_06_Ternary_Operator;

public class Lab49_Real_Age_Classification {
    public static void main(String[] args) {
        String age=args[0];
        System.out.println(age);
        System.out.println(age instanceof String);

        //Integer.parseInt() is a method in Java
        // that is used to convert a String (text) into an int (integer number).

        /*
        Then in your Java code, this 65 is received as a String in the main method like this:
        public static void main(String[] args)

Here, args[0] will contain the string "65" — not the number 65.

So you need to convert it to an integer if you want to perform arithmetic operations.
         */
        int age1 = Integer.parseInt(age);
        System.out.println(age1);
    }
}
