// Superclass
class Car {
    private String brand;
    private int year;

    // Constructor for Car
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
    }
}

// Subclass inheriting from Car
class ElectricCar extends Car {
    private int batteryCapacity; // Additional attribute for electric cars

    // Constructor for ElectricCar
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // Call the constructor of the superclass (Car)
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display electric car details
    public void displayInfo() {
        super.displayInfo(); // Call the superclass displayInfo method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Getter for battery capacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("Tesla", 2022, 100);

        // Display electric car details
        myElectricCar.displayInfo();
        System.out.println("Car Brand: " + myElectricCar.getBrand());
        System.out.println("Battery Capacity: " + myElectricCar.getBatteryCapacity());
    }
}
