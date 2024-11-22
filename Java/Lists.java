import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Looping through the list
        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
