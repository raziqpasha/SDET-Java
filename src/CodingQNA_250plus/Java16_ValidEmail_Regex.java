package CodingQNA_250plus;
/*
✅ What is a Regular Expression?
A Regular Expression (Regex) is a pattern used to match characters in a string.
It is mostly used for:

Validation (like email, phone number, password, etc.)

Searching

Replacing text in strings
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Java16_ValidEmail_Regex {
    public static void main(String[] args) {
        searchRegex();
        ReplacingRegex();

        String email ="sjraziq@gmail.com";
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pat = Pattern.compile(regex);
        Matcher mat =pat.matcher(email);
        if(mat.matches()){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
        }
    }

    public static void searchRegex(){
        String txt ="raziqpasha";
        Pattern pat = Pattern.compile("[aeiouraziqpasha]");
        Matcher mat = pat.matcher(txt);
        if(mat.find()){ //This will only print the first match, not all matches.
            /*
            ✅ What is matcher.group()?
                 It returns the matched value (text) from the string.
             ✅ What is matcher.start()?
               It returns the starting index (position) of the matched value in the string.
             */
            System.out.println(mat.group() + "at index" + mat.start());
        }
    }

    //replacing
    public static void ReplacingRegex(){
        String name="java is not purely object orient programming language";
       String replace= name.replaceAll(" ","_");
        System.out.println(replace);
    }

}
