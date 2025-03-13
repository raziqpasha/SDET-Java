package ex_04_Operators;

public class Lab28_Logical_Operators {
    public static void main(String[] args) {
        boolean a=true;
        System.out.println(!a);

        boolean a1=true;
        System.out.println(!!a1);  /*
1️⃣ a1 = true
2️⃣ !a1 = false → first NOT operator flips true to false
3️⃣ !!a1 = true → second NOT flips it back to true again
*/

        boolean c = true || false;
        System.out.println(c);

        boolean d= true & false;
        System.out.println(d);
    }
}
