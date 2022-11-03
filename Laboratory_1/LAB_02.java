// LAB_02.pdf

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean stringToBoolean(String conv) {
        return Boolean.parseBoolean(conv);
    }

    public static Scanner getFromKeyboard() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        // Ex 1
        System.out.println("Provide a, b, and c to the quadratic equation!");
        double a = getFromKeyboard().nextDouble(), b = getFromKeyboard().nextDouble(), c = getFromKeyboard().nextDouble();
        quadraticEquation(a, b, c);
        // Ex 2
        System.out.println("Provide arguments to use functions!");
        int arg = getFromKeyboard().nextInt();
        int arg2 = getFromKeyboard().nextInt();
        int arg3 = getFromKeyboard().nextInt();
        System.out.println(a(arg));
        System.out.println(b(arg2));
        System.out.println(c(arg3));
        // Ex 3
        sortNumbers(4,1,7);
        // Ex 4
        System.out.println("\nProvide information about rain and bus (true/false)\nIt's rainy?");
        String rainAnswer = getFromKeyboard().next();
        System.out.println("Is your bus at the stop?");
        String busAnswer = getFromKeyboard().next();
        boolean rain = stringToBoolean(rainAnswer), bus = stringToBoolean(busAnswer);
        weatherCheck(rain, bus);
        // Ex 5
        System.out.println("Provide information about discount and bonus (true/false)\nIs there any car discount?");
        String discountAnswer = getFromKeyboard().next();
        System.out.println("Did you get bonus in your job?");
        String bonusAnswer = getFromKeyboard().next();
        boolean discount = stringToBoolean(discountAnswer), bonus = stringToBoolean(bonusAnswer);
        carBoughtCheck(discount, bonus);
        // Ex 6
        System.out.println("1. Adding\n2. Subtraction\n3. Multiply\n4. Dividing\n5. The remainder from dividing");
        int choice = getFromKeyboard().nextInt();
        calculator(choice);
    }
    // Exercise 1
    public static void quadraticEquation(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta) / (2 * a));
            double x2 = (-b + Math.sqrt(delta) / (2 * a));
            System.out.println("x1 equal: " + x1);
            System.out.println("x2 equal: " + x2);
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("x0 equal: " + x0);
        } else {
            System.out.println("No elements");
        }
    }
    // Exercise 2
    public static double a(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }
    public static double b(double x) {
        if (x >= 1) {
            return Math.pow(x,2);
        } else if (x < 1) {
            return x;
        } else {
            return 0;
        }
    }
    public static double c(double x) {
        if (x > 2) {
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x - 4;
        }
    }
    // Exercise 3
    public static void sortNumbers(int x, int y, int z) {
        int[] tab = {x, y, z};
        Arrays.sort(tab);
        System.out.print("Sorted x, y and z is: ");
        for (int num : tab) {
            System.out.print(num + " ");
        }
    }
    // Exercise 4
    public static void weatherCheck(boolean rain, boolean bus) {
        if (rain && bus) {
            System.out.println("Take umbrella! You will get into the college");
        }
        if (rain && !bus) {
            System.out.println("You're not getting into college");
        }
        if (!rain && bus) {
            System.out.println("You will get into the college. Have a nice day and beautiful weather!");
        }
        if (!rain && !bus) {
            System.out.println("Take a walk to the college!");
        }
    }
    // Exercise 5
    public static void carBoughtCheck(boolean discount, boolean bonus) {
        if (!discount || bonus) {
            System.out.println("You can bought a car! There is no discounts for the car");
        }
        if (!discount || !bonus) {
            System.out.println("You have to postpone the purchase of the car for later... There is discounts for the car");
        }
        if (discount || bonus) {
            System.out.println("You can bought a car!");
        }
    }
    // Exercise 6
    public static void calculator(int choice) {
        double a, b;
        switch (choice) {
            case 1 -> {
                System.out.println("You choose adding!");
                a = getFromKeyboard().nextDouble();
                b = getFromKeyboard().nextDouble();
                System.out.println("Sum of " + a + " + " + b + " equal: " + (a + b));
            }
            case 2 -> {
                System.out.println("You choose subtraction!");
                a = getFromKeyboard().nextDouble();
                b = getFromKeyboard().nextDouble();
                System.out.println("Subtraction of " + a + " - " + b + " equal: " + (a - b));
            }
            case 3 -> {
                System.out.println("You choose multiply!");
                a = getFromKeyboard().nextDouble();
                b = getFromKeyboard().nextDouble();
                System.out.println("Multiplication of " + a + " * " + b + " equal: " + (a * b));
            }
            case 4 -> {
                System.out.println("You choose divide!");
                a = getFromKeyboard().nextDouble();
                b = getFromKeyboard().nextDouble();
                if (b == 0) {
                    System.out.println("You can't divide by 0!");
                } else {
                    System.out.println(a + " divided by " + b + " equal: " + (a / b));
                }
            }
            case 5 -> {
                System.out.println("You choose the remainder from dividing!");
                a = getFromKeyboard().nextDouble();
                b = getFromKeyboard().nextDouble();
                System.out.println("The remainder from dividing " + a + " by " + b + " equals: " + (a % b));
            }
        }
    }
}