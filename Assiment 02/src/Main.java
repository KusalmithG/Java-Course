import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>(); // Creating an ArrayList to store student objects

        int userInput;                                                                                                  // Variable to store the main menu user input
        int userInput2;                                                                                                 // Variable to store the submenu user input
                                                                                                                        // Counter of the number of students added

        do {
            Menu();                                                                                                     // Called the method to display the main menu
            userInput = scanner.nextInt();                                                                              //user input for the main menu

            switch (userInput) {                                                                                        // Switch statement to handle different menu options

                case 1:                                                                                                 // input data for a student
                    do {                                                                                                // Checks if the number of students is less than 5 because max number of students is 5
                        student student = new student("", "", 0, "", 0);                 // Creates a new student object
                        student.obtainDetail();                                                                         // Called method to obtain details for the student
                        student.calculateGrades();                                                                      // Called method to calculate the grade
                        students.add(student);                                                                          // Added the student object to the ArrayList
                        Menu1();                                                                                        // Called the method to display the submenu
                                                                                                                        // Increase the student counter
                        userInput2 = scanner.nextInt();                                                                 //  user input for the submenu

                    } while(userInput2 != 2);                                                                           // Continues to prompt for another student until user chooses to go back to the main menu
                    break;

                case 2:                                                                                                 //display information for all students
                    for (student n : students) {                                                                        // enhance for loop for display student details
                        n.displayInfo();                                                                                // Called method to display the details of each student
                    }
                    break;

                case 3:                                                                                                 // to exit the program
                    System.out.println("Exiting the program...");
                    break;

                default:                                                                                                //  invalid menu options
                    System.out.println("Invalid option!!!!!!!!!!");
                    System.out.println("Please try again....");
            }
        } while (userInput != 3);                                                                                       // Continues to display the main menu until the user chooses to exit
    }

    public static void Menu() {
        System.out.println("**************************************************");
        System.out.println("                    MENU                          ");
        System.out.println("**************************************************");
        System.out.println("                                                  ");
        System.out.println(" 1.Input data for a student                       ");
        System.out.println(" 2.Calculate and display the grade for student    ");
        System.out.println(" 3.Exit the program                               ");
        System.out.println("                                                  ");
        System.out.println("**************************************************");
        System.out.println("Enter: ");
    }

    public static void Menu1() {
        System.out.println("**************************************************");
        System.out.println("        1.Input data for another student          ");
        System.out.println("        2.Back to Main Menu                       ");
        System.out.println("**************************************************");
    }
}