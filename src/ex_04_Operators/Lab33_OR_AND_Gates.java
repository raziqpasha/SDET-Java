package ex_04_Operators;

public class Lab33_OR_AND_Gates {
    public static void main(String[] args) {

        //OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //AND

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // NOT

        System.out.println(!(true && true));
        System.out.println(!(true && false));
        System.out.println(!(false && true));
        System.out.println(!(false && false));


    }
}
