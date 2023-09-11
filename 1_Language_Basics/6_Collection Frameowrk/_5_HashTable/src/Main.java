import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hash Table!");

        // Create a Hashtable
        Hashtable<String, Integer> myHashtable = new Hashtable<>();

        // Adding key-value pairs
        myHashtable.put("John", 25);
        myHashtable.put("Alice", 30);
        myHashtable.put("Bob", 28);
        myHashtable.put("Eve", 22);

        // Accessing values by key
        int age = myHashtable.get("Alice"); // Output: 30

        // containsKey
        boolean containsKey = myHashtable.containsKey("Bob"); // true

        // containsValue
        boolean containsValue = myHashtable.containsValue(22); // true

        // remove
        myHashtable.remove("Eve");


        // isEmpty
        boolean isEmpty = myHashtable.isEmpty(); // false

        // size
        int size = myHashtable.size(); // 3

        // clear
        myHashtable.clear();

        // isEmpyut
        isEmpty = myHashtable.isEmpty(); // true


    }
}