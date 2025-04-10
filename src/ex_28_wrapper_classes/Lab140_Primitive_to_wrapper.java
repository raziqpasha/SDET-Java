package ex_28_wrapper_classes;


public class Lab140_Primitive_to_wrapper {
    public static void main(String[] args) {
        int a =10;

        //int -> datatype
        //Integer -> object -> object has attribute and behaviour ex :  System.out.println(age.MIN_VALUE);


        Integer age =65; // wrapper classes
        Integer b =a; // autoboxing
        int age1=age; // unboxing

        System.out.println(age.MIN_VALUE); // wrapper classes except the functions
       // System.out.println(a.MIN_VALUE); primitive doest have function it give error

    }
}
