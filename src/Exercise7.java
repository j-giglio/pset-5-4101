import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        boolean a = year % 4 == 0;
        boolean b = year % 100 == 0;
        boolean c = year % 400 == 0;

        if ((a && !b) || c) {
            System.out.print("\n" + year + " is a leap year.");
        } else {
            System.out.print("\n" + year + " is not a leap year.");
        }
    }
}
