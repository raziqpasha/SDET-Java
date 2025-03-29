package ex_15_Arrays;

public class Lab111_forEachLoop_2dArray {
    public static void main(String[] args) {
        String[][] str1 ={
                {"apple", "ball","cat"},
                {"elephant","fish","goat"},
                {"zebra"}
        };
int rownum=0;
        for(String[] row : str1){ //outer loop -> row
int colnum=0;
            for(String col : row){ //inner loop ->col
                System.out.print("row: " +rownum + " col: "+" " +colnum + " " + col+" ");
                colnum++;

            }
            System.out.println();
        }
        rownum++;
    }
}
