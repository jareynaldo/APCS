// this class defines a kite object by using
// the rectangle4 class. 
//
//
//@author Jose Reynaldo
// @version 27/3/23

public class kite4 extends Rectangle4 {
    public kite4(int x, int y) {
        super(x, y);
    }

    public String toString() {
        return "The kite's dimensions are " + getLength() + " X " + getWidth();

    }
}
