import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letter = in.next();
        letter = letter.toLowerCase();
        double num = 0;
        boolean valid = true;

        if (letter.length() <= 2) {
            switch (letter.substring(0, 1)) {
                case "a":
                    num = 4.00;
                    switch (letter.substring(1)) {
                        case "-":
                            num -= 0.33;
                            break;
                        case "+":
                            break;
                        case "":
                            break;
                        default:
                            System.out.print("\nThat's not a valid letter grade.");
                            valid = false;
                    }
                    break;
                case "b":
                    num = 3.00;
                    switch (letter.substring(1)) {
                        case "+":
                            num += 0.33;
                            break;
                        case "-":
                            num -= 0.33;
                            break;
                        case "":
                            break;
                        default:
                            System.out.print("\nThat's not a valid letter grade.");
                            valid = false;
                    }
                    break;
                case "c":
                    num = 2.00;
                    switch (letter.substring(1)) {
                        case "+":
                            num += 0.33;
                            break;
                        case "-":
                            num -= 0.33;
                            break;
                        case "":
                            break;
                        default:
                            System.out.print("\nThat's not a valid letter grade.");
                            valid = false;
                    }
                    break;
                case "d":
                    num = 1.00;
                    switch (letter.substring(1)) {
                        case "+":
                            num += 0.33;
                            break;
                        case "-":
                            num -= 0.33;
                            break;
                        case "":
                            break;
                        default:
                            System.out.print("\nThat's not a valid letter grade.");
                            valid = false;
                    }
                    break;
                case "f":
                    num = 0.00;
                    if (letter.length() > 1) {
                        valid = false;
                    }
                    break;
                default:
                    System.out.print("\nThat's not a valid letter grade.");
                    valid = false;
            }
            if (valid) {
                System.out.print("\nYour GPA is ");
                System.out.printf("%,.2f", num);
                System.out.print(".");
            }
        } else {
            System.out.print("\nThat's not a valid letter grade.");

        }
    }
}
