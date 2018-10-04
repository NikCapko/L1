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

    public void getResult() {
        findPath(13,8);
    }

    private void findPath(int x, int y) {
        if (isValid(x, y)) {
            if (Character.isDigit(labirint[y].charAt(x))) {
                System.out.println(labirint[y].charAt(x));
            }

            if (isValid(x + 1, y) && isFree(x + 1, y)) {
                findPath(x + 1, y);
            }
            if (isValid(x + 1, y + 1) && isFree(x + 1, y + 1)) {
                findPath(x + 1, y + 1);
            }
            if (isValid(x + 1, y - 1) && isFree(x + 1, y - 1)) {
                findPath(x + 1, y - 1);
            }

            if (isValid(x, y + 1) && isFree(x, y + 1)) {
                findPath(x, y + 1);
            }
            if (isValid(x, y - 1) && isFree(x, y - 1)) {
                findPath(x, y - 1);
            }

            if (isValid(x - 1, y) && isFree(x - 1, y)) {
                findPath(x - 1, y);
            }
            if (isValid(x - 1, y + 1) && isFree(x - 1, y + 1)) {
                findPath(x - 1, y + 1);
            }
            if (isValid(x - 1, y - 1) && isFree(x - 1, y - 1)) {
                findPath(x - 1, y - 1);
            }
        }
    }

    private boolean isValid(int x, int y) {
        return (x >= 0 && y >= 0 && x < labirint[0].length() && y < labirint.length);
    }

    private boolean isFree(int x, int y) {
        return labirint[y].charAt(x) != '#';

    }

}

