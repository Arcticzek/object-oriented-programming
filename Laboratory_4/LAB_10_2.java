import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}

class FillQueue {
    public static Queue<Command> fillQueue() {
        Queue<Command> queue = new LinkedList<>();
        queue.add(new Command("run"));
        queue.add(new Command("jump"));
        queue.add(new Command("fly"));
        queue.add(new Command("swim"));
        return queue;
    }
}

class ConsumeQueue {
    public static void consumeQueue(Queue<Command> queue) {
        while (!queue.isEmpty()) {
            Command cmd = queue.poll();
            cmd.operation();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Queue<Command> queue = FillQueue.fillQueue();
        ConsumeQueue.consumeQueue(queue);
    }
}