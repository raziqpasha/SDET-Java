package CodingQNA_250plus;

public class Java7_Left_Triangle_Star_Pattern {
    public static void main(String[] args) {

        /*
        ✅ Left Triangle Star Pattern

*****
****
***
**
*

         */
        for(int i=5;i>=1;i--){   // it will total star in first row n then write logic
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
