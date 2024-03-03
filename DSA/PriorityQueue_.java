package DSA;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_ {
    public static void main(String[] args) {
        PriorityQueue<Integer>p = new PriorityQueue<>();
        p.add(4);
        p.add(1);
        p.add(7);
        p.add(15);
        p.add(5);
        p.add(10);
        // will print smallest element as it follows min-heap by default, in the PQ forget rest ordering after smallest element
        System.out.println(p);
        while (!p.isEmpty()){
            System.out.print(p.peek()+" ");
            p.poll();
        }
        System.out.println();
        PriorityQueue<Integer>p1 = new PriorityQueue<>(Comparator.reverseOrder());
        p1.add(4);
        p1.add(1);
        p1.add(7);
        p1.add(15);
        p1.add(5);
        p1.add(10);
        // will print largest element
        System.out.println(p1.peek());
        System.out.println(p1);
        p1.poll();
        System.out.println(p1.peek());
        p1.poll();
        System.out.println(p1.peek());p1.poll();
        System.out.println(p1.peek());

    }
}
