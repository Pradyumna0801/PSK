import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        // Create a Queue
        Queue<Integer> q = new LinkedList<>();

        // Enqueue elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue after enqueue elements: " + q);

        // Dequeue element
        int removedElement = q.poll();
        System.out.println("Element dequeued: " + removedElement);
        System.out.println("Queue after dequeue element: " + q);

        // Peek element
        int peekedElement = q.peek();
        System.out.println("Element peeked: " + peekedElement);
        System.out.println("Queue after peeking element: " + q);

        // Check if the queue is empty
        boolean isEmpty = q.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int size = q.size();
        System.out.println("Size of the queue: " + size);
    }
}

    

