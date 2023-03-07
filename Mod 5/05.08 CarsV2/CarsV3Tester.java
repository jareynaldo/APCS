/**
 * @purpose: to test the CarsV2 class
 *
 * @author Jose Reynaldo
 * @version 12/1/2023
 */

public class CarsV3Tester {

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
        String car1Name = "2020 Mustang Shelby GT500";

        CarsV3 car1 = new CarsV3(car1Torque, car1RPM, car1Name, "", 0);
        printCars(car1.getName(), car1.HorsePower(), car1.CoolFactor());

        int car2Torque = 707;
        int car2RPM = 6300;
        String car2Name = "Dodge Charger SRT RedEye ";

        CarsV3 car2 = new CarsV3(car2Torque, car2RPM, car2Name, "", 0);
        printCars(car2.getName(), car2.HorsePower(), car2.CoolFactor());

        int car3Torque = 590;
        int car3RPM = 6500;
        String car3Name = "Mercedes AMG SL63 Roadster";

        CarsV3 car3 = new CarsV3(car3Torque, car3RPM, car3Name, "", 0);
        printCars(car3.getName(), car3.HorsePower(), car3.CoolFactor());

    }
}
