/**
 * @purpose: To write my first client class
 *
 * @author Jose Reynaldo
 * @version 11/1/2023
 */

public class Cars {

    public Cars() { // constructor
    }

    public int HorsePower(int torque, int rpm) {

        int hpower = (torque * rpm) / 5252;
        return hpower;
    }

    public String CoolFactor(int horsePower) {
        String howCool = "";

        if (horsePower < 300) {
            howCool = "Not Cool";
        } else if (horsePower < 600) {
            howCool = "Somewhat Cool";
        } else {
            howCool = "Very Cool";
        }

        return howCool;

    }

}
