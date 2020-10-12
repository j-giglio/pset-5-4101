import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input =  in.nextInt();
        System.out.println();

        if (input % 2 == 0) {
            System.out.print("Even.");
        } else {
            System.out.print("Odd.");
        }
    }
}
