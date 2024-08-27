//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

/*public class Encapsulation {
    String isbk;
    private String title;
    private String author;
    private double price;

    //create cnstructor
    public Encapsulation(String isbk,String title,String author,double price ){
        this.isbk=isbk;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String getAll(){
        return  isbk;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    //setter method
    public  void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Invalid price");
        }
    }
    public void  display(){
        System.out.println("Book:"+isbk+" "+"Title:"+title+" "+"Author:"+author+" "+"Price:"+price);
    }
        public static  void main(String args[]){
            Encapsulation book=new Encapsulation("1234","JS","James",78.9);
            book.display();

            book.setPrice(67.6);
            System.out.println("Updated price is $"+book.getPrice());

            book.setPrice(-23.1);
            System.out.println("Invalid price: "+book.getPrice());

            //displaying final book details
            book.display();
        }
    }
*/

public class Encapsulation {
    // Private fields for book details
    private String isbn;
    private String name;  // Represents the title of the book
    private String author;
    private double price;

    // Constructor to initialize book details
    public Encapsulation(String isbn, String name, String author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Public getter method for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Public getter method for name (title)
    public String getName() {
        return name;
    }

    // Public setter method for name (title)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid book name");
        }
    }

    // Public getter method for author
    public String getAuthor() {
        return author;
    }

    // Public setter method for author
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author name");
        }
    }

    // Public getter method for price
    public double getPrice() {
        return price;
    }

    // Public setter method for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    // Public method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Name: " + name);  // Name represents the title
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Encapsulation class
    public static void main(String[] args) {
        // Creating a new book object
        Encapsulation book = new Encapsulation("978-0134685991", "Effective Java", "Joshua Bloch", 45.0);

        // Displaying book details
        book.displayBookDetails();

        // Accessing and printing the name and author using getters
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author: " + book.getAuthor());

        // Updating the name (title) using setter
        book.setName("Java Concurrency in Practice");
        System.out.println("Updated Book Name: " + book.getName());

        // Updating the author using setter
        book.setAuthor("Brian Goetz");
        System.out.println("Updated Author: " + book.getAuthor());

        // Displaying updated book details
        book.displayBookDetails();
    }
}
