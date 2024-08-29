//In Java, it is also possible to nest classes (a class within a class). The purpose of
// nested classes is to group classes that belong together, which makes your code more readable and maintainable.

class OuterClass{
    int x=10;
    class InnerClass{
        int y=5;

    }
}
public class InnerClass {
    public static void main(String args[]){
        OuterClass obj1=new OuterClass();
        OuterClass.InnerClass obj2=obj1.new InnerClass();
        System.out.println(obj2.y+obj1.x);

    }
}
