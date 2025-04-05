package ex_21_hirerachical_Inheritance;

public class Lab123_hirerachicalInheritance {
    public static void main(String[] args) {
        Father f1= new Father();

        Father f2 = new First_son();
        f2.property();
        f2.car();
        f2.funds();

        System.out.println("----------------------------");
        Father f3 = new Second_son();
        f3.property();
        f3.car();
        f3.funds();
        System.out.println("----------------------------");

        Father f4 = new third_Daughter();
        f4.property();
        f4.car();
        f4.funds();

       // First_son fs = new Second_son();
       // fs.loan();


    }
}

class Father{
    void property(){
        System.out.println("i have own  properities by miself");
    }

    void car(){
        System.out.println("i have own car by miself");

    }

    void funds(){
        System.out.println("i have 3 croroe funds in cureent running market");
    }
}

class First_son extends Father{


}
/*
class Second_son extends First_son {
    void loan(){
        System.out.println("5laks intrest loan");
    }

}
*/

class Second_son extends Father {


}
class third_Daughter extends Father {

}