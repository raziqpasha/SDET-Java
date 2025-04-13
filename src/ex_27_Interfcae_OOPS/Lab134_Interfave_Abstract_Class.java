package ex_27_Interfcae_OOPS;

public class Lab134_Interfave_Abstract_Class {
    public static void main(String[] args) {
one obj = new one();
obj.display();
        System.out.println(obj.a);
        System.out.println(obj.a=20);
    }
}
class one extends Incomplete_abstract implements Incomplete_interface {

    @Override
    public void display() {
        Incomplete_interface.super.display(); //use these for calling interface
        super.display(); // use these for calling abstraction
    }
}

interface Incomplete_interface{
   // int a=10; inside interface it is final cannot changed
default void display(){
    System.out.println("this is simple1");
}
static void display1(){
    System.out.println("these is allowed");
}
}

abstract class Incomplete_abstract{
    int a=10;

    void display(){
        System.out.println("abstract method is simple");
    }

}