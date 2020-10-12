import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String value = in.next();
        String input = in.nextLine();

        String[] split = input.split("\\s+");
        double num = Double.parseDouble(value);

//        System.out.println(num);
//        System.out.println(split[1]);

        split[1] = split[1].toLowerCase();

        if (split[1].equals("f") && num > 212) {
            System.out.print("\nGas.");
        } else if (split[1].equals("f") && num > 32) {
            System.out.print("\nLiquid.");
        } else if (split[1].equals("f") && num < 32) {
            System.out.print("\nSolid.");
        } else if (split[1].equals("c") && num > 100) {
            System.out.print("\nGas.");
        } else if (split[1].equals("c") && num > 0) {
            System.out.print("\nLiquid.");
        } else if (split[1].equals("c") && num < 0) {
            System.out.print("\nSolid.");
        } else {
            System.out.print("\nThat's not a valid scale.");
        }
    }
}