package ex_32_collectionFramework_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab162_SET {
    public static void main(String[] args) {
        Set hst = new HashSet();
        Set lhst = new LinkedHashSet();
        Set ts = new TreeSet();

        //set doesnot allow to print duplicate elements
        hst.add("raziq");
        hst.add(124);
        hst.add("raziq");
        hst.add("pasha");
        System.out.println(hst);

        lhst.add("raziq");
        lhst.add(124);
        lhst.add("raziq");
        lhst.add("pasha");
        System.out.println(lhst);

        ts.add("raziq");
        ts.add(124);
        ts.add("raziq");
        ts.add("pasha");
        System.out.println(ts);

    }
}
