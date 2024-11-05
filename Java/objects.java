class Car {
    String brand;
    int value;

    public Car(String brand, int value) {
        this.brand = brand;
        this.value = value;
    }

    public void display (){
        System.out.println("The " + brand + " is priced at RS-" + value + "/-");
    }
}

public class objects{
    public static void main(String[] args){
        Car mycar = new Car("BMW",2000000);
        mycar.display();
        System.out.println("Car Name: " + mycar.brand);
    }
}