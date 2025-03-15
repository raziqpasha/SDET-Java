package ex_08_If_Condition;

public class Lab57_If_Else {
    public static void main(String[] args) {
       // String a = args[0];
        int convertStringToInteger = Integer. parseInt(args[0]);
        if (convertStringToInteger >18){
            System.out.println("rights to vote");
        }
        else{
            System.out.println("not allowed in voting room");
        }
    }
}
