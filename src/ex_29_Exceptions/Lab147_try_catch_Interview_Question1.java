package ex_29_Exceptions;

public class Lab147_try_catch_Interview_Question1 {
    public static void main(String[] args) {
        try {
            //String s0 =null // cannot invoke string s0 , bcz so is null
            String s1 ="kmkmk";
            s1.trim();
            int a =10/0;
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
          //  throw new RuntimeException(e.getMessage());
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
