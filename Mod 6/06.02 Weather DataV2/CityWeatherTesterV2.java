
/**
 * Annual Weather client class
 * 
 * @author Jose Reynaldo
 * @version 1/06/23
 */
import java.util.Scanner;

public class CityWeatherTesterV2 {

        public static void printMethod(String city, String state, String tempLabel, String precipLabel,
                        double[] temperature, double[] precepitation, String[] month, double averageTemp,
                        double averagePrecep) {
                System.out.println();
                System.out.printf("%35s %n", "Weather Data");
                System.out.printf("%30s %s, %s %n", "Location:", city, state);
                System.out.println("Month:  \t  Temperature (" + tempLabel + ") \t  Precipitation (" +
                                precipLabel + ")");
                System.out.println();
                System.out.println("************************************************************");
                System.out.println();
                for (int i = 0; i < temperature.length; i++) {

                        // use printf to format
                        System.out.printf("%3s.  %27.1f %25.1f", month[i], temperature[i], precepitation[i]);
                        System.out.println();
                }
                System.out.println("************************************************************");
                System.out.printf("\tAverage:  \tTotal: %3.2f", averageTemp, averagePrecep);
        }

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
                String precipLabel = "I"; // initialize to in

                CityWeatherV2 city1 = new CityWeatherV2(month, temperature, precipitation);

                // input to decide F/C and in/cm - to be completed in 6.02

                System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
                tempLabel = in.nextLine().toUpperCase();

                if (tempLabel.equalsIgnoreCase("C")) {
                        city1.ConvertToCelc();
                }

                // city1.ConvertingTemps(tempLabel);S
                System.out.print("Choose the Precipitation scale (I = Inches, C = Centimeters): ");
                precipLabel = in.nextLine().toUpperCase();

                if (precipLabel.equalsIgnoreCase("C")) {
                        city1.ConvertToCem();
                }

                printMethod(city, state, tempLabel, precipLabel, temperature, precipitation, month, city1.tempCalc(),
                                city1.precepCalc());

        }
}
