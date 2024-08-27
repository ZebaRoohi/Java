//For loop
/*public class Loops {
    public static  void main(String args[]){
        for(int i=0;i<=10;i++){
            System.out.println("Number"+i);
        }
    }
}*/

//Nested Forloop
/*public class Loops{
    public static  void main(String args[]){
        for(int i=0;i<=3;i++){
            System.out.println("Outer loop"+i);
            for(int j=0;j<=2;j++){
                System.out.println("Inner loop"+j);
            }
        }
    }
}*/

//For each loop
/*public class Loops{
    public static  void main(String args[]){
        int arr[]={1,2,3,4,5};
        int total=0;
                for(int i:arr){
                   // System.out.println("For each loop" +i);
                    total+=i;
                }
        System.out.println("Sum is" +total);
    }
}*/

//max num with foreach
/*class Loops {
    public static void main(String[] arg) {
        {
            int[] marks = {125, 132, 95, 116, 110};

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }

    public static int maximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;

    }
}*/

//min num with foreach
/*class Loops{
    public static void main(String args[]){
        int[] marks = {125, 132, 95, 116, 110};
        int min_marks=minimum(marks);
        System.out.println("Minimum marks is" +min_marks);
    }
    public static  int minimum(int[]numbers){
        int min=numbers[0];
                for(int num:numbers){
                    if(num<min){
                        min=num;
                    }
                }
                return  min;
    }
} */

public class Loops{
    public static  void main(String args[]){
        String str[]={"red","blue","green"};
        for(String colors:str){
            System.out.println("Colors are" +colors);
        }
    }
}