package CodingQNA_250plus;

public class Java8_Pyramid_Pattern_in_Java {
    public static void main(String[] args) {

        /*
        ✅ Pyramid pattern in Java

    *
   ***
  *****
 *******
*********
         */

        //print spaces
        for(int i=1;i<=5;i++){  //row
            for(int j=1;j<=5-i;j++){  // column
                System.out.print(" ");  //space
            }

            //print stars

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
