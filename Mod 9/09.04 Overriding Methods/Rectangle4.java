
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Jose Reynaldo
 * @version 27/3/23
 */
public class Rectangle4 {
    private int length;
    private int width;

    public Rectangle4(int l, int w) {
        length = l;
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return "The rectangle's dimensions are " + length + " X " + width;
    }

}
