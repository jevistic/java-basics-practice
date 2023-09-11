import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array List");

        // Create an ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Adding elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");

        // Accessing elements
        System.out.println("Element at index 2: " + myList.get(2)); //Cherry

        // Modifying elements
        myList.set(1, "Blueberry"); // It will replace "Banana" with "Blueberry"

        // Iterating
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Removing elements
        myList.remove("Date"); // It will remove "Date" from the ArrayList

        // if an element exists
        boolean containsApple = myList.contains("Apple"); // true

        // isEmpty
        boolean isEmpty = myList.isEmpty(); // false

        // Get size
        int size = myList.size(); // 3

        // Sorting
        Collections.sort(myList);

        // Clearing
        myList.clear();

        // isEmpty
        isEmpty = myList.isEmpty(); // true
    }
}