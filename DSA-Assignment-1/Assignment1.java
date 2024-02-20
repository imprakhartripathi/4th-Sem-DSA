import java.util.InputMismatchException;
import java.util.Scanner;

class Stack_DCLL_StudentManagement {
    Student head;

    class Student {
        String name;
        int marks;
        Student next;
        Student previous;

        Student(String studentname, int studentmarks) {
            name = studentname;
            marks = studentmarks;
            next = null;
            previous = null;
        }
    }

    void AddFirst(String studentname, int studentmarks) {
        Student newstudent = new Student(studentname, studentmarks);
        if (head == null) {
            head = newstudent;
            head.next = head;
            head.previous = head;
            return;
        }
        newstudent.next = head;
        newstudent.previous = head.previous;
        newstudent.previous.next = newstudent;
        head = newstudent;
        return;

    }

    void AddLast(String studentname, int studentmarks) {
        Student newstudent = new Student(studentname, studentmarks);
        if (head == null) {
            head = newstudent;
            head.next = head;
            head.previous = head;
            return;
        }
        newstudent.next = head;
        newstudent.previous = head.previous;
        newstudent.previous.next = newstudent;
        head.previous = newstudent;
        return;
    }

    void DeleteFirst() {
        if (head == null) {
            System.out.println("Stack is Empty, Can't Delete Any Student");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.previous.next = head.next;
            head.next.previous = head.previous;
            head = head.next;
        }
    }

    void DeleteLast() {
        if (head == null) {
            System.out.println("Stack is Empty, Can't Delete Any Student");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.previous.previous.next = head;
            head.previous = head.previous.previous;
        }
    }

    void PrintStack() {
        if (head == null) {
            System.out.println("Stack Is Empty, Can't Display Any Student(s)");
            return;
        }
        Student last = head;
        while (last.next != head) {
            System.out.println(last.name + " " + last.marks);
            last = last.next;
        }
        System.out.print(last.name + " " + last.marks);
        System.out.println();
    }

    void DisplayTopThree() {
        if (head == null) {
            System.out.println("The Stack Is Empty, Can't Display Top Three Students");
            return;
        }
        Student current = head;
        do {
            Student temp = current.next;
            while (temp != head) {
                if (temp.marks > current.marks) {
                    int marksTemp = current.marks;
                    String nameTemp = current.name;
                    current.marks = temp.marks;
                    current.name = temp.name;
                    temp.marks = marksTemp;
                    temp.name = nameTemp;
                }
                temp = temp.next;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Top 3 Positions:");
        int count = 0;
        Student iterator = head;
        while (count < 3 && iterator != null) {
            System.out.println("Student Name: " + iterator.name + ", Marks:" + iterator.marks);
            iterator = iterator.next;
            count++;
        }
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("This Is Student Management System Using Stack With DCLL");
        Stack_DCLL_StudentManagement sm = new Stack_DCLL_StudentManagement();
        int choice;
        System.out.println("\nMenu:");
        System.out.println("1. Add a student to Stack");
        System.out.println("2. Remove a Student from the Stack");
        System.out.println("3. Display all students of Stack");
        System.out.println("4. Display the top 3 positions of students");
        System.out.println("5. Exit");
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = ip.nextInt();
            } catch (InputMismatchException IME) {
                System.out.println("Invalid Input");
                return;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = ip.next();
                    System.out.print("Enter student marks: ");
                    int marks = ip.nextInt();
                    sm.AddLast(name, marks);
                    break;
                case 2:
                    sm.DeleteLast();
                    System.out.println("Last student removed.");
                    break;
                case 3:
                    System.out.println("Students in the Stack:");
                    sm.PrintStack();
                    break;
                case 4:
                    sm.DisplayTopThree();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
        ip.close();
    }
}
