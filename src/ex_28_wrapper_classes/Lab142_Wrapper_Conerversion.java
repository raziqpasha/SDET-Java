package ex_28_wrapper_classes;

public class Lab142_Wrapper_Conerversion {
    public static void main(String[] args) {
        String num ="10";
        int a =10;

        //string -> wrapper
       Integer  a1= Integer.parseInt(num);
       Integer b1 = Integer.valueOf(num);

       //string to primitive(int)
        int a2 =Integer.parseInt(num);

      //  System.out.println(a.toString());
        int agee =190;
        Integer age_wrapper =agee;
        System.out.println(age_wrapper.toString());

    }
}
