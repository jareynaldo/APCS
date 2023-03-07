/**
 * @purpose: to test the Cars class
 *
 * @author Jose Reynaldo
 * @version 11/1/2023
 */

public class TesterCars {

    public static void printHeader() {
        System.out.println("\t \t \t Cars: ");
        System.out.println("Car:\t\t\t\tHorse Power:\tCool Factor:");
        System.out.println("*****************************************************************");

    }

    public static void printCars(String carName, int hPower, String cFactor) {

        System.out.println(carName + " \t" + hPower + "\t\t" + cFactor);
    }

    public static void main(String[] args) {

        printHeader();

        int car1Torque = 400;
        int car1RPM = 7300;
        Cars Cars = new Cars();
        String car1Name = "2020 Mustang Shelby GT500";

        int car1HPower = Cars.HorsePower(car1Torque, car1RPM);
        String car1CFactor = Cars.CoolFactor(car1HPower);
        printCars(car1Name, car1HPower, car1CFactor);

        int car2Torque = 707;
        int car2RPM = 6300;
        String car2Name = "Dodge Charger SRT RedEye ";

        int car2HPower = Cars.HorsePower(car2Torque, car2RPM);
        String car2CFactor = Cars.CoolFactor(car2HPower);
        printCars(car2Name, car2HPower, car2CFactor);

    }
}
