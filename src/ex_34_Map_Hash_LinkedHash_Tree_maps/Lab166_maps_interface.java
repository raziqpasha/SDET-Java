package ex_34_Map_Hash_LinkedHash_Tree_maps;

import javax.management.ObjectName;
import java.util.*;

public class Lab166_maps_interface {
    public static void main(String[] args) {
        //HashMap
        Map<String,Integer> hp = new HashMap(); //unordered
       // hp.put("key1","value1");//value shud be integer it show error
        hp.put("key1",1);
        hp.put("key2",2);
        hp.put("key3",3);
        hp.put("key4",4);
        hp.put("key5",5);
        hp.put("key6",6);
        System.out.println(hp); //{key1=1, key2=2, key5=5, key6=6, key3=3, key4=4} ->unordered
        System.out.println(hp.size());
        System.out.println(hp.isEmpty());
        System.out.println(hp.containsKey("key1"));
        System.out.println(hp.containsValue(5));
        for(Map.Entry<String,Integer> item : hp.entrySet()){
            System.out.print(item.getKey() + "-> "+ item.getValue()+" ,");
        }
        System.out.println();
        System.out.println(hp.keySet()); //[key1, key2, key5, key6, key3, key4]
        System.out.println(hp.values());//[1, 2, 5, 6, 3, 4]

        System.out.println("----------linkedhasmap-----------");
        //LinkedHashmap ->order is maintained
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap();
        lmap.put("key1",1);
        lmap.put("key2",2);
        lmap.put("key3",3);
        lmap.put("key4",4);
        lmap.put("key5",5);
        lmap.put("key6",6);
        System.out.println(lmap);//{key1=1, key2=2, key3=3, key4=4, key5=5, key6=6} ->order is maintained
        System.out.println(lmap.size());
        System.out.println(lmap.isEmpty());
        System.out.println(lmap.containsKey("key1"));
        System.out.println(lmap.containsValue(5));
        for(Map.Entry<String,Integer> item : lmap.entrySet()){
            System.out.print(item.getKey() + "-> "+ item.getValue()+" ,");
        }
        System.out.println();
        System.out.println(lmap.keySet()); //[key1, key2, key3, key4, key5, key6]
        System.out.println(lmap.values()); //[1, 2, 3, 4, 5, 6]

        System.out.println("----------Treemap------");
        //treemap is natural sorted order
        TreeMap<String,Integer> tm = new TreeMap();
        tm.put("lucky1",1);
        tm.put("kumar2",2);
        tm.put("raziq3",3);
        tm.put("pasha4",4);
        tm.put("dutta5",5);
        tm.put("LG6",6); //L is upper case so it is on the top
        System.out.println(tm); //{LG6=6, dutta5=5, kumar2=2, lucky1=1, pasha4=4, raziq3=3}> natural sorted order
        System.out.println(tm.size());
        System.out.println(tm.isEmpty());
        System.out.println(tm.containsKey("key1"));
        System.out.println(tm.containsValue(5));
        for(Map.Entry<String,Integer> item : tm.entrySet()){
            System.out.print(item.getKey() + "-> "+ item.getValue()+" ,");
        }
        System.out.println();
        System.out.println(tm.keySet());//[LG6, dutta5, kumar2, lucky1, pasha4, raziq3]
        System.out.println(tm.values());//[6, 5, 2, 1, 4, 3]

        System.out.println("---------------------list interface----------------");
        List objectRef = new ArrayList();
        objectRef.add(hp);
        objectRef.add(lmap);
        objectRef.add(tm);
        System.out.println(objectRef);//[{key1=1, key2=2, key5=5, key6=6, key3=3, key4=4},
        // {key1=1, key2=2, key3=3, key4=4, key5=5, key6=6},
        // {LG6=6, dutta5=5, kumar2=2, lucky1=1, pasha4=4, raziq3=3}]
        Iterator it = objectRef.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); //{key1=1, key2=2, key5=5, key6=6, key3=3, key4=4}
        //    {key1=1, key2=2, key3=3, key4=4, key5=5, key6=6}
         //   {LG6=6, dutta5=5, kumar2=2, lucky1=1, pasha4=4, raziq3=3}

        }



    }
}
