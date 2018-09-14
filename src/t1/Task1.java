package t1;

import static java.lang.System.out;

public class Task1 {

    double x0 = 8;
    double v0 = 0.9;
    final double a = 9.8;

    public void getResult() {

        out.println("\n Task 1");

        double t = 0.3;
        out.println(x(t));
    }

    private double x(double t) {
        return x0 + v0 * t + (a * t * t) / 2;
    }
}
