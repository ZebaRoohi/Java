//Java abstract class is a class that can not be initiated by itself, it needs to be subclassed by another
// class to use its properties.An abstract class is declared using the “abstract” keyword in its class definition.
//An instance of an abstract class can not be created.
//Constructors are allowed.
//We can have an abstract class without any abstract method.
//We can define static methods in an abstract class
//If a class contains at least one abstract method then compulsory should declare a class as abstract

abstract  class Sunstar{
    abstract void printInfo();
}
//abstraction perfomr using extends
class Employee extends Sunstar {
    void printInfo(){
        String name="John";
        int age=21;
        float salary=22.3f;
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
public class Abstract{
    public static void main(String args[]){
        Sunstar s=new Employee();
        s.printInfo();
    }
}
