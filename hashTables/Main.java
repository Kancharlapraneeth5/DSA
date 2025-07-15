package hashTables;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        
        // Inserting key-value pairs into the hash table
        myHashTable.insert("name", "Alice");
        myHashTable.insert("age", "30");
        myHashTable.insert("city", "New York");
        
        // Retrieving values from the hash table
        System.out.println("Name: " + myHashTable.get("name")); // Output: Alice
        System.out.println("Age: " + myHashTable.get("age"));   // Output: 30
        System.out.println("City: " + myHashTable.get("city")); // Output: New York
        
        // Attempting to retrieve a non-existent key
        System.out.println("Country: " + myHashTable.get("country")); // Output: null
    }
}
