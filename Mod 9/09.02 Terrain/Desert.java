/**
 * Creates Desert Objects
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */

public class Desert extends Terrain {
    private int totalWater;

    public Desert(int l, int w, int totalWater) {
        super(l, w);
        this.totalWater = totalWater;
    }

    public int getWater() {
        return totalWater;
    }

    public void setWater(int totalWater) {
        this.totalWater = totalWater;
    }

    public String desertPrinter() {
        return "Deserts " + toString() + " and " + totalWater + " inches of rainfall";
    }

    public String toStringDes() {
        return toString() + " and " + totalWater + " inches of rainfall";
    }

}
