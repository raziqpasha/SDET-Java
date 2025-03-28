package Daily_Java_Task_2025;

public class Task_27Mar_Palindrome_reverseString {
    public static void main(String[] args) {

        String name = "Raziq";
        System.out.println(   "Raziq is reverse: "+ reversRaziq(name));

        System.out.println(reverseWithStringBufferOrStringBuilder("Pasha"));
    }

    public static String reversRaziq(String name){
        String result =" ";
        for(int i=name.length()-1;i>=0;i--){
            result =result + name.charAt(i);
        }
        return result;

    }

    public static String reverseWithStringBufferOrStringBuilder(String name1){
        StringBuilder sb = new StringBuilder(name1);
       return "Pasha is reverse : "+ sb.reverse().toString();
    }

}
