/*
 * Author: Jose Reynaldo
 * Date: 1/9/2023
 * 
 * The purpose of this program is to get used to 
 * intertwined methods and working with them to 
 * achive a single coherent result
 *
 * 
 */


public class PlanetGravity {
    public static String gravity(double mass, double diameter) {
        // Universal Gravitational Constant
        double g = 6.67430e-11;

        double radius = diameter / 2;
        double surfaceGravity = g * mass / (radius * radius);
        String returnValue = Double.toString(surfaceGravity);

        if (returnValue.length() > 5) {
            returnValue = returnValue.substring(0, 5);
        }
        return returnValue;
    }

    public static void header() {
        System.out.println("\t\t \t   Planetary Data");
        System.out.println("Planet  \t Diameter (Km)  \t Mass (Kg)  \t g (m/s^2)");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void dataPrinter(String name, double diameter, double mass, String gravity) {

        System.out.println(name + " \t " + diameter + "\t \t" + mass + "\t \t " + gravity);
    }

    public static void main(String[] args) {
        double jupMass = 1.9e27;
        double jupDiameter = 142_984;
        String planet = "Jupiter";

        String grav = gravity(jupMass, jupDiameter);
        header();
        dataPrinter(planet, jupDiameter, jupMass, grav);
    }
}
