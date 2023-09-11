import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashSet");

        HashSet<String> mySet = new HashSet<>();

        // Adding elements
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Date");

        // Adding a duplicate  (will noit be added)
        mySet.add("Apple");

        // Iterating
        System.out.println("Iterating through the HashSet:");
        for (String fruit : mySet) {
            System.out.println(fruit);
        }

        // contains method
        boolean containsCherry = mySet.contains("Cherry"); // true

        // Removing an element
        mySet.remove("Date");

        // isEmpty method
        boolean isEmpty = mySet.isEmpty(); // false

        // getting size
        int size = mySet.size(); // 3

        // Clear
        mySet.clear();

        // isEmpty
        isEmpty = mySet.isEmpty(); // true

        // Create a HashSet of integers
        HashSet<Integer> numberSet = new HashSet<>();

        // Adding elements to the HashSet
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);

        // Checking for intersection with another set
        HashSet<Integer> otherSet = new HashSet<>();
        otherSet.add(1);
        otherSet.add(3);
        otherSet.add(5);


        //intersection
        HashSet<Integer> intersection = new HashSet<>(numberSet);
        intersection.retainAll(otherSet);
        System.out.println("Intersection: "+ intersection);

        //Union
        HashSet<Integer> union = new HashSet<>(numberSet);
        union.addAll(otherSet);
        System.out.println("Union: "+ union);

        //difference
        HashSet<Integer> difference = new HashSet<>(numberSet);
        difference.removeAll(otherSet);
        System.out.println("Difference: "+ difference);

    }
}