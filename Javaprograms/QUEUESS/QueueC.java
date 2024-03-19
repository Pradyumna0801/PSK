import java.util.*;
public class QueueC {
    public static void main(String[] args) {
        //Queue using LinkedList
        System.out.println("Queue Using ArrayList");
        LinkedList<Integer> q = new LinkedList<>(); 
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        //Queue using LinkedList
        System.out.println("Queue using LinkedList");
        Queue<Integer> qu = new LinkedList<>(); 
        qu.add(10);
        qu.add(20);
        qu.add(30);

        while (!qu.isEmpty()) {
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}
