package ex_23_Polymorphism;

public class Lab126_MethodOverriding_polymorphism {
    public static void main(String[] args) {
        //Dynamic dispatch means that Java decides at runtime which version of
        // the overridden method to call — based on the object type, not the reference type.

  Animal a1 = new Dog();
        System.out.println(a1.Sound(200));
    }
}

class Animal{
   int Sound(int a){

        System.out.println("beeeee");
        return 100;
    }

}

class Dog extends Animal{
    @Override
    int Sound( int b){
        System.out.println("bark!");

        return 200;
    }
}