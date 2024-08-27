/*public class ExampleClass {
    String fname="John";
    String lname="Doe";
    int age=24;

    public  static  void main(String args[]){
        ExampleClass obj=new ExampleClass();
        System.out.println("Name:"+obj.fname+" "+"last name:"+obj.lname);
        System.out.println("Age:"+obj.age);

    }
}*/

//car properties
/*public  class ExampleClass{
    String brand="Toyota";
    int model=2023;
    String color="red";
    public  static  void main(String args[]){
        ExampleClass obj=new ExampleClass();
        System.out.println("car details"+obj.brand+" "+obj.model+" "+obj.color);
    }

}*/

//initialization through methods
/*public class ExampleClass{
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    void displayInfo(){
        System.out.println(rollno+" "+name);
    }
    public static void main(String args[]){
        ExampleClass s1=new ExampleClass();
        ExampleClass s2=new ExampleClass();
        s1.insertRecord(101,"harry");
        s2.insertRecord(102,"billy");
        s1.displayInfo();
        s2.displayInfo();
    }
}*/

/*public class ExampleClass{
    int id;
    String name;
    float salary;

    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String args[]){
        ExampleClass  s1=new ExampleClass();
        s1.insert(101,"john",3000);
        s1.display();
    }

}*/

public class ExampleClass{
    int account;
    String name;
    float amount;
    void insert(int a,String n,float amt){
        account=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+"deposited");
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficent balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+"withdraw");
        }
    }
    void checkBalance(){
        System.out.println("Balance"+amount);
    }
    void display(){
        System.out.println(account+" "+name+" "+amount);
    }
    public static  void main(String args[]){
        ExampleClass obj=new ExampleClass();
        obj.insert(23456,"Zeba",70000);
        obj.display();
        obj.checkBalance();
        obj.deposit(20000);
        obj.checkBalance();
        obj.withdraw(50000);
        obj.checkBalance();

    }
}