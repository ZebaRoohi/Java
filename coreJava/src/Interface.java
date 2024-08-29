//It is used to achieve total abstraction.
//Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
//Any class can extend only 1 class, but can any class implement an infinite number of interfaces.
//It is also used to achieve loose coupling.
//Interfaces are used to implement abstraction.


/*interface  Draw{
    void display();
}
class Rectangle implements Draw{
    public void display(){
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Draw{
    public  void display(){
        System.out.println("Drawing circle");
    }
}
public class Interface {
    public static  void main(String args[]){
        Draw d=new Circle();
        d.display();

    }
}*/


interface VehicleA {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a); // Corrected method name
}
class Bicycle implements VehicleA {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) { // Corrected method name
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) { // Corrected method name
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Bicycle - speed: " + speed + " gear: " + gear);
    }
}
class Bike implements VehicleA {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) { // Corrected method name
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Bike - speed: " + speed + " gear: " + gear);
    }
}
public class Interface{ // Renamed main class to avoid conflict with `Interface` keyword
    public static void main(String[] args) {
        // Create a Bicycle object and test its functionality
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state:");
        bicycle.printStates();

        // Create a Bike object and test its functionality
        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(5);
        bike.applyBrakes(2);

        System.out.println("Bike present state:");
        bike.printStates();
    }
}
