package ex_10_For_Loop_Statement;

public class Lab77_0dd_Even_From_Top50 {
    public static void main(String[] args) {
        for(int i=-1;i<=50;i++){
            if(i%2==0){
                System.out.println(i + " :Even"); //
                continue; // it will not skipped anything&
            }
            else if(i%2==1){
                System.out.println(i + " :Odd");
            }
            else{
                System.out.println("neither even nor odd");
            }
        }
    }
}
