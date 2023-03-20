// Purpose: to caculate launch distances using 2d arrays
//
//By: Jose Reynaldo
//20/3/23

public class CatapultTesterV2 {
    private int[] speedArray;
    private int[] angleArray;
    private double[][] twoDimArray;

    public CatapultTesterV2(int[] speedArray, int[] angleArray) {
        this.speedArray = speedArray;
        this.angleArray = angleArray;
        this.twoDimArray = new double[speedArray.length][angleArray.length];
    }

    public void fillTable() {
        CatapultV2 catapult = new CatapultV2();

        for (int i = 0; i < speedArray.length; i++) {
            for (int j = 0; j < angleArray.length; j++) {
                double distance = catapult.calcDistance(speedArray[i], angleArray[j]);
                twoDimArray[i][j] = distance;
            }
        }
    }

    public void printResults() {
        System.out.printf("%-10s", "MPH");
        for (int angle : angleArray) {
            System.out.printf("%d %-12s", angle, "deg");
        }
        System.out.println(
                "\n===========================================================================================");

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.printf("%-10d", speedArray[i]);
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.printf("%-15.2f", twoDimArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] speedArray = { 20, 25, 30, 35, 40 };
        int[] angleArray = { 10, 20, 30, 40, 50, 60 };

        CatapultTesterV2 tester = new CatapultTesterV2(speedArray, angleArray);
        tester.fillTable();
        tester.printResults();
    }
}