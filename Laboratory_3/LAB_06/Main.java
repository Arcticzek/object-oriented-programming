public class Main {
    public static void main(String[] args) {
        // Ex 1
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p3 = new Point(-3, 4);

        p1.describe();
        p2.describe();
        p3.describe();

        p1.move(1, -1);
        p1.describe();

        p2.zero();
        p2.describe();

        Rectangle r = new Rectangle(3, 4);
        float rArea = r.getArea();

        Triangle t = new Triangle(4, 5);
        float tArea = t.getArea();

        Circle c1 = new Circle();
        Circle c2 = new Circle(new Point(1, 2), 3);

        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 diameter: " + c1.getDiameter());
        c1.setPromien(5);
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 diameter: " + c1.getDiameter());
        System.out.println("p1 in c1: " + c1.inCenter(p1));
        Square s = new Square(5);
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square side: " + s.getSide());
        s.setSide(10);
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square side: " + s.getSide());
        // Ex 2
        Car car1 = new Car("Toyota", "Corolla", "Sedan", "Blue", 2020, 0);
        Car car2 = new Car("Ford", "Fiesta", "Hatchback", "Red", 2018, 25000);

        MotorCar motorCar1 = new MotorCar("BMW", "X5", "SUV", "Black", 2019, 30000, 2.2, 2.0, 5);
        MotorCar motorCar2 = new MotorCar("Audi", "Q7", "SUV", "White", 2017, 35000, 2.5, 2.5, 7);

        car1.displayCarInfo();
        System.out.println();
        car2.displayCarInfo();
        System.out.println();
        motorCar1.displayCarInfo();
        System.out.println();
        motorCar2.displayCarInfo();
        // Ex 3
        Bookstore bookstore = new Bookstore("My Bookstore");

        Textbook textbook1 = new Textbook("Calculus", "John Doe", 500, "Mathematics");
        Textbook textbook2 = new Textbook("Physics", "Jane Doe", 600, "Physics");
        Novel novel1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", 180, "Fiction");
        Novel novel2 = new Novel("Pride and Prejudice", "Jane Austen", 250, "Romance");

        bookstore.addBook(textbook1);
        bookstore.addBook(textbook2);
        bookstore.addBook(novel1);
        bookstore.addBook(novel2);

        Customer customer1 = new Customer("John Smith");
        bookstore.displayBooks();
    }
}