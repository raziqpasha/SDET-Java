package ex_31_Collection_framework_LIST;

import java.util.Iterator;
import java.util.Vector;

public class Lab159_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("rp");
        v.add(09.90);
        v.add(45);
        System.out.println(v);

        System.out.println("for each loop");
        for(Object ob :v){
            System.out.print(ob+" ,");
        }
        System.out.println();
        System.out.println("iterator---------");
        Iterator it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
