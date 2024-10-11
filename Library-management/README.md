# Library Management System

This is a simple command-line application written in Java to manage a library of books. The program allows users to add, search, check out, and return books. It also supports saving and loading the library's state to and from a file.

## Features

- **Add a Book**: Add new books to the library with a title and author.
- **Search for Books**: Search for books by title or author using a keyword.
- **Check Out a Book**: Mark a book as checked out, preventing others from checking it out.
- **Return a Book**: Return a checked-out book, making it available for others.
- **Save and Load Books**: The program saves the state of the library to a file (`library.txt`) and can load it upon startup.

## How to Use

1. **Run the Application**: After launching the program, you will be presented with a menu of options.
2. **Menu Options**:
   - **1. Add a book**: Enter the title and author of the book you want to add to the library.
   - **2. Search for books**: Enter a keyword to search for books by title or author. Matching books will be displayed.
   - **3. Check out a book**: Enter the title of a book to check it out. If the book is not checked out, it will be marked as unavailable.
   - **4. Return a book**: Enter the title of a checked-out book to return it to the library.
   - **0. Exit**: Save the current list of books to `library.txt` and exit the program.

## File Storage

- **library.txt**: The program reads from and writes to this file to store the list of books and their checked-out statuses. Each book is saved in the format:
  ```
  title,author,checkedOutStatus
  ```

## Requirements

- **Java**: Ensure you have the Java Development Kit (JDK) installed on your machine.
- **Compiler**: You can use any Java IDE or the command line to compile and run the program.

## Compilation and Execution

1. **Compile the code**:
   ```bash
   javac library.java
   ```
2. **Run the program**:
   ```bash
   java library
   ```

## Sample Execution

```
----- Library Management System -----
1. Add a book
2. Search for books
3. Check out a book
4. Return a book
0. Exit
Enter your choice: 1

Enter the title of the book: Java Programming
Enter the author of the book: John Doe
Book added successfully.

----- Library Management System -----
1. Add a book
2. Search for books
3. Check out a book
4. Return a book
0. Exit
Enter your choice: 3

Enter the title of the book to check out: Java Programming
Book 'Java Programming' checked out successfully.
```

## License

This project is free to use and modify for personal or educational purposes.

## Author

```
- Praneet Gogoi(Beastsoul123)
```
Feel free to reach out if you have any questions or suggestions!
