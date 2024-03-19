//package LINKEDLISTT;
import java.util.*;
public class LinearLL {
   static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class LinkedList {
        private Node head;
    
        public LinkedList() {
            this.head = null;
        }
    
        // Method to insert a new node at the end of the linked list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    
        // Method to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    
    }   
        public static void main(String[] args) {
            LinkedList l = new LinkedList();
            l.append(1);
            l.append(2);
            l.append(3);
            l.append(4);
            l.display();
        }
    
    }
    

