
//This class defines a square object by extending
//Rectangle class.
//
//@author Jose Reynaldo
// @version 27/3/23

public class Square4 extends Rectangle4 {

    public Square4(int l) {
        super(l, l);

    }

    public String toString() {
        return "The square's dimensions are " + getLength() + " X " + getWidth() + " X ";
    }

}
