
// This program will simulare an online purchase by 
// asking the user for input and displaying a receipt.
// Author: Jose Reynaldo
// Date: 12/10/2022
import java.util.Scanner;

public class BuyMovieTickets {

    public static String checkIfCorrect(String thingNedded, String thingBeingAsked,
            String measuredQuantaty, int lengthRequired) {
        Scanner in = new Scanner(System.in);
        // the purpose of this mathod is to check if the user input is valid
        // amd to reask intul it does.

        while (measuredQuantaty.length() != lengthRequired) {
            System.out.println("We're sorry, that was an invalid " + thingNedded + ". PLease Try again");
            System.out.print(thingBeingAsked);
            measuredQuantaty = in.next();
        }
        return measuredQuantaty;
    }

    public static void printReceipt(String date, String fullName, String initial, String creditCardNum,
            String movieName, int numOfTickets, double pricePerTicket, String acomedations) {

        System.out.println();
        System.out.println();
        System.out.println("#------------------------------------------------------------------#");
        System.out.println("Your e-Receipt");
        System.out.println();

        System.out.println(date);
        System.out.println("Order number: " + initial + creditCardNum.substring(10));
        System.out.println();

        System.out.println("\t" + fullName);
        System.out.println("\tAccount: " + creditCardNum);
        System.out.println("\tMovie Name: " + movieName);
        System.out.println("\tNumber of tickers: " + numOfTickets);
        System.out.println("\tTicket Price: " + pricePerTicket);
        System.out.println("\tExtra notes: " + acomedations);
        System.out.println();

        System.out.println("\t$" + (pricePerTicket * numOfTickets) + " will be charged to your account.");
        System.out.println();
        System.out.println();

        System.out.println("\t\tThank you for shoppig with us.");
        System.out.println("#------------------------------------------------------------------#");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, Welcome to the cinema");

        System.out.print("Please enter your first and last name: "); // calling for name
        String firstname = in.next();
        String lastName = in.nextLine();

        String dateNeeded = "Todays date (mm/dd/yyyy): "; // calling for date
        System.out.print(dateNeeded);
        String todayDate = in.next();
        todayDate = checkIfCorrect("date", dateNeeded, todayDate, 10);

        System.out.print("What movie would you like to see? "); // asking movie
        String movieName = in.next();
        movieName += in.nextLine(); // could not think of a way to check this and tickets amounts

        System.out.print("How many tickets? ");
        int howMany = Integer.parseInt(in.next());

        System.out.print("What was the ticket price? ");
        double howMuchEach = Double.parseDouble(in.next());

        String askingForCard = "Enter credit card number (#####-###-#####): ";// check for credit card number
        System.out.print(askingForCard);
        String debitNum = in.next();
        debitNum = checkIfCorrect("credit card number", askingForCard, debitNum, 14);

        String askingForPin = "Enter credit card pin (####): "; // check for pin
        System.out.print(askingForPin);
        String debitPin = in.next();
        debitPin = checkIfCorrect("pin number", askingForPin, debitPin, 4);

        System.out.print("Anything we should know? ");// check for acomedations
        String acomedations = in.next();
        acomedations += in.nextLine();

        String fullName = firstname.substring(0, 1) + ". " + lastName; // fix variables before they're sent out
        debitNum = "#####-###-" + debitNum.substring(10);

        printReceipt(todayDate, fullName, fullName.substring(0, 1), debitNum, movieName, howMany, howMuchEach,
                acomedations); // printing the receipt
    }
}