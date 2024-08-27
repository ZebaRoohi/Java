//Constructor is a specila method in java that is called when the object of class is created.It is used to
//initalize object propertis

public class Constructor{
    //instance of class
    String brand;
    String model;
    int year;
//constructor
     Constructor(String brand,String model,int year){
         //intilaizing the instance varuable with provided values
         this.brand=brand;
         this.model=model;
         this.year=year;
     }
     //Methods to display car details
      void display(){
          System.out.println("Brand:"+brand+" "+"Model:"+model+" "+"Year:"+year);
      }
      public  static  void main(String args[]){
         Constructor obj=new Constructor("Toyota","2021",2012);
         obj.display();
      }
        }
//Constructor overloading in Java allows a class to have more than one constructor,
// each with a different parameter list.
/*public class Constructor {
    int id;
    String name;
    float salary;

    //default constructor
    Constructor(){
        id=0;
        name="unknown";
        salary=0.0f;
    }
    //constructor with one parameters
    Constructor(int id){
        this.id=id;
       name="unknown";
        salary=0.0f;
    }
    //constructor with 2 parameters
    Constructor(int id,String name){
        this.id=id;
        this.name=name;
        salary=0.0f;
    }
    //constructor with three parameters
    Constructor(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
    public  static void main(String args[]){
        Constructor emp1=new Constructor();
        Constructor emp2=new Constructor(101);
        Constructor emp3=new Constructor(101,"John");
        Constructor emp4=new Constructor(101,"John",2300);

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}*/
