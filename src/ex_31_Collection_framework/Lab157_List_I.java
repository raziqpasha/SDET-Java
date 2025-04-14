package ex_31_Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab157_List_I {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","mango");
        System.out.println(fruits);
       // fruits.add("chikku"); //java.lang.UnsupportedOperationException
   //     System.out.println(fruits);
       // fruits.remove("apple"); //not possible
   //     System.out.println(fruits);

        List l = new ArrayList(); // dynamic dispatch- father
      ArrayList l1 = new ArrayList(); //child
        ArrayList l2 = new ArrayList();
        l.add(6);
        l.add(4);
        l.add(3);
        System.out.println(l);
        System.out.println(l.isEmpty());

        l1.add("rp");
        l1.add("tp");
        l1.add("kp");
        l1.add(5);
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
        System.out.println(l1.contains("kp"));
        System.out.println(l1.indexOf("kp"));
        System.out.println(l1.lastIndexOf(3)); //-1 bcz there is no value at all "3

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        boolean tf = l2.isEmpty();
        System.out.println(tf);
    }
}
