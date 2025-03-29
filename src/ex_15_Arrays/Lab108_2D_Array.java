package ex_15_Arrays;

public class Lab108_2D_Array {
    public static void main(String[] args) {
        // int[][] 2d_array = {{10,30,50} ,{40,60,60} ,{45,67,34}}; // invalid 2d_array
        int[][] array_2d = {{10, 30, 50}, {40, 60, 60}, {45, 67, 34}};
        first_method_2darray(array_2d);

        System.out.println("_____________________");

        int[][] array_2dd = {
                {10, 30, 50},
                {40, 60, 60},
                {45, 67, 34}
        };
        second_method_2darray(array_2dd);

        System.out.println("_____________________");

        int[][] array_2ddd;
        array_2ddd =new int[][] { {10,20},{30,40},{50,60}};
        third_method_2darray(array_2ddd);

        System.out.println("_____________________");


        int[][] array_2dddd = new int[2][2];
        array_2dddd[0][0]=10;
        array_2dddd[0][1]=20;
 //       array_2dddd[0][2]=30; //.ArrayIndexOutOfBoundsException

        array_2dddd[1][0]=40;
        array_2dddd[1][1]=50;
     //   array_2dddd[1][2]=60; //.ArrayIndexOutOfBoundsException

        //array_2dddd[2][0]=70;
      //  array_2dddd[2][1]=80;
       // array_2dddd[2][3]=90; //.ArrayIndexOutOfBoundsException
        fourth_method_2darray(array_2dddd);


    }
    public static void first_method_2darray(int[][] array_2d){
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]+ " ");

            }
            System.out.println();
        }
    }

    public static void second_method_2darray(int[][] array_2dd){
        for (int i = 0; i < array_2dd.length; i++) {
            for (int j = 0; j < array_2dd[i].length; j++) {
                System.out.print(array_2dd[i][j]+ " ");

            }
            System.out.println();
        }
    }

    public static void third_method_2darray(int[][] array_2ddd){
        for (int i = 0; i < array_2ddd.length; i++) {
            for (int j = 0; j < array_2ddd[i].length; j++) {
                System.out.print(array_2ddd[i][j]+ " ");

            }
            System.out.println();
        }
    }

    public static void fourth_method_2darray(int[][] array_2dddd){
        for (int i = 0; i < array_2dddd.length; i++) {
            for (int j = 0; j < array_2dddd[i].length; j++) {
                System.out.print(array_2dddd[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
