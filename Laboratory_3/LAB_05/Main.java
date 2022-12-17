import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Ex 1
        Rectangle r1 = new Rectangle(12,24);
        System.out.println(r1.calcArea());
        System.out.println(r1.calcCircuit());
        System.out.println(r1.calcDiagonal());
        // Ex 2
        Building b1 = new Building("RSM DABROWSKIEGO",10, LocalDate.of(1968,1,1));
        Building b2 = new Building("GEODECI",10, LocalDate.of(1999,1,1));
        Building b3 = new Building("CAPITAL TOWERS",10, LocalDate.of(2021,1,1));
        System.out.println(b1.toString());
        System.out.print("Age of building: ");
        System.out.println(b1.calcAge());
        System.out.println(b2.toString());
        System.out.print("Age of building: ");
        System.out.println(b2.calcAge());
        System.out.println(b3.toString());
        System.out.print("Age of building: ");
        System.out.println(b3.calcAge());
        // Ex 3
        Species species1 = new Species("Canis", "lupus", 78, 39, "Gray wolf");
        Species species2 = new Species("Felis", "catus", 38, 19, "Domestic cat");
        Species species3 = new Species("Panthera", "leo", 38, 19, "Lion");

        System.out.println("Full name of species 1: " + species1.getFullName());
        System.out.println("Haploid number of chromosomes for species 1: " + species1.getHaploidNumChromosomes());
        System.out.println("All data for species 1: " + species1.getAllData());

        Species species1Clone = species1.clone();
        System.out.println("Is species1 == species1Clone? " + (species1 == species1Clone));
    }
}