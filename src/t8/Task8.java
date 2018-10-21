package t8;

public class Task8 {

    private static int[] arrayFirst = {0, 2, 2};
    private int[] arraySecond = {1, 3};

    public void getResult() {
        System.out.println("\n Task 8");
        int[] array = mergeSorting(arrayFirst, arraySecond);
        printArray(array);
    }

    private int[] mergeSorting(int[] arrayFirst, int[] arraySecond) {
        int[] array = new int[arrayFirst.length + arraySecond.length];
        int k = 0, l = 0;
        for (int i = 0; i < array.length; i++) {
            if (k < arrayFirst.length && l < arraySecond.length) {
                if (arrayFirst[k] > arraySecond[l]) {
                    array[i] = arrayFirst[k];
                    k++;
                } else {
                    array[i] = arraySecond[l];
                    l++;
                }
            } else {
                if (k < arrayFirst.length) {
                    for (int j = 0; j <= i; j++) {
                        if (arrayFirst[k] < array[j]) {
                            int num = array[j];
                            array[j] = arrayFirst[k];
                            arrayFirst[k] = num;
                        }
                        if (j == i) {
                            array[i] = arrayFirst[k];
                            k++;
                            break;
                        }
                    }
                } else if (l < arraySecond.length) {
                    for (int j = 0; j <= i; j++) {
                        if (arraySecond[l] < array[j]) {
                            int num = array[j];
                            array[j] = arraySecond[l];
                            arraySecond[l] = num;
                        }
                        if (j == i) {
                            array[i] = arraySecond[l];
                            l++;
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.valueOf(array[i]));
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
