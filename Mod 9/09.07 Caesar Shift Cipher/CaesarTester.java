// The purpose of this program is to test the 
//encryption and decryption classes. 
//
// By: Jose Reynaldo
// Date: 29/3/23

import java.util.Scanner;

public class CaesarTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean choice = true;

        while (choice) {
            System.out.println("\n Encrypt, Decrypt, or Quit?");
            String encryptChoice = in.nextLine();

            if (encryptChoice.equalsIgnoreCase("Encrypt")) {
                int shiftValue = AskForShift();
                Encryption.shifting(shiftValue);
                Encrypt();
            } else if (encryptChoice.equalsIgnoreCase("Decrypt")) {
                int shiftValue = AskForShift();
                String valueToSend = "";

                System.out.println("Is it already encrypted? (yes/no)");
                String response = in.nextLine();

                if (response.equalsIgnoreCase("Yes")) {
                    System.out.println("Paste the encrypted message: ");
                    valueToSend = in.nextLine();

                } else {
                    valueToSend = Encrypt();
                }

                String phrase = Decryption.Decrypt(shiftValue, valueToSend);
                System.out.print("Your de-crypted phrase:  " + phrase + "\n");
            } else if (encryptChoice.equalsIgnoreCase("quit")) {
                choice = false;
            }

        }

    }

    public static String Encrypt() {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the message?");
        String message = in.nextLine();

        String phrase = Encryption.Encrypt(message);
        System.out.println("Your encrypted phrase:  " + phrase);

        return phrase;
    }

    public static int AskForShift() {
        Scanner in = new Scanner(System.in);
        int shiftValue;

        System.out.println("Shift key? 25 max");
        shiftValue = in.nextInt();
        in.nextLine();

        while (shiftValue > 25) {
            System.out.println("Please remain under 25");
            shiftValue = in.nextInt();
            in.nextLine();
        }
        return shiftValue;
    }

}