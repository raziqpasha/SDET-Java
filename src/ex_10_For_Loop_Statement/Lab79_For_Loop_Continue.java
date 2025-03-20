package ex_10_For_Loop_Statement;

public class Lab79_For_Loop_Continue {
    public static void main(String[] args) {
        for(int i=0; i<=20;i++){
            if(i == 5){
                continue; // skip printing 5

            }
            System.out.println(i);

        }
    }
}
