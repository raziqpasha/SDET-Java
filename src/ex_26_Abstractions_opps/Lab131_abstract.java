package ex_26_Abstractions_opps;

public class Lab131_abstract {
    public static void main(String[] args) {
//Father f1 = new Father(); // it is not posssible , bcz father is incomplete class
        child c1 = new child();
      //  Father f2 = new child(); //possible
        c1.loan25k();
        c1.loan50k();
    }
}
abstract class Father{
    abstract void loan50k();

    void loan25k(){
        System.out.println("taken 25k loan");
    }

}

class child extends Father{
    @Override
    void loan50k(){
        System.out.println("completed loan for 50k");
    }
}