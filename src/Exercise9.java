import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] thirty = {"april", "june", "september", "november"};
        String[] thirtyOne = {"january", "march", "may", "july", "august", "october", "december"};


        System.out.print("Enter a month: ");
        String input = in.next();
        input = input.toLowerCase();
        boolean valid = false;

        int i;

        for (i = 0; i < thirty.length; i++) {
            if (input.equals(thirty[i])) {
                System.out.print("\n30 days.");
                valid = true;
            }
        }

        for (i = 0; i < thirtyOne.length; i++) {
            if (input.equals(thirtyOne[i])) {
                System.out.print("\n31 days.");
                valid = true;
            }
        }

        if (input.equals("february")) {
            System.out.print("\n28 or 29 days.");
        } else if (!valid) {
            System.out.print("\nThat's not a valid month.");

        }
    }
}
