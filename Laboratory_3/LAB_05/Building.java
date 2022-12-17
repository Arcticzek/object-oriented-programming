import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Building {
    String name;
    int numberOfFloors;
    LocalDate yearOfBuild;

    public Building(String name, int numberOfFloors, LocalDate yearOfBuild) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.yearOfBuild = yearOfBuild;
    }
    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", yearOfBuild=" + yearOfBuild +
                '}';
    }

    public long calcAge() {
        LocalDate now = LocalDate.now();
        return ChronoUnit.YEARS.between(yearOfBuild, now);
    }
}
