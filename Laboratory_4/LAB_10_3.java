import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> stack = new LinkedList<T>();

    public void push(T v) {
        stack.addFirst(v);
    }

    public T peek() {
        return stack.getFirst();
    }

    public T pop() {
        return stack.removeFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public String toString() {
        return stack.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String expression = " +B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+') {
                stack.push(expression.charAt(++i));
            } else if (c == '-') {
                System.out.print(stack.pop());
            }
        }
    }
}