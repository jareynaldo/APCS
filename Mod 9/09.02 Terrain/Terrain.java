
/**
 * This is the father all of the other classes inhert from
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */

public class Terrain {
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize() {
        return "Terrain has dimensions " + length + " X " + width;
    }

    public String toString() {
        return "has dimensions " + length + " X " + width;
    }
}