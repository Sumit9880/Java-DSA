class Car {
    // Private fields
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        if (year > 1885) { // Cars were invented around this time
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2020);

        // Display initial car details
        myCar.displayInfo();

        // Modify car details using setters
        myCar.setBrand("Honda");
        myCar.setYear(2018);

        // Display modified car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayInfo();
        System.out.println("car"+myCar.getBrand());
    }
}
