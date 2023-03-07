/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class CheeseCakeV1 {

    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;

    CheeseCakeV1(String flavor, int quantity) {

        myQuantity = quantity;
        myFlavor = flavor;
        myServings = 0;
        myCreamCheese = 0;
        myVanilla = 0;
        mySugar = 0.0;

    }

    public void calcTotalServings() {
        myServings = myQuantity * 16;
    }

    public void calcCreamCheese() {
        myCreamCheese = myQuantity * 32;
    }

    public void calcVanilla() {
        myVanilla = myQuantity;
    }

    public void calcSugar() {
        mySugar = .33 * myQuantity;

    }

    public int getQuantity() {
        return myQuantity;
    }

    public String getFlavor() {
        return myFlavor;
    }

    public double getSugar() {
        return mySugar;
    }

    public int getCreamCheese() {
        return myCreamCheese;
    }

    public int getVanilla() {
        return myVanilla;
    }

    public int getServings() {
        return myServings;
    }

    public String toString() {
        // ******* Practice your printf() skills by formatting this data! ****//
        return String.format("|     %-2d   | %-13s |  %5d oz    | %5d    | %5.2f Cups | %4d tsps | %n", myQuantity,
                myFlavor,
                myCreamCheese, myServings, mySugar, myVanilla);
    }
}