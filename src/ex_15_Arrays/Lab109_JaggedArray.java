package ex_15_Arrays;

public class Lab109_JaggedArray {
    public static void main(String[] args) {

        //java allows jagged array were for each row and colum can have different length
        int[][] jaggedArray = {
                {1,2,3},
                {3,4,4,5,9},
                {100}
        };

        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
