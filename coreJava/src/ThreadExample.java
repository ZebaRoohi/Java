//There are two ways to create a thread:
//1.By extending Thread class
//2.By implementing Runnable interface.
//Thread class:
//Thread class provide constructors and
// methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.
//thread and runnable class will have single run method.if u add more it creates ambiguity with jvm start
//https://www.javatpoint.com/how-to-create-a-thread-in-java


/*class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}*/

//Implementing runnbale interface
/*class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable thread is running");
    }
}
public class ThreadExample{
    public static void main(String args[]){
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();

    }
}*/

//MultiThread
//Multithreading in Java is an act of executing a complex process using virtual processing entities independent of each other.
// These entities are called threads. Threads in Java are virtual and sharethe same memory location of the process.
// As the threads are virtual, they exhibit a safer way of executing a process.
class MyThread1 implements Runnable{ @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread1 ");

            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Error"+e);
            }
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread2 ");

            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Error"+e);
            }
        }
    }
}
public class ThreadExample{
    public static void main(String args[]){
        Runnable obj1=new MyThread1();
        Runnable obj2=new MyThread2();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}

