package ex_06_Ternary_Operator;

public class Lab46_Ternary_Nested_InterviewQAN {
    public static void main(String[] args) {
        //Nested Ternar
        // result = conditiona1 ? expression1 : (condition2 ? expression2 :expression3);

        int number =25;
        String result = number < 10 ? "n>25" : (number < 10 ? "n<25" : "n==25");
        System.out.println(result); // n==25


        int x=10, y=20;
        System.out.println(Math.max(x,y)); //20

        int max=x>y ? x: y;
        System.out.println(max);  //20
    }
}
