package ex_16_OOPS;

public class Lab112_ooPs {
    public static void main(String[] args) {
        //Person p1
        Person p1 = new Person();

        // Person -> class
      //  p1 -> object reference
        //new Person() -> object

        p1.name = "raziq";
        System.out.println(p1.name);

        Person p3 = new Person();
        p3.remaining_sal_amount(26321,200);
        System.out.println(p3.remaining_sal_amount(26321,200));

        new Person().name ="no ref object"; //null , hence string is by default null
        System.out.println(new Person().name);

       new Person().sleep(); //iam sleeping
    }
}
    class Person{
        String name;
        String ph_no;
        String color_eyes;
        int legs;
        double salary;
        byte age;
        double weight;
        boolean isMale;

        // 1.Without Parameters and Without Return Type
        void sleep(){
            System.out.println("iam sleeping");
        }

// 2.Without Parameters but With Return Type
            String greet(String name){
            return name +"hello";
            }

// 3.With Parameters and Without Return Type
        void talk(byte age){
            System.out.println("iam talkitive");
        }

        // 4. With Parameters and With Return Type
        int remaining_sal_amount(int sal ,int tax){
            return sal - tax;
        }

    }


