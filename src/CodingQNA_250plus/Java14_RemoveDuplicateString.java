package CodingQNA_250plus;

public class Java14_RemoveDuplicateString {
    public static void main(String[] args) {

        String input ="Helloworld";
      String output =  RemoveDuplicate(input);
        System.out.println(output);

    }
    public static String RemoveDuplicate(String str){
String result=" " ; // empty string
for(int i=0;i<str.length();i++){
            char ch =str.charAt(i); // string will convert to char
            if(result.indexOf(ch)==-1){  // -1 will check if repeation of same character will be there, then it will skipp
                result =result+ch; // add all characters
            }
        }
        return result;
    }


}
