package ex_17_Constructors;

public class Lab115_default_Constructor {
    public static void main(String[] args) {
        // constuctor is automatically called which object is created
        Baby by = new Baby();
       // by.name;
        System.out.println(by.name); //null

        //can change the value which is define in the class
        by.name ="pasha";

       // Baby by1;

        //by object called method
        new Baby().eat();

    }
}
    class Baby{
        //attribute , variable , memeber data, memeber variable, instance variable
        String name;
        String name1 ="Raziq";

        void eat(){
            System.out.println("eating");
        }
        void cry(){
            System.out.println("crying");
        }
        void sleep(){
            System.out.println("sleeping");
        }

        //default constructor
        Baby(){
            System.out.println("hi, iam baby");
        }




}
