package ex_07_Increment_Decrement_Operator;

public class Lab50_Increment_Decrement {
    public static void main(String[] args) {
        String age= args[0];
        String age1=args[1];
        String age2=args[2];
        int convertStringToInteger1 =Integer.parseInt(age);
     //   int convertStringToInteger2 =Integer.parseInt(age1);
     //   int convertStringToInteger3 =Integer.parseInt(age2);

        System.out.println(convertStringToInteger1++); // these is integer bcz it it
        // convert integer to string by using Integer.parseInt
        System.out.println(convertStringToInteger1); //post Increment Concept

     //   System.out.println(convertStringToInteger2);
     //   System.out.println(convertStringToInteger3);

        System.out.println(age1); // these output will be string only ,
        // it look like number but until/ unless u dont convert integer
        // to string using Integer.parseInt it will be in string
        System.out.println(age2);
    }
}
