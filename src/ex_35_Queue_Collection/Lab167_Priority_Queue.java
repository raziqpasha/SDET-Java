package ex_35_Queue_Collection;

import java.util.PriorityQueue;

public class Lab167_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue();// only one wrapper class can be add
        pq.add("raziq");
        pq.add("pasha");
        pq.add("rpq");
        System.out.println(pq);//[pasha, raziq, rpq]
        System.out.println(pq.peek()); //pasha
        System.out.println(pq);//[pasha, raziq, rpq]
        System.out.println(pq.poll());//pasha
        System.out.println(pq);//[raziq, rpq]
    }
}
