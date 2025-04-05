package ex_17_Constructors;

public class Lab116_Constructor_Default_Automatically {
    public static void main(String[] args) {
        // in java constuctor is called by default automatically if there not piece of the code also
        automaticallyCalledConstructor a1 =new automaticallyCalledConstructor();

        Car c = new Car();
        System.out.println(c.name);
    }
}

class automaticallyCalledConstructor{
    automaticallyCalledConstructor(){

    }

}

class Car{
    String name;
    String Model;
    int year;
    int milege;

    Car(){
        name ="swift";
        Model="xyz";
        year=2001;
        milege=20;
    }
}

