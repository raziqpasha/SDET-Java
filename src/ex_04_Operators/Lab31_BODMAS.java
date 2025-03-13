package ex_04_Operators;

import javax.management.MBeanAttributeInfo;

public class Lab31_BODMAS {
    public static void main(String[] args) {

        //BODMAS -> Bracket on Div, mul,add,sub

        System.out.println((9 * 3 / 9 * 1) * 3);
        /*
        Note: In Java,
Multiplication (*) and Division (/) have the same priority.
Java evaluates from Left to Right when priorities are equal.

// 9 * 3 ->27
// 27/9 ->3
//3 * 3 -> 9
         */
    }
}
