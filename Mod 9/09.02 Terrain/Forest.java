/**
 * Creates Forrest Objects
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */

public class Forest extends Terrain {

    private int numOfTrees;

    public Forest(int l, int w, int newTrees) {
        super(l, w);
        this.numOfTrees = newTrees;
    }

    public int getTrees() {
        return numOfTrees;
    }

    public void setTress(int newTrees) {
        numOfTrees = newTrees;
    }

    public String forrestPrinter() {
        return "Forrest " + toString() + " and " + numOfTrees + " Trees";
    }
}
