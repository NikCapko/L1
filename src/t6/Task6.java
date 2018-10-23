package t6;


public class Task6 {

    String[] labirint = {
            "#####1###########2#############",
            "##### ###    #########      ###",
            "#####    ### ######### ####   3",
            "9   ###########        ########",
            "### ##### ##### ##########  ###",
            "###       ##### ###### #### ###",
            "### #######      ##### ####   4",
            "### ###### ## ## ###     ######",
            "8      ###   ©## ### ### ######",
            "######7#############6###5######"
    };

    Cell[][] labirintNew;

    public void getResult() {

        System.out.println("\n Task 6");

        labirintNew = new Cell[labirint.length][labirint[0].length()];

        for (int i = 0; i < labirint.length; i++) {
            for (int j = 0; j < labirint[0].length(); j++) {
                labirintNew[i][j] = new Cell(labirint[i].charAt(j));
            }
        }

        findPath(8, 13);
    }

    private void findPath(int x, int y) {
        if (isValid(x, y) && labirintNew[x][y].isFree) {
            if (labirintNew[x][y].isOutput) {
                System.out.println(labirintNew[x][y].getSymbol());
                return;
            }

            labirintNew[x][y].isFree = false;

            if (isValid(x - 1, y) && labirintNew[x - 1][y].isFree) {
                findPath(x - 1, y);
            }

            if (isValid(x, y - 1) && labirintNew[x][y - 1].isFree) {
                findPath(x, y - 1);
            }

            if (isValid(x, y + 1) && labirintNew[x][y + 1].isFree) {
                findPath(x, y + 1);
            }

            if (isValid(x + 1, y) && labirintNew[x + 1][y].isFree) {
                findPath(x + 1, y);
            }
        }
    }

    private boolean isValid(int x, int y) {
        return (x >= 0 && y >= 0 && x < labirintNew.length && y < labirintNew[0].length);
    }
}

