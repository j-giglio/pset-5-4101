import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = in.next();
        System.out.println("");
        card = card.toUpperCase();

        if (card.length() == 2) {
            String value;
            switch (card.substring(0, 1)) {
                case "A":
                    value = "Ace";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "2":
                    value = "Two";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "3":
                    value = "Three";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "4":
                    value = "Four";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "5":
                    value = "Five";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "6":
                    value = "Six";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "7":
                    value = "Seven";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "8":
                    value = "Eight";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "9":
                    value = "Nine";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "T":
                    value = "Ten";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "J":
                    value = "Jack";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "Q":
                    value = "Queen";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                case "K":
                    value = "King";
                    switch (card.substring(1)){
                        case "C":
                            System.out.print(value + " of Clubs.");
                            break;
                        case "D":
                            System.out.print(value + " of Diamonds.");
                            break;
                        case "H":
                            System.out.print(value + " of Hearts.");
                            break;
                        case "S":
                            System.out.print(value + " of Spades.");
                            break;
                        default:
                            System.out.print("That's not a valid suit.");
                    }
                    break;
                default:
                    System.out.print("That's not a valid rank.");
            }
        } else {
            System.out.print("That's not a valid card.");
        }
    }
}
