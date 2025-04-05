package ex_23_Polymorphism;

public class Lab125_MethodOverloaing_polymorphism {
    public static void main(String[] args) {
        method_overloading m1 = new method_overloading();
        System.out.println("the these only 2 parameteised:" + m1.add(10, 20));

        System.out.println("the these only 3 parameteised:" + m1.add(10, 20,30));

        System.out.println("the these only 2 double parameteised:" + m1.add(2.40, 6.097));

    }
}

class method_overloading{
    // in method_overloading, the method have same name with different parameters
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }


}