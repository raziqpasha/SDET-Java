package CodingQNA_250plus;

public class Java10_String_Palindrome {

    public static boolean StringPalindrome(String str) {
        for (int i = 0; i <= str.length(); i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1);
   if(start != end){
        return false;
    }

     /*
            if (start == end) {
                return true;
            }
             */
        }
            return true;
        }


        public static void main(String[] args){
            //StringPalindrome("madam");
            if (StringPalindrome("madam")) {
                System.out.println("these is palindrome");
            } else {
                System.out.println("these is not palindrome");
            }
        }
    }



    //code can be write these type also
    /*
    package CodingQNA_250plus;

public class Java10_String_Palindrome {

    public static boolean StringPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If mismatch found, it's not a palindrome
            }
            start++;
            end--;
        }

        return true; // If loop completes without mismatch, it's a palindrome
    }

    public static void main(String[] args) {
        if (StringPalindrome("madam")) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}

     */
