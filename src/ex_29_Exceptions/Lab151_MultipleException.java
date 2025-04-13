package ex_29_Exceptions;

import java.io.FileNotFoundException;

public class Lab151_MultipleException {
    public static void main(String[] args) {
try{
    functions(10);
}
catch(Exception e){
    System.out.println(e.getMessage());
}
    }

    public static void functions(int age) throws NullPointerException,ArithmeticException,NumberFormatException, FileNotFoundException {
        if(age <18){
throw new RuntimeException();
          //  System.out.println("error");
        }
    }
}
