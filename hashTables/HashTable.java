package hashTables;

import java.util.ArrayList;

public class HashTable{
    int size = 7;
    Node[] hashTable;
    // Node class represents each entry in the hash table.
    // Each node contains a key, value, and a reference to the next node in case
    protected class Node{
        String key;
        String value;
        Node next;
        Node(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    // Constructor initializes the hash table with a fixed size.
    public HashTable(){
        hashTable = new Node[size];
    }

    // Method gives us the index in the hash table for a given key after hashing it.
    private int hash(String key){
        int hashValue = 0;
        char[] characters = key.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int asciiValue = characters[i];
            hashValue = (asciiValue * 31 + characters[i]) % size; // Using a prime number for better distribution
        }
        return hashValue;
    }

    // Method to insert a key-value pair into the hash table.
    public void insert(String key, String value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (hashTable[index] == null) {
            hashTable[index] = newNode;
        } else{
            Node current = hashTable[index];
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode; // Append the new node at the end of the linked list
        }
    }

    // Method to retrieve a value associated with a key from the hash table.
    public String get(String key){
        int index = hash(key);
        Node current = hashTable[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value; // Return the value if the key matches
            }
            current = current.next; // Move to the next node in the linked list
        }
        return null; // Return null if the key is not found
    }

    // Method to retrieve all keys stored in the hash table.
    public ArrayList<String> getKeys(){
        ArrayList<String> keys = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Node current = hashTable[i];
            while (current != null) {
                keys.add(current.key); // Add each key to the list
                current = current.next; // Move to the next node
            }
        }
        return keys; // Return the list of keys
    }
    
    // Method to print the values in the hash table associated with their keys at each index.
    public void print(){
        for (int i = 0; i < size; i++){
            Node current = hashTable[i];
            System.out.println("Index " + i + ": ");
            while (current != null) {
                System.out.println("Key: " + current.key + ", Value: " + current.value);
                current = current.next;
            }
            if (hashTable[i] == null) {
                System.out.println("Empty");
            }
        }
    }
}