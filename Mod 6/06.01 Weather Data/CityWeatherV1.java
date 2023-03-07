/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String myMonth[];
    private double myTemp[];
    private double myPrecep[];

    // constructor with parameters
    public CityWeatherV1(String month[], double temp[], double precepitation[]) {

        myMonth = month;
        myTemp = temp;
        myPrecep = precepitation;
    }

    // setters and getters for each private instance variable

    public String[] getMonth() {
        return myMonth;
    }

    public double[] getTemp() {
        return myTemp;
    }

    public double[] getPrecepitation() {
        return myPrecep;
    }

    public void setMonth(String[] month) {
        myMonth = month;
    }

    public void setTemp(double[] temp) {
        myTemp = temp;
    }

    public void setPrecepiataion(double[] precepitation) {
        myPrecep = precepitation;
    }

    // method to calculate the average of temperature
    public double tempCalc(double temp[]) {

        double sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return sum / temp.length;
    }

    public double tempCalc() {

        double sum = 0;
        for (int i = 0; i < myTemp.length; i++) {
            sum += myTemp[i];
        }
        return sum / myTemp.length;
    }

    // method to calculate total precipitation array
    public double precepCalc(double precepitation[]) {

        double sum = 0;
        for (int i = 0; i < precepitation.length; i++) {
            sum += precepitation[i];
        }
        return sum / precepitation.length;
    }

    public double precepCalc() {

        double sum = 0;
        for (int i = 0; i < myPrecep.length; i++) {
            sum += myPrecep[i];
        }
        return sum / myPrecep.length;
    }

    // method to calculate temperature in Celsius (current index of temperature
    // array passed as a parameter) - to be completed in 6.02

    // method to calculate precipitation in centimeters (current index of
    // precipitation array passed as a parameter) - to be completed in 6.02

}
