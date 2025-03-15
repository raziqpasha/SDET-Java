package ex_07_Increment_Decrement_Operator;

public class Lab52_PostIncrement_Operator {
    public static void main(String[] args) {
        float f=100f;
        float f1=f++;
        System.out.println(f); //101 -> value will be incremtned by 1
        System.out.println(f1); // 100 -> then here same value constant will be be printed(orignal value which is declared)


        int c=10;
        int result=c++;
        System.out.println(c); //11
        System.out.println(result);// 10
    }
}
