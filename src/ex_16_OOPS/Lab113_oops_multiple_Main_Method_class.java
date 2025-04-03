package ex_16_OOPS;
/*
In Java, only one class in a file can be declared as public, and the file name must
match the public class name.

Explanation:
Your file is named Lab113_oops_multiple_Main_Method_class.java,
so only this class can be public.

If you try to make Lab113_oops_multiple_Main_Method_class1 or
 Lab113_oops_multiple_Main_Method_class2 public,
 the compiler will throw an error unless each is in its own separate file.

Why?
Java requires that a public class must be saved in a file with the same name as the class.
If you have multiple classes in a single file, only one of them can be public.
The other classes must not be public (they are package-private by default), meaning they are only accessible within the same package.
 */

public class Lab113_oops_multiple_Main_Method_class {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

    class Lab113_oops_multiple_Main_Method_class1 {
        public static void main(String[] args) {
            System.out.println("hello");
        }
    }

    class Lab113_oops_multiple_Main_Method_class2 {
        public static void main(String[] args) {
            System.out.println("bye");
        }
    }


