import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double num =  in.nextDouble();

        if (num > 100) {
            System.out.print("\nGrades above 100 are invalid.");
        } else if (num < 0) {
            System.out.print("\nGrades below 0 are invalid.");
        } else if (num > 89) {
            System.out.print("\nYou received an A.");
        } else if (num > 79) {
            System.out.print("\nYou received a B.");
        } else if (num > 69) {
            System.out.print("\nYou received a C.");
        } else if (num > 59) {
            System.out.print("\nYou received a D.");
        } else {
            System.out.print("\nYou received an F.");
        }
    }
}
