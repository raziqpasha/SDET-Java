package ex_05_TypeCastring;

public class Lab44_TypeCasting_Narrowing_2 {
    public static void main(String[] args) {
        int course =100;
        float GST=18.21f;

    // int total =course + GST; // here's an error due to gst is float, so int =int +int is correct;
        int total1 =course + (int)GST; // here the data loss is not happen , y bcz the float has 4 byte of size
        // and same int also has 4 byte of size
        System.out.println(total1);

        float total2 = course +GST; // here float = int +float is valid and  working fine
        System.out.println(total2);

        float total3= (float) course +GST;
        System.out.println(total3);

    }
}
