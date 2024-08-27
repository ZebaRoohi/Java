//The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share
// the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks,
// and nested classes. The static keyword belongs to the class rather than an instance of the class.
// The static keyword is used for a constant variable or a method that is the same for every instance of a class.

/*public class Statickeyword {
    int rollno;
    String name;
    static String college="MJ";

    Statickeyword(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public void display(){
        System.out.println("Rollno:"+rollno+" "+"Name:"+name+" "+"College:"+college);
    }
public  static void main(String args[]){
        Statickeyword obj1=new Statickeyword(101,"Henry");
        Statickeyword obj2=new Statickeyword(102,"Kia");
        obj1.display();
        obj2.display();
}
}*/


public class Statickeyword {
    int rollno;
    String name;
    static String college;
    static int counter = 0;

    public Statickeyword(String name) {
        this.rollno = setRollno();
        this.name = name;
    }

    static int setRollno() {
        counter++;
        return counter;
    }

    static void setClg(String clg) {
        college = clg;
    }

    public void display() {
        System.out.println("Rollno:" + rollno + " " + "Name:" + name + " " + "College:" + college);
    }

    public static void main(String args[]) {
        Statickeyword.setClg("XYZ college");
        Statickeyword obj1 = new Statickeyword("Alice");
        Statickeyword obj2 = new Statickeyword("Bob");

        obj1.display();
        obj2.display();
    }
}