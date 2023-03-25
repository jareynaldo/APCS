/**
 * Makes Desert Mountains from two superclasses
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */

public class MountainDesert extends Desert {
    private int elevation;

    public MountainDesert(int l, int w, int water, int elevation) {
        super(l, w, water);
        this.elevation = elevation;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String mountDesertPrinter() {
        return "Mountain Desert " + toStringDes() + " and " + elevation + " feet high";
    }

}
