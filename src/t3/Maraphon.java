package t3;

public class Maraphon {

    public static int getChempion(Player[] playerArray) {

        int minTime = playerArray[0].getTime();
        int minTimeIndex = 0;

        for (int i = 1; i < playerArray.length; i++) {
            if (playerArray[i].getTime() < minTime) {
                minTime = playerArray[i].getTime();
                minTimeIndex = i;
            }
        }

        return minTimeIndex;
    }

    public static int getChempion(int[] player) {

        int minTime = player[0];
        int minTimeIndex = 0;

        for (int i = 1; i < player.length; i++) {
            if (player[i] < minTime) {
                minTime = player[i];
                minTimeIndex = i;
            }
        }

        return minTimeIndex;
    }
}
