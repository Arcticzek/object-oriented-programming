class InvalidValueForFactorialException extends Exception {
    public InvalidValueForFactorialException(String message) {
        super(message);
    }
}

public class Main {
    public static long factorial(int num) throws InvalidValueForFactorialException {
        if (num < 0) {
            throw new InvalidValueForFactorialException("Argument cannot be negative");
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5 is: " + factorial(5));
            System.out.println("Factorial of -4 is: " + factorial(-4));
        } catch (InvalidValueForFactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}