package ex_18_Single_Inheritance;

public class Lab118_Inheritance_concept {
    public static void main(String[] args) {
       // Son s1 = new Father(); // not possible because when father was born son was not there
        //Father cannot acces the son properites


        //son can access father properites
        Son s1 = new Son();
        s1.home();

        //Daughert can access father properites
        Son s2 = new Daughert(); // when daughert was born son was there present
        s2.home();
     //   s2.Home(); // but son(brother) cannot acccess Daughert(sister) properities
        s2.personalHome(); // son can access his own house

    //    Daughert d1 = new Son(); // daugher(sister) was not available when son(brother) was born


    }
}

class Father{
    void home(){
        System.out.println("2bhk house");
    }

}

class Son extends Father{

    void personalHome(){
        System.out.println("villa home");
    }

}

class Daughert extends Son {
void Home(){
    System.out.println("5bhk");
}

}


