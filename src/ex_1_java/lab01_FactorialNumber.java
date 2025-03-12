package ex_1_java;

public class lab01_FactorialNumber {
    public static void main(String[] args) {
        int fact=1;
        for(int i=1;i<=10;i++){
            fact = fact * i;
            System.out.println("the factorial of" + " " +i +" is :" +fact);
        }
    }
}
