// Superclass
class Animal {
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog that overrides the sound method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat that also overrides the sound method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling overridden methods
        myDog.sound(); // Output will be "Dog barks"
        myCat.sound(); // Output will be "Cat meows"
    }
}

// Summary
// Method Overloading: Same method name with different parameter lists in the same class.
// Method Overriding: Subclass provides a specific implementation of a superclass method.
// Polymorphism allows for more flexible code and enables objects to behave differently based on their types. Let me know if you’d like to dive deeper into any of these concepts or move on to Abstraction next!