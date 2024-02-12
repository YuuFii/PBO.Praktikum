package PBO.Collection.PriorityQueue;
import java.util.*;

public class Queue1 {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Adi");
        queue.add("Putra");
        queue.add("Tari");
        queue.add("Syila");
        System.out.println("Head : " + queue.element());
        System.out.println("Head : " + queue.peek());
        System.out.println("Iterating the queue elements : ");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(" - " + itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements : ");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(" - " + itr2.next());
        }
        queue.add("Nico");
        queue.add("Arya");
        System.out.println("Head : " + queue.peek());

        System.out.println("After adding two elements : ");
        Iterator<String> itr3 = queue.iterator();
        while (itr3.hasNext()) {
            System.out.println(" - " + itr3.next());
        }
    }
}
