
/**
*  To test the CheesCake class
 * @author Jose Reynaldo
 * @version (enter today's date)
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args) {
        // initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        // add CheeseCake to the ArrayList

        cake.add(new CheeseCakeV1("Pickle", 3));
        cake.add(new CheeseCakeV1("Yogurt Pepsi", 6));
        cake.add(new CheeseCakeV1("Wasabi KitKat", 2));
        cake.add(new CheeseCakeV1("pizza ", 56));
        cake.add(new CheeseCakeV1("seaweed ", 1));
        cake.add(new CheeseCakeV1("green tea", 34));

        // calls several method for each object to perform calculations
        for (CheeseCakeV1 dataRecord : cake) {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }

        // printing the format of the table
        System.out.println("|       Cheese Cake Data           |                Ingredient Calculations           |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar    |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|------------|-----------|");

        // using a for loop to print out the objects' data
        for (int index = 0; index < cake.size(); index++) {
            // print each CheeseCake's data
            System.out.printf("| %5d %s", index + 1, cake.get(index).toString());
        }
    }
}
