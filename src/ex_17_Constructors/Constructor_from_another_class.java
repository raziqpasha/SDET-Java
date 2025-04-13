package ex_17_Constructors;

public class Constructor_from_another_class {
    public static void main(String[] args) {
student s1 = new student();
        student s2 = new student("rp",989,98.00);
        student s3 = new student(99);

        s1.display();
    }
}


class student{

    String name;
    int age;
    Double percentage;

    student(){
        this(89);// call constructor2
        System.out.println("constructor1");

    }

    student(int age){
        this("raziq",23,91.00); // call constructor 3
        System.out.println("constructor2");
    }

    student(String name,Integer age , Double percentage){
        this.name=name;
        this.age=age;
        this.percentage=percentage;
        System.out.println("constructor3");

    }

   void display(){
       System.out.println("name:"+this.name + " age:"+ this.age + " percentage:"+this.percentage);
   }

}