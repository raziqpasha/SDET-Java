package ex_09_Switch_Statement;

public class Lab69_Switch_JDK13Above_1 {
    public static void main(String[] args) {
        int itemcode=001;
        switch(001){
            case 001 -> System.out.println("001"); // no use of break statement declaration
            case 002 -> System.out.println("002");
            default -> System.out.println("default statements");
        }
    }
}
