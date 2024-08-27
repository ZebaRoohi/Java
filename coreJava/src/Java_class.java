/*class Computer{
    public void playMusic(){
        System.out.println("Music is playing");
    }
    public String getMepen(int cost){
        return "Pen";
    }
}


public class Java_class {
    public static void main(String a[]){
        Computer obj=new Computer();
        obj.playMusic();
        //obj.getMepen(10);
        String str=obj.getMepen(10);
        System.out.println(str);

    }
}*/

import org.w3c.dom.ls.LSOutput;

class Calculator{
    public int add(int n1,int n2){
        return  n1+n2;
    }
}
public  class Java_class {
    public static void main(String a[]) {
        Calculator obj = new Calculator();
        int r1 = obj.add(5, 7);
        System.out.println(r1);
    }
}