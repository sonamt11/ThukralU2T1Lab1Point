public class Point {

    //instance variables
    private int x;
    private int y;

    //constructor - two parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //constructor - one parameter
    public Point(int value) {
        x = value;
        y = value;
    }

    //constructor - no parameters
    public Point() {
        x = 0;
        y = 0;
    }

    //getter for x
    public int getX() {
        return x;
    }

    //setter for x
    public void setX(int newX) {
        x = newX;
    }

    //getter for y
    public int getY() {
        return y;
    }

    //setter for x
    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        }
        if (x > 0 && y < 0) {
            return "II";
        }
        if (x < 0 && y < 0) {
            return "III";
        }
        if (x < 0 && y > 0) {
            return "IV";
        }
        if (x == 0 && y > 0) {
            return "on an axis";
        }
        if (x == 0 && y < 0) { return "on an axis"; }
        if (x > 0 && y == 0) { return "on an axis"; }
        if (x < 0 && y == 0) { return "on an axis"; }
        if (x == 0 & y == 0); { return "origin" }
    }


}
