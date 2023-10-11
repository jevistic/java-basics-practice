import com.example.aggregation.Book;
import com.example.aggregation.Library;
import com.example.association.Course;
import com.example.association.Student;
import com.example.composition.House;
import com.example.composition.Room;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Aggregation!");

        // Create a library
        Library library = new Library("My com.example.aggregation.Library");

        // Create books
        Book book1 = new Book("com.example.aggregation.Book 1", "Author 1");
        Book book2 = new Book("com.example.aggregation.Book 2", "Author 2");

        // Add books to the library (Aggregation)
        library.addBook(book1);
        library.addBook(book2);

        // Retrieve books
        List<Book> libraryBooks = library.getBooks();
        for (Book book : libraryBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }




        System.out.println();
        System.out.println("Composition!");

        // Create a house
        House myHouse = new House("123 Main St.");

        // Create and add rooms to the house (Composition)
        Room livingRoom = new Room("Living com.example.composition.Room", "Wooden", "Large");
        Room bedroom = new Room("Bedroom", "Steel", "Small");

        myHouse.addRoom(livingRoom);
        myHouse.addRoom(bedroom);

        // Access information about the house and its rooms
        System.out.println("com.example.composition.House Address: " + myHouse.getAddress());

        List<Room> houseRooms = myHouse.getRooms();
        for (Room room : houseRooms) {
            System.out.println("com.example.composition.Room: " + room.getName());
            System.out.println("com.example.composition.Door Material: " + room.getDoor().getMaterial());
            System.out.println("com.example.composition.Window Type: " + room.getWindow().getType());
            System.out.println();
        }



        System.out.println();
        System.out.println("Association!");

        // Create students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Create courses
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "History");

        // Enroll students in courses (Association)
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Retrieve and display student-course associations
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName() + " is enrolled in " + course1.getCourseName());
        }

        for (Course course : student1.getCourses()) {
            System.out.println("Student1 is enrolled in "+ course.getCourseName());
        }

    }
}