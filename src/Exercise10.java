import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();

        System.out.print("Enter hours worked: ");
        double input = in.nextDouble();

        double overtime = input - 40;
        double regular = 40;

        double overtimeEarnings = overtime * wage * 1.5;
        double regularEarnings = regular * wage;
        double total = overtimeEarnings + regularEarnings;

        System.out.print("\nYou'll make $");
        System.out.printf("%,.2f", total);
        System.out.print(" this week.");

    }
}
