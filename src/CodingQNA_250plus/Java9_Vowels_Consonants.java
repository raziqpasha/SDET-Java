package CodingQNA_250plus;

//✅ Count vowels and consonants in a String

public class Java9_Vowels_Consonants {
    public int[] Vowels_And_Consonant(String str){
        int vowelsCount =0;
        int consonantCount =0;

        for(int i=0;i<str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {


                vowelsCount++;
                System.out.print(ch); // can also print volwes
            }
            else if(ch >='a' && ch <='z'){ //Even though 'a' is included in this range
                // — it never reaches this else if,
                // because it already matched the if condition earlier!

                consonantCount++;
                System.out.print(ch);// print consonant
            }
        }
        //return "Vowels: " + vowelsCount + ", Consonants: " + consonantCount;  -> here u can
        // use String in mainclass and print directly the string of result


        return new int[]{vowelsCount,consonantCount}; // You're not using an array
        // inside the method, true — but you're using an array as the return value
        // of the method.
        // is creating an array, which holds two values: the vowel count and consonant count.
    }

    public static void main(String[] args) {
        Java9_Vowels_Consonants obj = new Java9_Vowels_Consonants();
       int[] result = obj.Vowels_And_Consonant("abcdefghijklmnopqrstuvwxyz");
      //  System.out.println(  obj.Vowels_And_Consonant("abcdefghijklmnopqrstuvwxyz"));
        System.out.println("these is vowels count:"+ result[0]);
        System.out.println("these is consonant count:"+result[1]);
    }
}
