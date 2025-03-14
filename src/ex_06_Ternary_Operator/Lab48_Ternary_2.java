package ex_06_Ternary_Operator;

public class Lab48_Ternary_2 {
    public static void main(String[] args) {
        int n1=3;
        int n2=5;
        int n3=9;

        int result = (n1>n2) ? (n1>n3) ? n1 :n3 :((n2>n1)? n2: n1);
        System.out.println(result);


        // here execution
        //1. (n1>n2) -> condition
        //2. (n1>n3) ? n1 :n3  -> true
        //3.((n2>n1)? n2: n1) ->false
    }
}
