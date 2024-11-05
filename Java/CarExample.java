// Define the Car class
class Car {
    // Attributes (fields) of the Car class
    String brand;
    int year;

    // Constructor: initializes the Car object
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
    }
}

// Main class to test Car objects
public class CarExample {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2020);

        // Call the method to display car details
        // myCar.displayInfo();
        
    }
}
