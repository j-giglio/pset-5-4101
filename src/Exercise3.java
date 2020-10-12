import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers.");

        System.out.print("\nEnter integer: ");
        int a =  in.nextInt();
        System.out.print("Enter integer: ");
        int b =  in.nextInt();
        System.out.print("Enter integer: ");
        int c =  in.nextInt();

        if (a == b && b == c) {
            System.out.println("\nSame.");
        } else if ((a >= b && b == c) || (a == b && b >= c)) {
            System.out.println("\nDecreasing.");
        } else if (a > b && b > c) {
            System.out.println("\nStrictly decreasing.");
        } else if ((a <= b && b == c) || (a == b && b <= c)) {
            System.out.println("\nIncreasing.");
        } else if (a <= b && b <= c) {
            System.out.println("\nStrictly increasing.");
        } else {
            System.out.println("\nUnordered.");
        }
    }
}
