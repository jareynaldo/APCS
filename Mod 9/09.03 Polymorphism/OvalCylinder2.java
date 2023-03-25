
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Jose Reynaldo
 * @version 24/3/23
 */

public class OvalCylinder2 extends Oval2 {
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h) {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public String getname() {
        return "OvalCylinder2";
    }
}