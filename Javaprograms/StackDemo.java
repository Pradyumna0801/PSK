import java.util.*;
public class StackDemo {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackDemo(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " inserted");
        print();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating an error
        }
        int value = stackArray[top--];
        System.out.println(value + " popped");
        print();
        return value;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size for stack: ");
        int size = scanner.nextInt();
        StackDemo stack = new StackDemo(size);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.print("Enter element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                    }
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        stack.pop();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
