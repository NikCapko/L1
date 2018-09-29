package task5;

public class Task5 {
    double[] dict = {1.2, 3.8, 1.7, 1.7};

    public void getResult() {

        for (int i = 0; i < dict.length; i++) {
            System.out.println(kill());
        }

        System.out.println("Победа");
    }

    public double kill() {

        int index = 0;

        for (int i = 0; i < dict.length; i++) {
            if (!Double.isNaN(dict[i])) {
                index = i;
                break;
            }
        }
        double min = dict[index];
        for (int i = index + 1; i < dict.length; i++) {
            if (!Double.isNaN(dict[i]) && min > dict[i]) {
                min = dict[i];
                index = i;
            }
        }

        dict[index] = Double.NaN;

        return min;
    }
}
