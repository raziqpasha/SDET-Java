package ex_31_Collection_framework;

import java.util.LinkedList;
import java.util.List;

public class Lab158_Linkedlist {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(0.98);
        list.add(0.08);
        list.add(0.908);
        list.add(0.00900);
        System.out.println(list);

        LinkedList<String> ll = new LinkedList();
        ll.add("dog->");
        ll.add("cat->");
        ll.add("lion->");
        ll.add("fish->");
        ll.add("elephant");
        System.out.println("Linkedlist:"+ ll);

        //accessing element
        System.out.println("firstelement:" + ll.getFirst());
        System.out.println("lastelement:" + ll.getLast());

        System.out.println(ll);
        //removing element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("linkedlist after removal: "+ll);

        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains("lion->+"));
        System.out.println(ll.indexOf("zebra"));


    }
}
