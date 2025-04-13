package ex_27_Interfcae_OOPS;

public class Lab133_Interfceses {
    public static void main(String[] args) {
       // Father f1 = new Father();// father is an abstract ,incomplete and cannot be instianted
        child c1 = new child();
        c1.triangle(10,30);
        Daughter d1 = new Daughter();
        d1.triangle(50,80);
        multipleInheritance obj1 = new multipleInheritance();
        obj1.triangle(10,20);
    }
}

interface Father{
    void triangle(int length, int breath);
        }

        interface Mother{

            void triangle(int length, int breath);
        }

        class child implements Father{
            @Override
            public void triangle(int length, int breath){
                System.out.println("lenght:" + length + " breath:" + breath);
            }
        }

        class Daughter implements Father{

            @Override
            public void triangle(int length, int breath) {
                System.out.println("daugher class");
            }
        }

        class multipleInheritance implements Father,Mother{

            @Override
            public void triangle(int length, int breath) {
                System.out.println("print length and breath");
            }
        }