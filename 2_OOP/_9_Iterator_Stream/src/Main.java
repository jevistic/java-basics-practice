import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator and Stream!");


        //basic example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter and print even numbers
        System.out.println("Even numbers:");
        List<Integer> l = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(l);

        // Calculate and print the sum of all numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all numbers: " + sum);

        // Create a new list with squared values
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList(); // In Java 16+, use .collect(Collectors.toList())
        System.out.println("Squared numbers: " + squaredNumbers);




        //person example

        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));
        people.add(new Person("Eve", 40));

        // Use Stream API for various operations
        List<String> namesOfPeopleOver30 = people.stream()
                .filter(person -> person.getAge() > 30) // Filter people over 30
                .map(Person::getName) // Method reference to instance method
                .toList(); // Collect the names into a list

        System.out.println("\nPeople over 30: " + namesOfPeopleOver30);



        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge)) // Sort by age
                .toList();

        System.out.println("People sorted by age: " + sortedByAge);


        int sumOfAges = people.stream()
                .mapToInt(Person::getAge) // Method reference to instance method
                .sum(); // Calculate the sum of ages

        System.out.println("Sum of ages: " + sumOfAges);





        //Iterator

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Create an Iterator for the list
        Iterator<String> iterator = fruits.iterator();

        // iterate over the list
        System.out.println("\nIterating over the list using an Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // remove elements while iterating
        iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // Remove "Banana"
            }
        }

        // Print the modified list
        System.out.println("\nList after removing 'Banana':");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }




    }
}