//Accessible only within the class where it is declared.
/*class PrivatEx{
    private int number=12;
    private void showNumber(){
        System.out.println("Number:"+number);
    }
    public void accessPrivate(){
        showNumber();
    }
}
public class AccessModifier {
    public static void main(String args[]){
        PrivatEx obj=new PrivatEx();
        //obj.showNumber(); //cannot access private

    }
}
*/

//Default:Accessible only within the same package.
/*class DefaultEx{
    int number=100;
    void setNumber(){
        System.out.println("Number:"+number);
    }
}
public class AccessModifier{
    public static void main(String args[]){
        DefaultEx obj=new DefaultEx();
        obj.setNumber();
    }
}*/

//Protected:Accessible within the same package and by subclasses.
/*class ProtectedEx{
    protected String msg="Hello world";

    protected void showMsg(){
        System.out.println("Message:"+msg);
    }
}
class DerivedEx extends ProtectedEx{
    public void displayMsg(){
        showMsg();//This works because DerivedExample is a subclass of ProtectedExample
    }
}
public  class AccessModifier {
    public static void main(String args[]){
        DerivedEx obj=new DerivedEx();
        obj.displayMsg();
    }
}*/
//Public:Accessible from any other class.
class PublicEx{
    public String greet="Hello,Public";

    public void showGreet(){
        System.out.println("Greetings:"+greet);
    }
}
public class AccessModifier{
    public static void main(String args[]){
        PublicEx obj=new PublicEx();
        obj.showGreet();
    }
}