package ex_29_Exceptions;

public class Lab144_Exception_Explained {
    public static void main(String[] args) {
  /*      String input = args[0];// 0->ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(input);// for inputing the string ->NumberFormatException
        int output =100/a;// 100/0 ->java.lang.arithmeticexception
        System.out.println(output);

*/
        //numpointerexception
        String s = null;
    s.trim(); //NullPointerException
    }
}
