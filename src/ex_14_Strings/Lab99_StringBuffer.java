package ex_14_Strings;

public class Lab99_StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raziq");
        sb.append("123");
        System.out.println(sb);

        //delete
        sb.delete(2,5);
        System.out.println(sb);

        //replace
        sb.replace(0,4,"java");
        System.out.println(sb);
    }
}
