public class dbaClass {

    public static int[][] calcMagicMath(int[] rowH, int[] colH) {
        int[][] twoDArray = new int[rowH.length][colH.length];

        for (int row = 0; row < rowH.length; row++) {
            for (int col = 0; col < colH.length; col++) {
                twoDArray[row][col] = rowH[row] * colH[col];
            }
        }
        return twoDArray;
    }

}
