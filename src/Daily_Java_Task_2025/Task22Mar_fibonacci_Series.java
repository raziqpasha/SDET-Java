package Daily_Java_Task_2025;

public class Task22Mar_fibonacci_Series {
    public static void main(String[] args) {
   int n=0;
   for(int i=0;i<=8;i++){
       int res =fibonacci(i);
       System.out.println(res);
   }
    }

    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fibonacci(n-1)+ fibonacci(n-2);
    }

}
