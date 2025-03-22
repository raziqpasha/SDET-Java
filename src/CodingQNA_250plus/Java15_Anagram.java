package CodingQNA_250plus;

import java.util.Arrays;

/*
✅ What is the meaning of "Anagrams" in Java (or in general)?
🔤 Anagrams are words or phrases that have the same characters, just arranged in a different order.

➡️ Example:

"listen" and "silent" are anagrams (both have the same letters: l, i, s, t, e, n)
 */
public class Java15_Anagram {
    public static boolean checkAnagramOrNot(char[] ch1, char[] ch2){ //can be a or be in place of ch1, ch2 , it will strill represent same
        if(ch1.length!= ch2.length) {
            return false;
        }

        //Arrays.sort(ch1);
sort1(ch1);

        // u can use sort1(ch2) in place of array.sort(ch2)
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);
    }
    //instead of array sort us can do sorting of array using buuble or different sort , iam using bubble sort
    public static void sort1(char[] ch1){
        int n=ch1.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(ch1[j]>ch1[j+1]){
                    char tmp =ch1[j];
                    ch1[j] = ch1[j+1];
                    ch1[j+1]=tmp;
                }
            }
        }

    }


    public static void main(String[] args) {

        String str1 ="listEN";
        String str2 ="SiLeNt";
        //covert string to char array
       char[] ch1= str1.toLowerCase().toCharArray();
       char[] ch2 = str2.toLowerCase().toCharArray();
 if(checkAnagramOrNot(ch1,ch2)){
     System.out.println("it is Anagram");
 }
 else{
     System.out.println("it is not Anagram");
 }

    }


}
