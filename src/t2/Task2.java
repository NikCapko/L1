package t2;

public class Task2 {

    public void getResult() {

        System.out.println("\n Task 2");

        String[] player = {"Adam", "Bill", "Endry"};
        int[] rate = {250, 330, 400};
        int[] time = {35, 50, 73};

        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i] + " " + FooCorporation.getSalary(rate[i], time[i]));
        }
        /*
        Employee employeeArray[] = {
            new Employee("Adam", 250, 35),
            new Employee("Bill", 330, 50),
            new Employee("Endry", 400, 73)
        };
        for (Employee i : employeeArray) {
            System.out.println(i.getName() + " " + FooCorporation.getSalary(i));
        }
        */
    }
}
