//Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to
// define one interface and have multiple implementations.
// The word “poly” means many and “morphs” means forms, So it means many forms.

class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog says bho bho");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Cat says meow meow");
    }
}
public class Polymorphism {
    public static void main(String args[]){
        Animal myAnimal=new Animal();
        Animal dog=new Dog();
        Animal cat=new Cat();
        myAnimal.animalSound();
        dog.animalSound();
        cat.animalSound();

    }
}
