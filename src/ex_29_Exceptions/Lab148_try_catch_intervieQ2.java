package ex_29_Exceptions;

public class Lab148_try_catch_intervieQ2 {
    public static void main(String[] args) {
        try {
            String s = "987";//arrayindexoutofbounfexception
           int a= Integer.parseInt(s);
        }
        catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            //  throw new RuntimeException(e.getMessage());
            System.out.println(e.getMessage());

        }
    }
}
