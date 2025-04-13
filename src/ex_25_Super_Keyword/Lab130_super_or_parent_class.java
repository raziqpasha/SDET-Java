package ex_25_Super_Keyword;

public class Lab130_super_or_parent_class {
    public static void main(String[] args) {
       Vehicle vObj= new Car(1000);
        vObj.display();
    }
}
class Vehicle{
    Integer maxSpeed =150;
    Integer lowSpeed;
    Vehicle(Integer lowSpeed){
        this.lowSpeed=lowSpeed;
    }

    void display(){
        System.out.println("iam vechicle class but representing parent class");
    }
}

class Car extends Vehicle{
Integer mediumSpeed =450;
    Car(Integer lowSpeed) {
        super(lowSpeed);
    }

    @Override
    void display(){
        System.out.println(this.mediumSpeed); //450
        super.display(); //iam vechicle class but representing parent class
        System.out.println(super.maxSpeed); //150
    }
}