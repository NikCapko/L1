package t2;

public class FooCorporation {

    private final static int BASE_RATE = 300;
    private final static int MAX_TIME = 60;
    private final static int BASE_TIME = 40;
    private final static double RATIO = 1.5;

    public static String getSalary(Employee employee) {
        if (employee.getRate() < BASE_RATE) {
            return "Минимально разрешенная базовая ставка - 300 руб/час";
        }
        if (employee.getTime() > MAX_TIME) {
            return "Работникам запрещено работать больше 60 часов";
        }
        if (employee.getTime() > BASE_TIME) {
            return String.valueOf(BASE_TIME * employee.getRate() + (employee.getTime() - BASE_TIME) * RATIO * employee.getRate());
        } else {
            return String.valueOf(BASE_TIME * employee.getRate());
        }
    }

    public static String getSalary(int rate, int time) {
        if (rate < BASE_RATE) {
            return "Минимально разрешенная базовая ставка - 300руб/час";
        }
        if (time > MAX_TIME) {
            return "Работникам запрещено работать больше 60 часов";
        }
        if (time > BASE_TIME) {
            return String.valueOf(BASE_TIME * rate + (time - BASE_TIME) * RATIO * rate);
        } else {
            return String.valueOf(BASE_TIME * rate);
        }
    }
}
