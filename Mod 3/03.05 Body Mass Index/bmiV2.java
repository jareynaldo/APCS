
/**
 * This program illustrates the use of the if-else-if structure 
 * and detirmens a persons bmi based on gathered infromation.
 *
 * @author Jose Reynaldo
 * @version 11/07/22
 */
import java.util.Scanner;

public class bmiV2 {

    public static double shortenInt(double x) {
        int temp = (int) (x * 100.0);
        double shortDouble = ((double) temp) / 100.0;
        return shortDouble;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Gather input
        System.out.println("Please enter your name (first last):");
        String fullName = in.nextLine();
        // String lastName = in.nextLine();

        System.out.println("Please enter your weight in pounds:");
        int weightInAmerican = in.nextInt();
        double weight = weightInAmerican * 0.453592;

        System.out.println("Please enter your height in feet and inches (6 2):");
        int heightInFeet = in.nextInt();
        int heightInInInchest = in.nextInt();
        double heightInAmerican = heightInInInchest + (12 * heightInFeet);

        double inRestOfWorld = heightInAmerican * 0.0254;

        double bmi = weight / (inRestOfWorld * inRestOfWorld);

        double heightInMeters = shortenInt(inRestOfWorld);
        double publishableBMI = shortenInt(bmi);
        double publishableWeight = shortenInt(weight);

        String catagory = "";

        if (bmi < 18.5)
            catagory = "Underweight";

        else if (bmi <= 24.9)
            catagory = "Normal or Healthy Weight";
        else if (bmi <= 29.9)
            catagory = "Overweight";
        else
            catagory = "Obese";

        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");

        System.out.println("Name: " + fullName);
        System.out.println("Height (m): " + heightInMeters);
        System.out.println("Weight ()Kg: " + publishableWeight);
        System.out.println("BMI: " + publishableBMI);
        System.out.println("Catagory: " + catagory);

    }
}
