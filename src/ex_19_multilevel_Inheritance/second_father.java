package ex_19_multilevel_Inheritance;

public class second_father extends First_GrandFather {

    String vehicle(String vehicle){
        return "take mi First_GrandFather vehicles " + vehicle;
    }

    void home(){
        System.out.println("taken mi First_GrandFather home and mi 2bhk home ");
    }
}
