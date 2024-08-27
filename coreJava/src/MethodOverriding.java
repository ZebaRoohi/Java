class Vehicle {
    // Method to be overridden
    void run() {
        System.out.println("The vehicle is running");
    }
}

class Car extends Vehicle {
    // Overriding the run method
    @Override
    void run() {
        super.run(); // Call the superclass method
        System.out.println("The car is running safely at 60 mph");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run(); // Calls the overridden method in Car class
    }
}
