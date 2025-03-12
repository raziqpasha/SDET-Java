package ex_1_java;

public class Lab_06_CloudFile {
    public static void main(String[] args) {
        System.out.println("Final");

    }

    public static void main(String args) {

    }

    public static void main(int args) {

    }
}
/*
1. -> public static void main(String[] args)

This is the main method where Java starts the execution of your program.
So when you run this program, only this method is executed, and it will print: Final

2. -> public static void main(String args) and public static void main(int args)

These are method overloading — same method name (main) but different parameters (String vs int).
But these are NOT used when running a Java program, because the Java Virtual Machine (JVM) always looks only for this format:

-> public static void main(String[] args)
So, these extra main methods are just like normal methods, but since you are not calling them, nothing happens.
 */