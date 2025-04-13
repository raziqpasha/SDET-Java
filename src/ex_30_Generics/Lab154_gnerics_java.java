package ex_30_Generics;

public class Lab154_gnerics_java {
    public static void main(String[] args) {
        add(10,2);
        System.out.println(add(10,2));
        System.out.println(add(3.5, 4.5));
        System.out.println(add("raziq","pasha"));
    }
    public static <T> T add(T t1,T t2){
        System.out.println(t1);
        System.out.println(t2);
//return t1;
        //return t2;
        return null;
    }

}
