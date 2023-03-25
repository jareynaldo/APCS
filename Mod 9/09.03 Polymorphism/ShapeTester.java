import java.util.ArrayList;

// This class creats and arraylist of Circle2 objects and outputs them. 
// @author Jose Reynaldo
// @version 24/3/23 

public class ShapeTester {
    public static void main(String[] args) {
        Circle2 one = new Circle2(26, 34, 20);
        Circle2 two = new Oval2(42, 34, 4, 6);
        Circle2 three = new Cylinder2(50, 34, 20, 20);
        Circle2 four = new OvalCylinder2(34, 34, 4, 5, 20);

        ArrayList<Circle2> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        showCenter(list);
    }

    public static void showCenter(ArrayList<Circle2> obs) {

        for (Circle2 object : obs) {
            System.out.printf("%s %s %s%s \n", "For this ",
                    object.getname(), " the center is at ", object.getCenter());
        }
    };
}
