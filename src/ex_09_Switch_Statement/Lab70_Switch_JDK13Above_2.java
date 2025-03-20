package ex_09_Switch_Statement;

public class Lab70_Switch_JDK13Above_2 {
    public static void main(String[] args) {
        int itemcode =006;
        switch(itemcode){
            case 001 ,002 ,003 :
                System.out.println("statement 1");
                break;
            case 004 ,005 ,006 :
                System.out.println("statement 2");
break;
            default:
                System.out.println("default statemtn");
                break;
        }
    }
}
