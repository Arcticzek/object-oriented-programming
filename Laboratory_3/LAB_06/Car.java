public class Car {
    private final String make;
    private final String model;
    private String body;
    private String color;
    private final int yearOfManufacture;
    private int mileage;

    public Car(String make, String model, String body, String color, int yearOfManufacture, int mileage) {
        this.make = make;
        this.model = model;
        this.body = body;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
    }

    public Car(String make, String model, int yearOfManufacture) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Body: " + body);
        System.out.println("Color: " + color);
        System.out.println("Year of manufacture: " + yearOfManufacture);
        System.out.println("Mileage: " + mileage);
    }
}
