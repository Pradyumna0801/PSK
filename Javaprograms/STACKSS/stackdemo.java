//package STACKSS;
import java.util.*;
public class stackdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        Stack stack = new Stack(capacity); // Creating a stack with user-defined capacity

        while (true) {
            System.out.println("\nEnter an operation to perform (push/pop/exit):");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            } else if (operation.equalsIgnoreCase("push")) {
                System.out.print("Enter element to push onto the stack: ");
                int element = scanner.nextInt();
                stack.push(element);
            } else if (operation.equalsIgnoreCase("pop")) {
                try {
                    stack.pop();
                } catch (EmptyStackException e) {
                    System.out.println("Stack is empty. Cannot pop.");
                }
            } else {
                System.out.println("Invalid operation. Please enter 'push', 'pop', or 'exit'.");
            }
        }

        scanner.close();
    }

    public static class Stack {
        private int[] stackArray;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public Stack(int capacity) {
            this.capacity = capacity;
            stackArray = new int[capacity];
            top = -1; // Stack is initially empty
        }

        // Push operation to add an element to the top of the stack
        public void push(int element) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push element " + element);
                return;
            }
            stackArray[++top] = element; // Increment top and insert the element
            System.out.println("Pushed element: " + element);
            displayStack();
        }

        // Pop operation to remove and return the top element from the stack
        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Throw exception if stack is empty
            }
            int poppedElement = stackArray[top--]; // Get the top element and decrement top
            System.out.println("Popped element: " + poppedElement);
            displayStack();
            return poppedElement;
        }

        // Peek operation to return the top element from the stack without removing it
        public int peek() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Throw exception if stack is empty
            }
            return stackArray[top]; // Return the top element
        }

        // Utility method to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Utility method to check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Utility method to display the stack
        public void displayStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
