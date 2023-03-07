public class MyClass {
    public static void main(String args[]) {
        double total = 0;
        double width = .75;

        for (double x = -3; x < 0; x += width) {
            total += width * ((calc(x) + calc(x + width)) / 2);
            System.out.println(total);

        }
    }

    public static double calc(double x) {
        return (.25) * (x * x) - 2 * x + 6;
    }
}