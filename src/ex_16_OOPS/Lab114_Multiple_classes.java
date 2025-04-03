package ex_16_OOPS;

import org.w3c.dom.ls.LSOutput;

public class Lab114_Multiple_classes {
    public static void main(String[] args) {
        System.out.println("bye");
    }
}

//The compiler may give an error, or even if it compiles,
// it won’t run because nested inner classes cannot have main methods executed by the JVM.
class p1{
    class p2{
        class p3{
            class p4{
                class p5{
                    public static void main(String[] args) {
                        System.out.println("heeee");  //not executre
                    }
                }

            }
        }

    }
}

class p6{
    public static void main(String[] args) {
        System.out.println("hell well");
    }
}