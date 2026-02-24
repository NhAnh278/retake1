package pgdp.pinguschach;

/**
 * Do not modify this file!
 */
public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Position))
            return false;
        Position c = (Position) o;
        return c.row == row && c.column == column;
    }

    public int hashCode() {
        return 100 * row + column;
    }

    public String toString() {
        return "(" + row + "," + column + ")";
    }

}
