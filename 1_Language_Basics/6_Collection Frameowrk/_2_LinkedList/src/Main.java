import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");

        // Create a LinkedList
        LinkedList<String> myList = new LinkedList<>();

        // Adding elements
        myList.add("Car");
        myList.add("Bike");
        myList.add("Truck");
        myList.add("Balloon");

        // Accessing elements
        System.out.println("Element at index 2: " + myList.get(2)); // Cherry

        // Modifying elements
        myList.set(1, "Blueberry"); // It will replace "Banana" with "Blueberry"

        // Iterating
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Removing elements
        myList.remove("Balloon"); // It will remove "Balloon" from the LinkedList

        // contains method
        boolean containsApple = myList.contains("Apple"); // true

        // isEmpty method
        boolean isEmpty = myList.isEmpty(); // false

        // size method
        int size = myList.size(); // 3


        // Clearing
        myList.clear();

        // isEmpty
        isEmpty = myList.isEmpty(); // true

    }
}