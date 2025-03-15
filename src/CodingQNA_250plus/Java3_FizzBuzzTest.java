package CodingQNA_250plus;

public class Java3_FizzBuzzTest {
    public static void main(String[] args) {
  //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        int num=100;
        for(int i=1;i<=num;i++){
            /*
   0  <-- Quotient
   _______
3 | 1      <-- Dividend ÷ Divisor
     0
   -----
     1  <-- Remainder

             */
            if(i%3 == 0){
                System.out.println("Fizz " + "Multiple of 3");
            }
            else if(i%5==0){
                System.out.println("Buzz " + "Multiple of 5");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz" + "Multiple of both 3 & 5" );
            }
            else{
                System.out.println("invalid number :"+ i);
               // System.out.println(i);
            }
        }
    }
}
