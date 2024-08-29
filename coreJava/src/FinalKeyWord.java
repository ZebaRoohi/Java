//The final keyword is a non-access modifier used for classes, attributes and methods, which makes them
// non-changeable (impossible to inherit or override).The final keyword is useful when you want a variable
// to always store the same value, like PI

/* this code gives err as after declaring final you cannot change the value
class Bike{
    final int speed=100;
    void run(){
        speed=130;
    }
}
public class FinalKeyWord {
    Bike obj=new Bike();
    obj.run();


}
*/