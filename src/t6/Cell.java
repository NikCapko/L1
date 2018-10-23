package t6;

public class Cell {

    char symbol;
    public Boolean isWall;
    public Boolean isFree;
    public Boolean isOutput;
    private int water;

    public Cell(char c) {
        symbol = c;
        if (c == '#') {
            isWall = true;
            isFree = false;
        } else {
            isFree = true;
            isWall = false;
            if (Character.isDigit(c)) {
                isOutput = true;
            } else isOutput = false;
        }

    }

    public int getWather() {
        return water;
    }

    public void setWather(int weather) {
        this.water = weather;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
