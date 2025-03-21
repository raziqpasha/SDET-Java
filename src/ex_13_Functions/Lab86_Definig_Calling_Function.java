package ex_13_Functions;

public class Lab86_Definig_Calling_Function {
    public static void main(String[] args) {
        //calling the function
        Lab86_Definig_Calling_Function obj = new Lab86_Definig_Calling_Function();
       obj. f1();
    }
    // defining the function
    public void f1(){
        System.out.println("defining the function");
    }

    public void name_of_function(){
        System.out.println("execute now");
        System.out.println("execute later");

    }

}
