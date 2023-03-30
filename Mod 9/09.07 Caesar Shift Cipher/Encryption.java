// The purpose of this program is to create the 
// Encryption class in order to encrypt messages
//
// By: Jose Reynaldo
// Date: 29/3/23

public class Encryption {

    // public static final char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
    // 'H', 'I',
    // 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
    // 'Y', 'Z' };

    public static final String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    public static int shiftValue;
    public static String[] newARR = new String[alphabet.length];

    public static void shifting(int shifter) {
        shiftValue = shifter;

        int adding = 0;
        for (int i = shiftValue - 1; i < alphabet.length; i++) {
            newARR[adding] = alphabet[i];
            adding++;
        }
        for (int i = 0; i < shiftValue - 1; i++) {
            newARR[adding] = alphabet[i];
            adding++;
        }

    }

    public static String Encrypt(String phrase) {
        phrase = phrase.toUpperCase();
        String[] messageTop = phrase.split(" ");

        String returnMessage = "";
        for (String mess : messageTop) {
            String[] message = mess.split("");
            for (int i = 0; i < message.length; i++) {
                for (int x = 0; x < alphabet.length; x++) {
                    if (alphabet[x].equals(message[i])) {
                        returnMessage += newARR[x];
                    }

                }
            }
            returnMessage += " ";
        }
        return returnMessage;

    }

}