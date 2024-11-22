import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate, will not be added

        // Displaying the set
        System.out.println("Set of numbers: " + numbers);

        // Checking if a number exists in the set
        if (numbers.contains(20)) {
            System.out.println("20 is in the set.");
        }
    }
}
