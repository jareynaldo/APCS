
/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;

public class CityWeatherTesterV1 {

        // method to print results (formatting output will be done in 6.02)

        // Output: display table of weather data including average and total
        // System.out.println();
        // System.out.println(" Weather Data");
        // System.out.println(" Location: " + city +", " + state);
        // System.out.println("Month Temperature (" + tempLabel + ") Precipitation (" +
        // precipLabel + ")");
        // System.out.println();
        // System.out.println("***************************************************");
        // for( int index = 0; index < temperature.length; index++)
        // {
        // use printf to format
        // }
        // System.out.println("Average: " + " Total: ");

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in); // will be used in 6.02
                String city = "Miami";
                String state = "FL";

                String[] month = { "Jan", "Feb", "Mar", "Apr", "May",
                                "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; // complete initialization of months
                                                                                   // array
                double[] temperature = { 68.1, 69.1, 72.4, 75.7, 79.6, 82.4,
                                83.7, 83.6, 82.4, 78.8, 74.4, 69.9 }; // complete initialization of temperatures array
                double[] precipitation = { 1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8,
                                8.6, 8.4, 6.2, 3.4, 2.2 };
                String tempLabel = "F"; // initialize to F
                String precipLabel = "in."; // initialize to in

                CityWeatherV1 city1 = new CityWeatherV1(month, temperature, precipitation);

                // input to decide F/C and in/cm - to be completed in 6.02

                System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
                tempLabel = in.nextLine().toUpperCase();
                System.out.println("Choose the Precipitation scale (I = Inches, C = Centimeters): ");
                precipLabel = in.nextLine().toUpperCase();

                // instantiate AnnualWeatherV1 object

                // conditions & method call to convert temp, if needed - to be completed in 6.02

                // conditions & method call to convert prec, if needed - to be completed in 6.02

                double city1AveTemp = city1.tempCalc();
                double city1AvePrecep = city1.precepCalc();

                System.out.println(city1AveTemp);
                System.out.println(city1AvePrecep);

                // method call to print results (hint: Need parameters for month, temperature,

                // precipitation arrays, data labels and the average temperature, total
                // precipitation variables)

        }// end main
}// end class
