

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to insert a new node at the end of the doubly linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to display the doubly linked list in forward direction
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to display the doubly linked list in backward direction
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList ls = new DoublyLinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(3);
        ls.append(4);
        ls.append(5);


        System.out.println("Forward:");
        ls.displayForward();
        System.out.println("Backward:");
        ls.displayBackward();
    }
}
