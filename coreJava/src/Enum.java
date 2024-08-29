//An enum can, just like a class, have attributes and methods.
// The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

enum Color{
    Red,
    Green,
    Blue;
}
public class Enum {
    public static void main(String args[]){
        Color c1=Color.Red;
        System.out.println(c1);

        //with loop
        for(Color v1:Color.values()){
            System.out.println(v1);
        }

        //with switch
        Color v1_color=Color.Red;
        switch (v1_color){
            case Red:
                System.out.println("Red color");
                break;
            case Blue:
                System.out.println("Blue color");
                break;
            case Green:
                System.out.println("Green color");
                break;
            default:
                System.out.println("Other color");
        }
    }
}
