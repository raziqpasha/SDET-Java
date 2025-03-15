package ex_07_Increment_Decrement_Operator;

public class Lab53_Advance_Increment_Post_Pre {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + a); // here addition is  happening

        int b=20;
        System.out.println(b++ + ++b); // diff b/w pre n post increment is at first time
        // both values will be incremnt by 1 and in precemtn the value will
        // be same aas u define orignil value when u print for second
        // time using different variable and in post incremnt the value
        // will not change when u print for second time it wil diplay
        // as u first time declared
        /*
        EX 1-> post incremnt
         int c=10;
        int result=++c;
        System.out.println(c); //11
        System.out.println(result);//10

        EX ->2 pre incremnt
         int c=10;
        int result=c++;
        System.out.println(c); //11
        System.out.println(result);// 10

         */

        int k=18;
        System.out.println(k++ + ++k); //38
    }
}
