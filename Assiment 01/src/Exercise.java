import java.util.Scanner;

public class Exercise {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=scanner.nextInt();
        if (marks >= 75) {
            System.out.println( "Your grade is : A ");
        }
        else if(marks>=65){
            System.out.println( "Your grade is : B ");
        }
        else if(marks>=55){
            System.out.println( "Your grade is : C ");
        }
        else if (marks>=45){
            System.out.println( "Your grade is : D ");
        }
        else {
            System.out.println( "Your grade is : F ");
        }
    }
}
