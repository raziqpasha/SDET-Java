package ex_07_Increment_Decrement_Operator;

public class Lab51_PreIncremnt_Operator {
    public static void main(String[] args) {
        int a=10;
        int b= ++a;
        System.out.println(a); //11 -> in a=10 n b increment with 1 and assing to 1+a =1 +10 ->11
        // so, a values is also assign to 11.
        System.out.println(b); // 11

        System.out.println(a); // 11
        System.out.println(b); // 11

        int i=15;
        System.out.println(++i); //16
        System.out.println(i);//16

        int c=10;
        int result=++c;
        System.out.println(c); //11
        System.out.println(result); //11
    }
}
