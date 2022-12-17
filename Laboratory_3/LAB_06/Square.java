public class Square extends Rectangle {
    public Square(float side) {
        super(side, side);
    }

    public float getSide() {
        return getHeight();
    }

    public void setSide(float side) {
        setHeight(side);
        setWidth(side);
    }
}