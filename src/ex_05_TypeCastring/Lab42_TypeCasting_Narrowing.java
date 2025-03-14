package ex_05_TypeCastring;

public class Lab42_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val =3;
        int relval =300;   // here data losss is happeen , bcz int is has large number and
        // byte has small number , while adjusting data in bits , the data which is left out of the
        // memory , so then the value of out put very less

        //  byte b =val; ->   // invalid - Narrowing - Implicity casting is not allowed
        // to use the above we need to use Narrowing i,e only explicit casting
        //(def) : explicit casting convert large type of data to small type of data

        byte b=(byte)val; // ->  explicity casting or Mnarrowing
        byte b1=(byte) relval;

        System.out.println(b);
        System.out.println(b1);   // here data losss is happeen


    }
}
