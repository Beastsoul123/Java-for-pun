# Quiz Application

## Overview

This Java program is a console-based Quiz Application that allows users to take a quiz with multiple-choice questions. The program reads questions from a file, presents them to the user, and evaluates the user's answers. At the end of the quiz, a summary of the user's performance is displayed, including the total number of questions, correct answers, incorrect answers, and the final score.

## Features

1. **Load Questions from a File**: The questions are loaded from a text file (`questions.txt`) which follows a specific format. Each question includes the question text, four options (A, B, C, D), and the correct answer.
2. **Multiple-Choice Questions**: For each question, the user is prompted to choose one of the options (A, B, C, or D).
3. **Score Calculation**: The user's score is calculated based on the number of correct answers, with 10 points awarded per correct answer.
4. **Quiz Summary**: At the end of the quiz, the program displays a summary that includes:
   - Total number of questions
   - Number of correct and incorrect answers
   - The final score in percentage.

## How to Use

1. **Prepare the Questions File**: Create a text file named `questions.txt` in the same directory as the program. The file should contain questions in the following format:

   ```
   Question: What is the capital of France?
   A: Paris
   B: London
   C: Rome
   D: Berlin
   Answer: A

   Question: What is 2 + 2?
   A: 3
   B: 4
   C: 5
   D: 6
   Answer: B
   ```

2. **Run the Program**:
   - Compile the program using the following command:

     ```
     javac QuizApplication.java
     ```

   - Run the program:

     ```
     java QuizApplication
     ```

3. **Take the Quiz**:
   - The program will read the questions from the `questions.txt` file and present each question with four possible answers.
   - Enter your answer (A, B, C, or D) when prompted.
   - The program will provide feedback on whether your answer is correct or incorrect.

4. **View the Summary**:
   - After answering all the questions, the program will display a summary showing your total score and performance.

### Example Quiz Execution

```
Welcome to the Quiz Application!

Question 1: What is the capital of France?
A. Paris
B. London
C. Rome
D. Berlin
Your Answer: A
Correct!

Question 2: What is 2 + 2?
A. 3
B. 4
C. 5
D. 6
Your Answer: B
Correct!

Quiz Summary:
Total Questions: 2
Correct Answers: 2
Incorrect Answers: 0
Score: 100%

Thank you for playing!
```

![image](https://github.com/user-attachments/assets/bd267760-c8af-4c06-88c5-6de96aff74fa)


## Code Structure

1. **`Question` Class**: Represents each quiz question, including the question text, options (A, B, C, D), and the correct answer. It also includes a method to check if the user's answer is correct.
   
2. **`QuizApplication` Class**: Manages the entire quiz process, including:
   - Loading questions from the file.
   - Displaying questions to the user.
   - Handling user input for answers.
   - Calculating and displaying the final score.

3. **`loadQuestions` Method**: Reads questions from the `questions.txt` file and stores them in a list.
   
4. **`startQuiz` Method**: Presents each question to the user, takes their input, and checks whether the answer is correct.

5. **`getUserAnswer` Method**: Captures the user's answer for each question.

## File Format for `questions.txt`

The `questions.txt` file should follow the format below for each question:

```
Question: <Question Text>
A: <Option A>
B: <Option B>
C: <Option C>
D: <Option D>
Answer: <Correct Option (A, B, C, or D)>
```

Ensure there is a blank line between each question set.

## Requirements

- **Java Development Kit (JDK) 8** or higher.
- A text editor or an IDE like IntelliJ IDEA or Eclipse.
- A properly formatted `questions.txt` file.

## How to Run

1. **Prepare the `questions.txt` file** as described above.
2. **Save the Code**: Save the provided code in a file named `QuizApplication.java`.
3. **Compile and Run the Program**:
    - Compile:

      ```
      javac QuizApplication.java
      ```

    - Run:

      ```
      java QuizApplication
      ```

## Notes

- **File Not Found**: If the `questions.txt` file is not found, the program will display an error message.
- **Invalid Format**: If the question format in `questions.txt` is incorrect, the program will notify you of the issue.
- **Case Insensitivity**: The program accepts answers in both uppercase and lowercase (e.g., "A" or "a" are both valid inputs for option A).

Enjoy the quiz!
