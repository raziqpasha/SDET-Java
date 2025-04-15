package ex_32_collectionFramework_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab163_Hashset_LinkedHashset_TreeSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        //hashset use hashing mechanism to store the element
        // no order
        // no duplicate
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add(null);
        set.add(null);
       // set.add(123); -> it accept only the string
        System.out.println(set);

        System.out.println("---------------for each loop--------");

        for(String s:set){
            System.out.println(s);
        }

        System.out.println("------Iterator---------");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

      //  LinkedHashSet<Object> lhst = new LinkedHashSet();
        LinkedHashSet<String> lhst = new LinkedHashSet();
   //     LinkedHashSet<Integer> lhst = new LinkedHashSet();

        //LinkedHashSet mechanism to store the element
        //order will maintain
        //no duplicates

        lhst.add("dapple");
        lhst.add("apple");
        lhst.add("Apple");
        lhst.add("mango");
        lhst.add("watermelon");
        lhst.add("watermelon");
       // lhst.add(99);
        System.out.print(lhst);
        System.out.println(lhst.isEmpty());
        System.out.println(lhst.contains("watermelon"));
        System.out.println(lhst.size());


        System.out.println("-----------TreeSet------------");
        //black and red tree mechanism to store the element
        //order is maintain , natural sorting is done
        //natural sorting -> is deply on ascoii characters
        TreeSet<String> ts = new TreeSet();
        ts.add("dapple");
        ts.add("apple");
        ts.add("Apple");
        ts.add("mango");
        ts.add("watermelon");
        ts.add("watermelon");
        ts.add("Zebra");
        System.out.println(ts);

        System.out.println("---------for each--------");
        for(Object o : ts){
            System.out.println(o);
        }
    }
}
