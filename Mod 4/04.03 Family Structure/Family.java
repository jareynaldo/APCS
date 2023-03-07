
/**
 * The purpose of this program is to read data from
 * an input file and process it accordingly.
 *
 * @author Jose Reynaldo
 * @version 11/23/22
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family {

    public static void main(String[] args) throws IOException {

        String token = "";
        File fileName = new File("familyMembers.txt");
        Scanner inFile = new Scanner(fileName);
        int numOfFams = 0;

        int twoBoys = 0;
        int twoGirls = 0;
        int oneEach = 0;

        // while loop will continue while inFile has a next token to read
        while (inFile.hasNext()) {
            token = inFile.next(); // read next token from file\

            if (token.equals("BB")) {// establishes what type of data it could be
                twoBoys++;
            } else if (token.equals("GG")) {
                twoGirls++;
            } else {
                oneEach++;
            }
            numOfFams++;
        } // end while

        String percentTwoBoys = percentCalc(twoBoys, numOfFams);// caculates percents
        String percentTwoGirls = percentCalc(twoGirls, numOfFams);
        String percentOneEach = percentCalc(oneEach, numOfFams);

        System.out.println("Composition statistics for families with two children.");
        System.out.println();

        System.out.println("Total Number of families: "
                + numOfFams);
        System.out.println();

        System.out.println("Number of familes with: ");
        System.out.println("\t2   Boys: " + twoBoys +
                "\t reprecents "
                + percentTwoBoys);
        System.out.println("\t2  Girls: " + twoGirls +
                "\t reprecents "
                + percentTwoGirls);
        System.out.println("1 boy and 1 girl: "
                + oneEach +
                "\t reprecents "
                + percentOneEach);

        inFile.close();

    }

    public static String percentCalc(int howMuch, int total) {
        double calc = ((double) howMuch / total) * 100;
        String percent = calc + "      ";
        percent = percent.substring(0, 4) + "%";
        return percent;
    }
}
