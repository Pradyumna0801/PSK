//package HASHTable;
import java.util.*;
    class HashTableLinearProbing {
        private int[] table;
        private int size;
    
        // Constructor
        public HashTableLinearProbing(int size) {
            this.size = size;
            table = new int[size];
        }
    
        // Hash function
        private int hash(int key) {
            return key % size;
        }
    
        // Insertion
        public void insert(int key) {
            int index = hash(key);
            while (table[index] != 0)
                index = (index + 1) % size;
            table[index] = key;
        }
    
        // Deletion
        public void delete(int key) {
            int index = hash(key);
            while (table[index] != key)
                index = (index + 1) % size;
            table[index] = 0;
        }
    
        // Search
        public boolean search(int key) {
            int index = hash(key);
            while (table[index] != key) {
                index = (index + 1) % size;
                if (table[index] == 0 || index == hash(key))
                    return false;
            }
            return true;
        }
    
        // Display
        public void display() {
            for (int i = 0; i < size; i++) {
                if (table[i] != 0)
                    System.out.println("[" + i + "]: " + table[i]);
                else
                    System.out.println("[" + i + "]: Empty");
            }
        }
    }
    public class LinearProbing {
        public static void main(String[] args) {
            HashTableLinearProbing hashTable = new HashTableLinearProbing(10);
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
    
    

