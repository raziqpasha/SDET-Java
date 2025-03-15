package Daily_Java_Task_2025;

public class Task_12Mar_Math_Concept {
    public static void main(String[] args) {
        // ³√(x²+y²-|z|)
        //x² → Square of x
        //y² → Square of y
        //|z| → Absolute value of z
        //Add x² + y², then subtract |z|
        //Take the cube root (³√) of the result

        int x=10;
        int y=10;
        int z=10;
        // int result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));

        System.out.println(Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z)));
    }
}
