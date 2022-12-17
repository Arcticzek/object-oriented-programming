public class Circle extends Figure{
    private Point center;
    private float radius;

    public Circle() {
        super();
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void setPromien(float p) {
        radius = p;
    }

    public double getPromien() {
        return radius;
    }

    public boolean inCenter(Point p) {
        double a = center.getX() - p.getX();
        double b = center.getY() - p.getY();
        return (a * a + b * b) <= radius * radius;
    }
}