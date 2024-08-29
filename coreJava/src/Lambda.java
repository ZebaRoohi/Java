//The Lambda expression is used to provide the implementation of an interface which has functional interface.
// It saves a lot of code.In case of lambda expression, we don't need to define the method again for providing the implementation

/*interface Hello{
  String say();
}

public class Lambda {
    public static void main(String args[]){
        Hello h=()-> {
            return "Hello world";
        };
        System.out.println(h.say());
    }
}*/

//with parameters
/*interface Hello{
    public String say(String name,String address);
}
public class Lambda{
    public static void main(String args[]){
        Hello h=(name,address)->{
            return "Hello"+name+"address:"+address;
        };
        System.out.println(h.say("John","USA"));
    }
}*/

//Addition
/*interface Operation {
    public int add(int a, int b);
}
    public class Lambda{
        public static void main(String args[]){
            Operation op=(a,b)->a+b;
            System.out.println("Addition is:"+op.add(2,3));
        }
    }
*/

//Arthematic operations
interface Arthematic {
    public int calculate(int a,int b);
}
public class Lambda{
    public static void main(String args[]){
        Arthematic addition=(a,b)->a+b;
        Arthematic substraction=(a,b)->a-b;
        Arthematic multiplication=(a,b)->a*b;
        Arthematic division=(a,b)->{
            if(b==0){
                System.out.println("Division by zero is not allowed");
            }
            return a/b;
        };
        System.out.println("Addition:"+addition.calculate(2,5));
        System.out.println("Substraction:"+substraction.calculate(10,5));
        System.out.println("Multiplication:"+multiplication.calculate(2,5));
        System.out.println("Division:"+division.calculate(5,2));
    }
}

