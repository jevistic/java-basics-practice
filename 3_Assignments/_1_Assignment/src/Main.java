import com.assignment.model.*;
import com.assignment.repository.*;
import com.assignment.service.AuthorService;
import com.assignment.service.BookService;
import com.assignment.service.LibraryService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment");

        // Create repository instances for each entity
//        BookRepository bookRepository = new BookRepository();
//        CrudRepository<Library> libraryRepository = new LibraryRepository();
//        CrudRepository<Author> authorRepository = new AuthorRepository();
//        CrudRepository<LibraryMember> memberRepository = new LibraryMemberRepository();
//        CrudRepository<LibraryStaff> staffRepository = new LibraryStaffRepository();
//
//
//        // CRUD operations for Library entities
//
//        Library library1 = new Library(1L, "Library name 1", "Location 1", new ArrayList<>());
//        Library library2 = new Library(2L, "Library name 2", "Location 2", new ArrayList<>());
//
//        //Create
//        library1 = libraryRepository.create(library1);
//        library2 = libraryRepository.create(library2);
//
//
//        //Read
//        Library l1 = libraryRepository.read(1);
//        Library l2 = libraryRepository.read(2);
//        System.out.println("\nCreated Libraries:");
//        System.out.println("Library 1: " + l1.getName());
//        System.out.println("Library 2: " + l2.getName());
//
//        //Update
//        Library library2Updated = new Library(2L, "Library name 2 updated", "Location 2 updated", new ArrayList<>());
//        libraryRepository.update(library2Updated);
//        l1 = libraryRepository.read(1);
//        l2 = libraryRepository.read(2);
//        System.out.println("\nUpdated Libraries:");
//        System.out.println("Library 1: " + l1.getName());
//        System.out.println("Library 2: " + l2.getName());
//
//
//        //delete
////        libraryRepository.delete(2);
//        l1 = libraryRepository.read(1);
//        l2 = libraryRepository.read(2);
//        System.out.println("\nLibraries after deletion:");
//        System.out.println("Library 1: " + l1.getName());
////        System.out.println("Library 2: " + l2.getName());    //here l2 is null (exception)
//
//
//
//
//        // CRUD operations for Author
//
//        // Create
//        Author author = new Author("Author Name", "Author Biography", new ArrayList<>());
//        author = authorRepository.create(author);
//
//
//        // Create books available in libraries
//        Book book1 = new Book("Book Title 1", "ISBN-1234", 2023, author, Arrays.asList(library1, library2));
//        Book book2 = new Book("Book Title 2", "ISBN-5678", 2024, author, Arrays.asList(library1));
//
//        book1 = bookRepository.create(book1);
//        book2 = bookRepository.create(book2);
//
//        // Add the created books to the libraries
//        library1.getBooks().add(book1);
//        library1.getBooks().add(book2);
//        library2.getBooks().add(book1);
//
//        // Update the libraries with the new book lists
//        libraryRepository.update(library1);
//        libraryRepository.update(library2);
//
//        // Retrieve updated libraries
//        Library retrievedLibrary1 = libraryRepository.read(library1.getLibraryId());
//        Library retrievedLibrary2 = libraryRepository.read(library2.getLibraryId());
//
//        System.out.println("\nRetrieved Libraries:");
//        System.out.println("Library 1: " + retrievedLibrary1.getBooks());
//        System.out.println("Library 2: " + retrievedLibrary2.getBooks());
//
//        System.out.println("\nLibraries having book1:");
//        System.out.println(book1.getLibraries());






        Library library1 = new Library(1L, "Library name 1", "Location 1", new ArrayList<>());
        Library library2 = new Library(2L, "Library name 2", "Location 2", new ArrayList<>());

        Author author = new Author("Author Name", "Author Biography", new ArrayList<>());

        Book book1 = new Book("Book Title 1", "ISBN-1234", 2023, author, Arrays.asList(library1, library2));
        Book book2 = new Book("Book Title 2", "ISBN-5678", 2024, author, Arrays.asList(library1));

        library1.setBooks(Arrays.asList(book1, book2));
        library2.setBooks(Arrays.asList(book1));



        //Book

        // Create repository instance
        BookRepository bookRepository = new BookRepository();

        // Create service instances and inject the repository
        BookService bookService = new BookService(bookRepository);

        bookService.create(book1);
        bookService.create(book2);

        System.out.println(bookService.read(1).getTitle());
        System.out.println(bookService.read(2).getTitle());



        //Author
        AuthorRepository authorRepository = new AuthorRepository();

        AuthorService authorService = new AuthorService(authorRepository);

        authorService.create(author);

        System.out.println(authorService.read(1).getName());


        //Library
        LibraryRepository libraryRepository = new LibraryRepository();

        LibraryService libraryService = new LibraryService(libraryRepository);

        libraryService.create(library1);
        libraryService.create(library2);

        System.out.println(libraryService.read(1).getBooks());
        System.out.println(libraryService.read(1).getName());



    }
}