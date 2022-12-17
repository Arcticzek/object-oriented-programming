public class MotorCar extends Car {
    private double weight;
    private double engineCapacity;
    private int numPersons;

    public MotorCar(String make, String model, String body, String color, int yearOfManufacture, int mileage,
                     double weight, double engineCapacity, int numPersons) {
        super(make, model, body, color, yearOfManufacture, mileage);
        this.weight = weight;
        this.engineCapacity = engineCapacity;
        this.numPersons = numPersons;
    }

    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("Weight: " + weight);
        System.out.println("Engine capacity: " + engineCapacity);
        System.out.println("Number of persons: " + numPersons);
    }
}
