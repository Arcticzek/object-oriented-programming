import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

class ShoppingSimulation {
    private static String[] products = { "banana", "apple", "milk", "bread", "eggs",
            "chicken", "potatoes", "carrots", "lettuce", "tomatoes" };

    public static void main(String[] args) {
        Stack<String> basket = new Stack<String>();
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random();

        // Fill basket with random items
        int basketSize = rand.nextInt(15);
        for (int i = 0; i < basketSize; i++) {
            basket.push(products[rand.nextInt(10)]);
        }

        // Join queue on a random position
        int queueSize = rand.nextInt(10);
        for (int i = 0; i < queueSize; i++) {
            queue.add(i);
        }
        int position = queue.poll();

        System.out.println("You are in position " + position + " in the queue.");

        // When it's your turn, print the items in the basket
        System.out.println("Your basket contains the following items: ");
        while (!basket.empty()) {
            System.out.println(basket.pop());
        }
    }
}