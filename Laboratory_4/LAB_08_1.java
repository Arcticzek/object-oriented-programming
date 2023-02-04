import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide number: ");

        try {
            double num = Double.parseDouble(scan.nextLine());

            if (num < 0) {
                throw new IllegalArgumentException("Number is negative");
            }

            double sqrt = Math.sqrt(num);
            System.out.println("Element from" + num + " is " + sqrt);
        } catch (NumberFormatException e) {
            System.out.println("The value given is not a number");
        } catch (IllegalArgumentException e) {
            System.out.println("The root of a negative number cannot be calculated");
        }
    }
}