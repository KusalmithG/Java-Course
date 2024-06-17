
import java.util.Scanner;

public class student {                                                                                                  //Creating a Java class named Student
    String name;
    String email;
    int age;                                                                                                            //Class properties
    String address;
    int marks;


    public student(String name, String email, int age, String address, int marks) {                                     // Initializing properties in Constructor
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    public void obtainDetail() {                                                                                        // Creating method to obtain detail of students
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter student Name");
        this.name = Scanner.nextLine();
        System.out.println("Enter student Email");
        this.email = Scanner.nextLine();
        System.out.println("Enter student Age");
        this.age = Scanner.nextInt();
        System.out.println("Enter student Address");
        this.address = Scanner.next();
        System.out.println("Enter student Marks");
        this.marks = Scanner.nextInt();
    }

    public String calculateGrades() {                                                                                   //Creating method to calculate students grades
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {                                                                                         //Creating method to display student details with their grades
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
        System.out.println("marks: " + marks);
        System.out.println("Grade:" + calculateGrades());
        System.out.println();
        System.out.println();
    }



}
