from pathlib import Path

# Define the markdown content for the problem statement
content = """# 🧮 Problem Statement: Grade Evaluation System

Write a Java program that reads a student's **marks (0–100)** and prints their **grade** based on the following criteria:

| Marks Range | Grade |
|--------------|--------|
| 90 – 100     | A     |
| 80 – 89      | B     |
| 70 – 79      | C     |
| 60 – 69      | D     |
| 50 – 59      | E     |
| 0 – 49       | F     |
| Invalid input (less than 0 or more than 100) | "Invalid Marks" |

---

## 🎯 Requirements

The program should:

1. Take marks as input from the user.  
2. Use **if–else if–else** statements to determine the grade.  
3. Display the appropriate grade or “Invalid Marks” if the input is out of range.

---

## 💡 Example Input/Output

### Input 1
