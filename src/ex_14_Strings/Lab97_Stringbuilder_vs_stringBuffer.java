package ex_14_Strings;

public class Lab97_Stringbuilder_vs_stringBuffer {
    public static void main(String[] args) {
        String s0 ="raziq";

        StringBuilder stringbuilder = new StringBuilder("pasha1");
        StringBuffer stringbuffer =new StringBuffer("Pasha2");

        System.out.println(s0);
        System.out.println(stringbuilder);
        System.out.println(stringbuffer);
    }
}
