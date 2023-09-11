import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hash Map");

        // Create a HashMap
        HashMap<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs
        myMap.put("John", 25);
        myMap.put("Alice", 30);
        myMap.put("Bob", 28);
        myMap.put("Eve", 22);

        // get value by key
        int age = myMap.get("Alice"); // Output: 30

        // containsKey method
        boolean containsKey = myMap.containsKey("Bob"); // true

        // containsValue method
        boolean containsValue = myMap.containsValue(22); // true

        // Removing a key-value pair
        myMap.remove("Eve");


        // Getting all keys as a set
        Set<String> keys = myMap.keySet();

        // if the HashMap is empty
        boolean isEmpty = myMap.isEmpty(); // false

        // Getting the size
        int size = myMap.size(); // 3

        // Clearing
        myMap.clear();

        // if the HashMap is empty now
        isEmpty = myMap.isEmpty(); // true

    }
}