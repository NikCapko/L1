package t4;

public class Task4 {

    int a = 0;

    public void getResult() {

        System.out.println("\n Task 4");

        printBit();

        System.out.println("Установка бита с номером 13 в 1");
        stateBit(13, 1);
        printBit();

        System.out.println("Установка бита с номером 13 в 0");
        stateBit(13, 0);
        printBit();

        System.out.println("Инвертирование бита с номером 15");
        invertBit(15);
        printBit();

        System.out.println("Проверка значения бита с номером 12");
        printBit();
        System.out.println(chekBit(12));
    }

    public void stateBit(int i, int flag) {

        if (flag == 1) {
            a |= 1 << i;
        } else a &= ~(1 << i);
    }

    public boolean chekBit(int i) {
        return (a & (1 << i)) > 0;
    }

    public void invertBit(int i) {
        a ^= 1 << i;
    }

    public void printBit() {
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
    }
}
