
//This class defines a Box object by extending
//Rectangle and includes height.
//
//@author Jose Reynaldo
// @version 06/13/17

public class Box4 extends Rectangle4 {
    private int height;

    public Box4(int l, int w, int h) {
        super(l, w);

        height = h;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

}
