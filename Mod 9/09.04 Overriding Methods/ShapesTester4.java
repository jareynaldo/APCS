
// this class was created to test overide methods
//
//
//@author Jose Reynaldo
// @version 27/3/23
import java.util.*;

public class ShapesTester4 {
    public static void main(String[] args) {
        Rectangle4 one = new Rectangle4(5, 8);
        Rectangle4 two = new Box4(4, 10, 8);
        Rectangle4 three = new Square4(5);
        Rectangle4 four = new Cube4(8);
        Rectangle4 five = new kite4(6, 10);

        // Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);

        for (Rectangle4 rect : shapes) {
            // System.out.println(rect);
            showEffectBoth(rect);
            System.out.println();
        }
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r);
    }

}
