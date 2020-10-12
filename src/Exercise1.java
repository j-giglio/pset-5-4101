import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input =  in.nextInt();
        System.out.println();

        if (input > 0) {
            System.out.print("Positive.");
        } else if (input < 0){
            System.out.print("Negative.");
        } else {
            System.out.print("Zero.");
        }
    }
}
