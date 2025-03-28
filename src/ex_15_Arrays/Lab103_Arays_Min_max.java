package ex_15_Arrays;

public class Lab103_Arays_Min_max {
    public static void main(String[] args) {
        int array[] = new int[8];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        array[5]=60;
        array[6]=70;
        array[7]=80;
        int maxvalue = max_array(array);
        System.out.println(maxvalue);

        int minvalue = min_array(array);
        System.out.println(minvalue);


    }
    public static int max_array(int array[]){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int min_array(int array[]){
        int min =array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min; //Your min_array() method initializes min = array[0],
        // which is 10. The loop iterates through the array but never finds a
        // value smaller than 10, so min remains 10.


    }
}
