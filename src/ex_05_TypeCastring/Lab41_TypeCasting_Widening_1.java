package ex_05_TypeCastring;

public class Lab41_TypeCasting_Widening_1 {
    public static void main(String[] args) {
        byte b=10;
        int a =b;        // Implicitly Casting - Automatically
        int a1= (int) b;   // Explicitly Casting - widening(doest not require)
        System.out.println(a1);
    }
}
