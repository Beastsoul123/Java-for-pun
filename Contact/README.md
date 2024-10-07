# Contact Book Program

## Overview

This Java program is a simple console-based application that allows users to manage a contact book. Users can add, view, edit, and delete contacts. Each contact includes a name, phone number, and email address. The program runs in a loop until the user decides to exit.

## Features

1. **Add a Contact**: Users can input a new contact by providing a name, phone number, and email.
2. **View Contacts**: Displays the list of all saved contacts. Each contact is shown with its name, phone number, email, and index.
3. **Edit a Contact**: Users can edit an existing contact by specifying the index of the contact to update.
4. **Delete a Contact**: Users can delete a contact by specifying its index.
5. **Exit the Program**: Ends the program execution.

## How to Use

1. **Start the Program**: Run the program. You will be presented with a menu of options.
2. **Select an Option**:
   - **1**: Add a contact. You will be prompted to input the contact's name, phone number, and email.
   - **2**: View all contacts. The program will display a list of saved contacts with their corresponding index numbers.
   - **3**: Edit a contact. Enter the index of the contact to edit, followed by the new details.
   - **4**: Delete a contact. Enter the index of the contact to remove it from the contact book.
   - **0**: Exit the program.
   
3. **Continue Until Exit**: The menu will be displayed after each action. The program continues running until the user selects the exit option (0).

## Input Validation

- The program validates that the user's choice in the menu is a valid integer.
- It also ensures the index for editing or deleting contacts is within the bounds of the contact list.

## Code Structure

- **Contact Class**: Represents individual contacts with attributes like `name`, `phoneNumber`, and `email`. It includes getter and setter methods to manage these attributes.
  
- **ContactBook Class**: Manages a list of `Contact` objects. It has methods to add, view, edit, and delete contacts. 
  
- **ContactBookProgram Class**: The entry point of the application, which contains the main menu and manages user input.

## Example

```
----- Contact Book -----
1. Add a contact
2. View contacts
3. Edit a contact
4. Delete a contact
0. Exit
Enter your choice: 1

Enter the name: Praneet Gogoi
Enter the phone number: 892-812-1323
Enter the email: praneet.gogoi@gmail.com
Contact added successfully.

----- Contact Book -----
1. Add a contact
2. View contacts
3. Edit a contact
4. Delete a contact
0. Exit
Enter your choice: 2

Contact List:
1. Name: Praneet Gogoi, Phone: 892-812-1323, Email: praneet.gogoi@gmail.com
```

![Screenshot 2024-10-07 203306](https://github.com/user-attachments/assets/2d8d4483-b05f-46c4-ad1d-da63aadf710b)

## Requirements

- Java Development Kit (JDK) 8 or higher
- A text editor or an IDE such as IntelliJ IDEA or Eclipse

## How to Run

1. Save the code in a file named `ContactBookProgram.java`.
2. Compile the program using the following command:

    ```
    javac ContactBookProgram.java
    ```

3. Run the program:

    ```
    java ContactBookProgram
    ```

## Credit
-This project is credited to Praneet Gogoi
