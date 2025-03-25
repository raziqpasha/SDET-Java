package ex_14_Strings;

public class Lab96_String_Functions_2 {
    public static void main(String[] args) {
        String name ="Raziq";
        //length()
        System.out.println(name.length());

        System.out.println(name.charAt(4));

        //concat
        System.out.println(name.concat("pasha"));

        //contains
        System.out.println(name.contains("r"));
        System.out.println(name.contains("R"));

        //equals
        System.out.println(name.equals("raziq"));
        System.out.println(name.equals("Raziq"));

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("raziq"));

        //indexOf
        System.out.println(name.indexOf('z'));

        //replace
        System.out.println(name.replace('z','t'));

        //split
        String name1="sjraziq@gmail.com";
        String split[] = name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //subString
        System.out.println(name.substring(1,3));

        //toUpperCase
        System.out.println("pasha".toUpperCase());

        //toLowerCase
        System.out.println("PASHA".toLowerCase());

        //statswith
        System.out.println(name.startsWith("R"));

        //endswith
        System.out.println("Raziq".endsWith("q"));

        //trim
        System.out.println("        raziqpasha".trim());

        //concat
        String s1="Raziq";
        String s2="Pasha";
        String s3 =s1+s2;
        System.out.println(s3);

        //lastIndexOf
        String n ="RaziqPasha";
        System.out.println(n.lastIndexOf("h"));





    }
}
