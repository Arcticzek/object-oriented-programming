// LAB_01.pdf
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand() {
        return new Random();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        System.out.println(getAge() + " " + getName());
        int a = getInt(), b = getInt(), c = getInt();
        int firstRand = rand().nextInt(a) + b, secondRand = rand().nextInt(a) + b;
        calculate(a, b);
        System.out.println(checkEven(2));
        System.out.println(checkDivideBy3And5(15));
        System.out.println(poweredBy3(3));
        System.out.println(sqrt(4));
        System.out.println(checkTrianglePerpendicular(firstRand, secondRand, c));
    }

    // Zadanie 1
    public static String getName() {
        return "Adrian";
    }

    public static int getAge() {
        return 21;
    }

    // Zadanie 2
    public static void calculate(int a, int b) {
        System.out.println("Sum of a and b: " + (a + b));
        System.out.println("Divide of a and b: " + (a - b));
        System.out.println("Multiply of a and b: " + (a * b));
    }

    // Zadanie 3
    public static boolean checkEven(int a) {
        return a % 2 == 0;
    }

    // Zadanie 4
    public static boolean checkDivideBy3And5(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    // Zadanie 5
    public static double poweredBy3(double a) {
        return Math.pow(a, 3);
    }

    // Zadanie 6
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    // Zadanie 7
    public static boolean checkTrianglePerpendicular(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}