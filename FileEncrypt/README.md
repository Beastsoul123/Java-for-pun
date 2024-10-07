# File Encryption Program

## Overview

This Java program provides a simple utility to encrypt and decrypt files using the AES (Advanced Encryption Standard) algorithm. Users can either encrypt a file to protect its contents or decrypt an encrypted file using a key. The program requires a valid file path and an encryption key, and supports both encryption and decryption modes.

## Features

1. **Encrypt a File**: Convert the contents of a file into an encrypted format to secure its data.
2. **Decrypt a File**: Convert an encrypted file back to its original format using the correct key.
3. **AES Algorithm**: The program uses AES for encryption and decryption, ensuring a strong level of security.
4. **File Handling**: The encrypted file is saved with a `.enc` extension, while decrypted files are restored to their original file name.

## How to Use

1. **Run the Program**: Execute the program and follow the prompts in the console.
2. **Provide File Path**: Enter the full path to the file you wish to encrypt or decrypt.
3. **Enter Encryption Key**: Input a key for the AES encryption. This key must be the same for both encryption and decryption.
4. **Select Mode**: Choose either encryption (`E`) or decryption (`D`).
   - For encryption, the program will create a new file with the `.enc` extension.
   - For decryption, the program will remove the `.enc` extension and restore the original file.

### Example Execution

```
Enter file path: /path/to/your/file.txt
Enter encryption key: mysecretkey12345
Encrypt (E) or Decrypt (D): E
File encrypted successfully!
```

For decryption:

```
Enter file path: /path/to/your/file.txt.enc
Enter encryption key: mysecretkey12345
Encrypt (E) or Decrypt (D): D
File decrypted successfully!
```

![image](https://github.com/user-attachments/assets/485b312d-cac3-466a-9530-611c65b0ba1a)

## Code Structure

1. **`main` Method**: Handles user input and controls the flow of encryption or decryption.
2. **`encryptFile` Method**: Reads the content of the specified file, encrypts it using the AES algorithm, and saves the encrypted content in a new file with the `.enc` extension.
3. **`decryptFile` Method**: Reads an encrypted file and decrypts it using the provided key, saving the output in a file without the `.enc` extension.
4. **`generateKey` Method**: Converts the user-provided encryption key into a format usable by the AES algorithm.

## Requirements

- **Java Development Kit (JDK) 8** or higher.
- A text editor or an IDE such as IntelliJ IDEA or Eclipse.

## How to Run

1. **Save the Code**: Save the code in a file named `fileencryptprogram.java`.
2. **Compile the Program**: Open a terminal and compile the program using:

    ```
    javac fileencryptprogram.java
    ```

3. **Run the Program**:

    ```
    java fileencryptprogram
    ```

## Important Notes

- **Encryption Key**: The encryption key should be 16 bytes (128 bits) long for AES-128. If your key is too short or too long, it may cause issues with the encryption/decryption process.
- **File Paths**: Ensure that the file path you enter is correct, and that you have read/write access to the files.
- **Encrypted File Extension**: Encrypted files are automatically given a `.enc` extension, while decrypted files will have this extension removed.

## Security Considerations

- Always use a strong, secret key for encryption.
- Ensure the encryption key used for decryption matches the key used for encryption.
- This program uses basic file encryption and does not provide advanced features like password management, key stretching, or secure key storage. Use it with caution for sensitive data.

## Example Workflow

1. **Encryption**:
    - File: `document.txt`
    - Encrypted File: `document.txt.enc`
  
2. **Decryption**:
    - File: `document.txt.enc`
    - Decrypted File: `document.txt`

## Disclaimer

This is a simple example of file encryption and decryption using AES. It does not account for real-world security threats like key management, padding, or integrity checks, and should be adapted if intended for secure applications.

## Credit
-The credit for this program goes to Praneet Gogoi
