# About the Project

This project was developed as a **personal assignment** for the **Data Structure and Algorithm Analysis** course. The goal of the assignment is to implement and demonstrate the functionality of a **single linked list** in a real-world scenario, where we manage student records.

## Study Case : Database Mahasiswa Using Single Linked List

This Java program implements a **single linked list** to store and manage data for a database of students. The program allows the user to perform operations such as adding student data, displaying the data sorted by NIM (student ID), and clearing all data.

## What is a Single Linked List?

A **single linked list** is a data structure in which each element (called a node) contains two parts:
1. **Data**: The actual data that the node holds.
2. **Next**: A reference (or pointer) to the next node in the list.

In a single linked list, each node points to the next node in the sequence, and the last node points to `null`, indicating the end of the list.

### Operations in the Program

The following operations are supported by the program:

1. **Push**: Adds a new student record (NIM, Name, and Department) to the linked list. The program will validate the input to ensure that:
   - NIM is a numeric value with up to 10 digits.
   - Name is a string with a maximum length of 30 characters.
   - Department is a string with a maximum length of 50 characters.
   - The total number of students does not exceed 5.

2. **Display Sorted**: Displays all the student records in the list, sorted by the NIM in ascending order.

3. **Pop All**: Clears all the student records from the list.

4. **Exit**: Exits the program.

## How to Use

1. When the program starts, you will be prompted with a menu.
2. Choose the operation you want to perform by entering the corresponding number (1, 2, 3, or 4).
3. If you choose option 1, you will be asked to input the student's NIM, Name, and Department.
4. If you choose option 2, the program will display all the student records sorted by NIM.
5. If you choose option 3, all data will be cleared from the list.
6. Choose option 4 to exit the program.


## How to Compile and Run

1. Save the code in a file named `DatabaseMahasiswa.java`.
2. Open a terminal and navigate to the directory containing the file.
3. Compile the code using the following command:
4. Run the program with `javac DatabaseMahasiswa.java` and `java DatabaseMahasiswa`


