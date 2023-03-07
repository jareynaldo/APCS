
/**
 * Randomly generate passwords.
 *
 * @author Jose Reynaldo
 * @version 12/05/22
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {
        String userChoice = "Y";
        String password = "";

        Scanner in = new Scanner(System.in);

        PrintWriter outFile = new PrintWriter(new File("pass.txt"));

        System.out.println("**********************************************************");
        System.out.println(
                "Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // the user wants to continue
        while (userChoice.equalsIgnoreCase("Y")) {
            System.out.print("Enter a password Length ( 6 or more): ");
            int passLength = in.nextInt();

            while (passLength < 6) {
                System.out.println("Password length too short. Please try again.");
                System.out.print("Enter a password Length ( 6 or more): ");
                passLength = in.nextInt();

            }
            password = "";
            int randomNum;
            for (int i = 0; i < passLength; i++) {
                randomNum = (int) ((Math.random() * 3) + 1);

                if (randomNum == 1) {
                    password += (char) ((int) ((Math.random() * 9) + 48));
                } else if (randomNum == 2) {
                    password += (char) ((int) ((Math.random() * 25) + 65));
                } else if (randomNum == 3) {
                    password += (char) ((int) ((Math.random() * 25) + 97));
                }

            }
            outFile.println(password);
            System.out.println("A password has been written to the text file");
            System.out.println("Would you  like to generate another password? Y/N: ");
            userChoice = in.next();
            System.out.println();
        }

        outFile.close();

        System.out.println("Thank you for using Pass Code Generator.");

        String token = "";
        File fileName = new File("pass.txt");
        Scanner inFile = new Scanner(fileName);
        int numPass = 1;

        while (inFile.hasNext()) {
            token = inFile.next();
            System.out.println(numPass + ". \t " + token);
            numPass++;
        }
        inFile.close();

    }
}
