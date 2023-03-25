/**
 * Runs and prints all of the other classes
 *
 * @author Jose Reynaldo
 * @version 23/3/23
 */
public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain one = new Terrain(15, 6);
        Forest two = new Forest(62, 63, 125);
        Mountain three = new Mountain(256, 260, 8);
        WinterMountain four = new WinterMountain(64, 52, 111, 2);
        Desert five = new Desert(300, 342, 2);
        MountainDesert six = new MountainDesert(310, 308, 1, 3500);

        System.out.println(one.getTerrainSize());
        System.out.println(two.forrestPrinter());
        System.out.println(three.mountainPrinter());
        System.out.println(four.winterPrinter());
        System.out.println(five.desertPrinter());
        System.out.println(six.mountDesertPrinter());

    }
}
