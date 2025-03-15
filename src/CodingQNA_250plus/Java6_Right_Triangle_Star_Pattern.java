package CodingQNA_250plus;

public class Java6_Right_Triangle_Star_Pattern {
    public static void main(String[] args) {
        /*
        ✅ Right Triangle Star Pattern
*
**
***
****
*****

         */

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
