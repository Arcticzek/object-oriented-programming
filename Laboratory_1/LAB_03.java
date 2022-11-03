// LAB_03.pdf

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand() {
        return new Random();
    }

    public static Scanner getFromKeyboard() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        // Ex 1
        System.out.println("Provide number of students");
        int numberOfStudents = getFromKeyboard().nextInt();
        System.out.println("Average is: " + calcAvg(numberOfStudents));
        // Ex 2
        int[] numbers = new int[10];
        System.out.println("Provide 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = getFromKeyboard().nextInt();
        }
        countPositiveAndNegative(numbers);
        // Ex 3
        System.out.println("Provide n to generate sequence: ");
        int n = getFromKeyboard().nextInt();
        sumEvenNumbersInSequence(n);
        // Ex 4
        System.out.println("Provide n to generate sequence: ");
        n = getFromKeyboard().nextInt();
        sumEvenNumbersInSequenceInRange(n);
        // Ex 5
        checkPalindrome("Kajak");
        checkPalindrome("Ambroży");
    }
    // Exercise 1
    public static double calcAvg(int numberOfStudents) {
        int i = 0;
        double sum = 0;
        while (i < numberOfStudents) {
            System.out.println("Provide points for " + (i + 1) + " student:");
            sum += getFromKeyboard().nextDouble();
            i++;
        }

        return sum / numberOfStudents;
    }
    // Exercise 2
    public static void countPositiveAndNegative(int[] arr) {
        int sumNegative = 0, sumPositive = 0, countNegative = 0, countPositive = 0;
        for (int num : arr) {
            if (num < 0) {
                sumNegative += num;
                countNegative++;
            } else {
                sumPositive += num;
                countPositive++;
            }
        }
        System.out.println("Sum of positive numbers is: " + sumPositive);
        System.out.println("Sum of negative numbers is: " + sumNegative);
        System.out.println("Count of positive numbers is: " + countPositive);
        System.out.println("Count of negative numbers is: " + countNegative);
    }
    // Ex 3
    public static void sumEvenNumbersInSequence(int n) {
        int[] arr = new int[n];
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand().nextInt(100);
        }
        for (int elem : arr) {
            if (elem % 2 == 0) {
                sumEven += elem;
            }
        }
        System.out.println("Sum of even numbers in sequence is: " + sumEven);
    }
    // Ex 4
    public static void sumEvenNumbersInSequenceInRange(int n) {
        int[] arr = new int[n];
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand().nextInt(56) - 10;
        }
        for (int elem : arr) {
            if (elem % 2 == 0) {
                sumEven += elem;
            }
        }
        System.out.println("Sum of even numbers in sequence in specified range is: " + sumEven);
    }
    // Ex 5
    public static void checkPalindrome(String word) {
        StringBuilder reversedWord = new StringBuilder();
        reversedWord.append(word);
        reversedWord.reverse();
        if (word.equalsIgnoreCase(reversedWord.toString())) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }
}