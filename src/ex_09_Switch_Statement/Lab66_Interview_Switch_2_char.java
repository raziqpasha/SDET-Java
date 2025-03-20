package ex_09_Switch_Statement;

public class Lab66_Interview_Switch_2_char {
    public static void main(String[] args) {
        char ch ='A';
        switch(ch){
            case 65:
                System.out.println("matches A values asccii as 65");
                break;
            default:
                System.out.println("invalid ascii character");
                break;

        }
    }
}
