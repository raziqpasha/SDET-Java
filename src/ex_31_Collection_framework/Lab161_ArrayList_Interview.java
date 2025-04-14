package ex_31_Collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Lab161_ArrayList_Interview {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("raziq");
        l.add("raziqqq");
        l.add("raziqqqqqqqqqq");

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);


    }
}
