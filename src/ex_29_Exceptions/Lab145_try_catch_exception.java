package ex_29_Exceptions;

public class Lab145_try_catch_exception {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("are u full divide by zero is an error");
        }
        System.out.println("10nov2001");
    }
}
