public class Point {
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zero() {
        x = 0;
        y = 0;
    }

    public void describe() {
        System.out.println("Point at (" + x + ", " + y + ")");
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}