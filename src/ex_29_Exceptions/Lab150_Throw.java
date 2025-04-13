package ex_29_Exceptions;

public class Lab150_Throw {
    public static void main(String[] args) {
        func(10);
    }
   public  static  void func(int a){
        if(a==10){
            throw new RuntimeException();
        }
    }
}
