package fi.utu.tech.ooj.exercise2.tehtava1;
import java.util.LinkedList;
import java.util.Queue;

public class Hkohta {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements into the queue
        for (int i = 0; i < 10; i++)
            queue.add(i);

        // Offering is another way to add elements into queue. Returns true if successful.
        queue.offer(11);

        // Print out elements in the queue
        System.out.println(queue);

        // To view the head of queue
        try {
            int head = queue.peek();
            System.out.println(head);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        // Same as peek, but throws an exception if the queue is empty.
        int headExp = queue.element();
        System.out.println(headExp);

        // Remove head
        int removed = queue.remove();
        System.out.println(removed);
        System.out.println(queue);

        // Returns size
        int size = queue.size();
        System.out.println(size);
    }
}