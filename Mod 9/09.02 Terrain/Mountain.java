
/**
 * Creates Mountan objects through the Terrain class
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */

public class Mountain extends Terrain {
    private int numOfMount;

    public Mountain(int l, int w, int numOfMount) {
        super(l, w);
        this.numOfMount = numOfMount;
    }

    public int getMountain() {
        return numOfMount;
    }

    public void setMountain(int newMounts) {
        numOfMount = newMounts;
    }

    public String mountainPrinter() {
        return "Mountains " + toString() + " and " + numOfMount + " Mountains";
    }

    public String toStringMount() {
        return toString() + " and " + numOfMount + " Mountains";
    }

}
