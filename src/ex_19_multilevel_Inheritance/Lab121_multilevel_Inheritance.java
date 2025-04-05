package ex_19_multilevel_Inheritance;

public class Lab121_multilevel_Inheritance {
    public static void main(String[] args) {
        First_GrandFather gf = new First_GrandFather();
        gf.vehicle("scropio","volvo");
        System.out.println(gf.vehicle("scropio  " , "volvo"));
        gf.home();


        //dynamic dispatch --concept
        second_father sf = new second_father();
        First_GrandFather gf1 = new second_father();

        sf.home();
        System.out.println(sf.vehicle("bmw"));

        gf1.home();
        System.out.println(gf1.vehicle("scropio" , "volvo"));


         second_father s1 = new third_son();
         s1.home();



    }
}
