
//Single level inheritance:When a class inherits another class, it is known as a single inheritance.
/*class Animal{
    void eat(){
        System.out.println("Animal eats their choiced food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("I hate dog and its bark");
    }
}
public class Inheritance {
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        d.bark();

    }
}*/

//Multilevel Inheritance:When there is a chain of inheritance, it is known as multilevel inheritance.
/*class Flower{
    void properties(){
        System.out.println("Flowers are of many types and properties");
    }
}
class Rose extends Flower{
    void color(){
        System.out.println("Rose is having many colors");
    }
}
class Lotus extends Rose{
    void size(){
        System.out.println("Lotus is big in size and it grows in water");
    }
}
public class Inheritance{
    public static void main(String args[]){
        Lotus obj=new Lotus();
        obj.size();
        obj.color();
        obj.properties();
    }
}
*/
//Hierachial inheritance:When two or more classes inherits a single class, it is known as hierarchical inheritance.
/*class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class Inheritance{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        //c.bark(); same class name cannot be call in hierachial inheritance
        c.eat();
    }
}*/

//Multiple inheritance:and it is not supported in java
class A{
    void msg(){System.out.println("Hello");}
}
class B{
    void msg(){System.out.println("Welcome");}
}
/* Java does not support multiple inheritance
class C extends A,B{//suppose if it were

    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?
    }
} //this gives compile time errors*/