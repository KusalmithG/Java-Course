import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]arg){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter your birth year: ");
        int birthYear=scanner.nextInt();
        int thisYear= 2024;
        int cyear = (thisYear-birthYear);
        int hyear = (100+birthYear);
        if (birthYear >= 2013) {
            System.out.println(" Your Generation is Alpha");
        }
        else if (birthYear >= 1997) {
            System.out.println(" Your Generation is Z");
        }
        else if (birthYear >= 1981) {
            System.out.println(" Your Generation is Millennials ");
        }
        else if (birthYear >= 1965) {
            System.out.println(" Your Generation is X ");
        }
        else if (birthYear >= 1946) {
            System.out.println(" Your Generation is Baby Boomers");
        }
        else if (birthYear >= 1928) {
            System.out.println(" Your Generation is Silent Generation");
        }
        else {
            System.out.println(" Your Generation is Greatest Generation");
        }
        System.out.println("Your current age is" +cyear);
        System.out.println("You will turn 100 years old in "+hyear);
    }
}
