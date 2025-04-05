package ex_17_Constructors;

public class Lab117_Parameterized_Constructor {
     public static void main(String[] args) {
           Cars c = new Cars();
            System.out.println(c.name);

         Cars1 c1 = new Cars1("volvo","yy",123,40);
         c1.name ="skoda";
         System.out.println(c1.name);
         System.out.println(c1.Model);
         System.out.println(c1.year);
         System.out.println(c1.milege);


         Cars1 c2 = new Cars1("benz");
         System.out.println(c2.name);



     }
    }

   

    class Cars{
        String name;
        String Model;
        int year;
        int milege;

        Cars(){
            name ="swift";
            Model="xyz";
            year=2001;
            milege=20;
        }
    }

    //constructor overloading and parameting constructor
class Cars1{
    String name;
    String Model;
    int year;
    int milege;

    Cars1(String name,String Model,int year,int milege){
      this. name =name;
       this. Model=Model;
        this.year=year;
       this. milege=milege;
    }

    Cars1(String name,int year,int milege){
        this. name =name;
        this. Model=Model;
        this.year=year;
        this. milege=milege;
    }
    Cars1(String name,String Model,int year){
        this. name =name;
        this. Model=Model;
        this.year=year;
        this. milege=milege;
    }

    Cars1(String name){
        this. name =name;
        this. Model=Model;
        this.year=year;
        this. milege=milege;
    }
}



