public class Rectangle {
    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double calcArea() {
        return width * length;
    }

    public double calcCircuit() {
        return 2 * width + 2 * length;
    }

    public double calcDiagonal() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(length,2));
    }
}
