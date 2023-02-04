interface Floats {
    void float();
}

interface Flies {
    void fly();
}

class Ship implements Floats {
    public void float() {
        System.out.println("The ship is floating");
    }
}

class Plane implements Flies {
    public void fly() {
        System.out.println("The plane is flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.float();

        Plane plane = new Plane();
        plane.fly();
    }
}