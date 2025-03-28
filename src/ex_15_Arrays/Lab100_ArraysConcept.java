package ex_15_Arrays;

public class Lab100_ArraysConcept {
    public static void main(String[] args) {
        int arr[] = {10,20,40,50};
        boolean isArry[] ={true,false,true};
        System.out.println(arr); //[I@7b23ec81
        System.out.println(arr[0]); //10
        System.out.println(arr[0] + arr[1] + arr[2]); //70

        System.out.println(arr.length);
        /*
        1️⃣ For Arrays (arr.length):
Arrays are non-primitive (reference) types in Java.
The length is a public field (variable), not a method.
So, we access it directly as arr.length without parentheses.

2️⃣ For Strings (string.length()):
String is also a non-primitive type, but it is an object in Java.
The length of a string is not stored as a public field.
Instead, it is calculated dynamically when calling the length() method.
         */

        System.out.println(arr[-1]);//ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);  //ArrayIndexOutOfBoundsException
    }
}
