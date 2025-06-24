package at.technikum.TopicOO;
// https://www.w3resource.com/java-exercises/nested-classes/java-nested-classes-exercise-5.php

// Class Library
public class Library {

    // Instance variable libraryName
    public String libraryName;
    public Library itsMeTheLibrary;

    // Constructor to initialize libraryName
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.itsMeTheLibrary = this;
    }

    // Inner class Book
    public class Book {

        public String bookName;
        public Book(String bookName) { this.bookName = bookName; }

        public class Page {
            //public Library theLibraryIAmIn;
            public String getBookName() { return bookName; }
            public String getLibraryName() { return libraryName; }
            public Library getLibrary() { return Library.this; }
        }

        // Method getLibraryName that returns the name of the library
        public String getLibraryName() {
            // Accessing the outer class's instance variable libraryName
            return libraryName;
        }

    }

    // Main method to demonstrate inner class accessing outer class members
    public static void main(String[] args) {
        // Creating an instance of Library
       // Library myLibrary = new Library("Central Library");

        // Creating an instance of the inner class Book
        Library.Book myBook = new Library("Secret Library").new Book("Java for Begi^H^H");

        Library.Book.Page myPage =
                new Library("Lib22222")
                .new Book("book2")
                .new Page();

        // Calling the getLibraryName method and printing the result
        System.out.println("Library Name: " + myBook.getLibraryName());
        System.out.println("Bookname of page: " +  myPage.getBookName());
        System.out.println("Library Name via page: " + myPage.getLibraryName());

        System.out.println("Library Name : " + myPage.getLibrary().libraryName);
        //System.out.println("Library.this :" + Library.this);
    }
}
