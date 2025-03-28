package ex_15_Arrays;

public class Lab105_Sum_of_arrrays {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
       int sumvalues= sumofnumbers(arr);
        System.out.println(sumvalues);

    }

  public static int sumofnumbers(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum =sum + arr[i];
        }

        return sum;
  }

}
