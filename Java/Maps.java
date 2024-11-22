import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        // Accessing a value by key
        System.out.println("Alice's age: " + ages.get("Alice"));

        // Looping through keys and values
        System.out.println("Ages of people:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
