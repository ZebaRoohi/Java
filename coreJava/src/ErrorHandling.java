//https://www.geeksforgeeks.org/exceptions-in-java/
//https://www.javatpoint.com/exception-handling-in-java
//Exception handling is used to handle runtime errors. It helps to maintain the normal flow of the program.

/*public class ErrorHandling {
    public static void main(String args[]){
        try{
            int result=100/0;
        }catch (ArithmeticException  e){
            System.out.println("Error:Division by zero is not allowed");
        }
    }
}
*/

//Multiple catch excpetion
public class ErrorHandling{
    public static void main(String args[]){
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[5]);
        }catch (ArithmeticException e){
            System.out.println("Arithematic error:"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array error:"+e.getMessage());
        }catch(Exception e){
            System.out.println("General error:"+e.getMessage());
        }finally {
            System.out.println("This block will always execute, regardless of an exception.");
        }
    }
}
