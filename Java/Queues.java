import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Accessing and removing elements
        System.out.println("First person in queue: " + queue.poll()); // Removes Alice
        System.out.println("Next person in queue: " + queue.peek()); // Checks Bob

        System.out.println("Queue after polling: " + queue);
    }
}

