//Array Methods
//The arrays class is part of the Java collection framework in the java.utilpackage. It only consists ofstaticmethods
// and methods of theobject` class. Using Arrays, we can create,compare, sort, search, stream, and transform arrays.
// We can easily access the methods of this class by their class name.java.util.Arrays is a class that belongs to the java.util package.

import java.util.Arrays;
public class ArrayMethods {
    public  static void  main(String args[]){
        int[] numbers={5,3,8,1,9,2};

        //toString
        System.out.println("Original Arrays:"+ Arrays.toString(numbers));

        //sort
        Arrays.sort(numbers);
        System.out.println("Sorted Arrays:"+ Arrays.toString(numbers));

        //array fill
        int[] filledArray=new int[5];
        Arrays.fill(filledArray,7);
        System.out.println("Array filled with 7s:"+ Arrays.toString(filledArray));

        //copyOf
        int[] copiedArray= Arrays.copyOf(numbers,numbers.length);
        System.out.println("Copied Array:"+ Arrays.toString(copiedArray));

        //binearySearch
        int index= Arrays.binarySearch(numbers,8);
        System.out.println("Index of element 8:"+index);

        //equals
        boolean arrayEq= Arrays.equals(numbers,copiedArray);
        System.out.println("Are the sorted and copied arrays equal:"+arrayEq);

        //asList
        String[] names={"Alice","Bob","Charlie"};
        System.out.println("List of Names:"+ Arrays.asList(names));
    }
}
