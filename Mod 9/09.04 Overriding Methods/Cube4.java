
//This class defines a Cube object by extending
//box which includes height.
//
//
//@author Jose Reynaldo
// @version 27/3/23

public class Cube4 extends Box4 {

    public Cube4(int x) {
        super(x, x, x);

    }

    public String toString() {
        return "The Cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
