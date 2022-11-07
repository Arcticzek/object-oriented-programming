import java.util.*;

public class Main {

    public static Scanner getFromKeyboard() {
        return new Scanner(System.in);
    }
    public static Random rand() {
        return new Random();
    }
    public static int[] createRandom(int a, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++ ) {
            arr[i] = rand().nextInt(a);
        }
        return arr;
    }
    public static List<Integer> bubbleSort(List<Integer> numbers) {
        for (int j = numbers.size() - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    Collections.swap(numbers,i, i+1);
                }
            }
        }
        return numbers;
    }

    public static int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static String reverseWord(String word) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(word);
        reverse.reverse();
        return reverse.toString();
    }

    public static void main(String[] args) {
        // Ex 1
        sumAndAvgElements(createRandom(100, 10));
        // Ex 2
        System.out.print("Every second elements from arrays: ");
        printEverySecondElement(createRandom(99, 10));
        printEverySecondElement(createRandom(101, 9));
        // Ex 3
        System.out.print("\n");
        String[] cats = {"Cat", "Second cat", "third CAT"};
        printUpperCase(cats);
        // Ex 4
        System.out.println("Provide five words to reverse them: ");
        reversedWordsFromArray();
        // Ex 5
        System.out.println("\nProvide eight numbers to sort them: ");
        sortEightNumbers();
        // Ex 6
        System.out.println("Provide five numbers to calculate factorial from them: ");
        calcFactorialFromArray();
        // Ex 7
        String[] anotherCats = {"Cat", "Second cat", "third CAT"};
        System.out.print("\n");
        stringArrayEqualsCheck(cats, anotherCats);
    }
    // Exercise 1
    public static void sumAndAvgElements(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        int avg = sum / arr.length;
        System.out.println("Sum of elements from array is: " + sum);
        System.out.println("Average of elements from array is: " + avg);
    }
    // Exercise 2
    public static void printEverySecondElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    // Exercise 3
    public static void printUpperCase (String[] arr) {
        for (String elem : arr) {
            System.out.println(elem.toUpperCase(Locale.ROOT));
        }
    }
    // Exercise 4
    public static void reversedWordsFromArray() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = getFromKeyboard().next();
            arr[i] = reverseWord(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    // Exercise 5
    public static void sortEightNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(getFromKeyboard().nextInt());
        }
        List<Integer> sorted = bubbleSort(list);
        sorted.forEach((n) -> System.out.println(n + " "));
    }
    // Exercise 6
    public static void calcFactorialFromArray() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = getFromKeyboard().nextInt();
        }
        for (int i = 0; i < 5; i++) {
            arr[i] = factorial(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }
    public static void stringArrayEqualsCheck(String[] arr, String[] arr2) {
        boolean theSame = true;
        if (arr.length != arr2.length) {
            System.out.println("Arrays are not the same!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals(arr2[i])) {
                    System.out.print("Arrays are not the same!");
                    theSame = false;
                    break;
                }
            }
            if (theSame) {
                System.out.print("Arrays are the same!");
            }
        }
    }
}