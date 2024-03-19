//package HASHTable;
import java.util.*;
class HashTableLinearChaining {
    private LinkedList<Integer>[] table;
    private int size;

    // Constructor
    public HashTableLinearChaining(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++)
            table[i] = new LinkedList<>();
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Insertion
    public void insert(int key) {
        int index = hash(key);
        table[index].add(key);
    }

    // Deletion
    public void delete(int key) {
        int index = hash(key);
        table[index].remove((Integer) key);
    }

    // Search
    public boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    // Display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "]: ");
            for (Integer item : table[i])
                System.out.print(item + " ");
            System.out.println();
        }
    }
}

// Main class
public class LinearChaining {
    public static void main(String[] args) {
        HashTableLinearChaining hashTable = new HashTableLinearChaining(10);
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(35);
        hashTable.insert(45);
        hashTable.insert(55);
        hashTable.delete(15);
        hashTable.display();
        System.out.println("Search for 35: " + hashTable.search(35));
        System.out.println("Search for 15: " + hashTable.search(15));
    }
}

    

