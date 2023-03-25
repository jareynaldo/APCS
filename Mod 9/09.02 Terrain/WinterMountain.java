/**
 * Creates WinterMountain objects through the Mountain class
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */
public class WinterMountain extends Mountain {
    private int temp;

    public WinterMountain(int l, int w, int numOfMount, int temp) {
        super(l, w, numOfMount);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int newTemp) {
        temp = newTemp;
    }

    public String winterPrinter() {
        return "Winter Mountains " + toStringMount() + " and is " + temp + " Degrees";
    }
}
