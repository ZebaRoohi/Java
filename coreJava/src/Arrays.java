//Java array is an object which contains elements of a similar data type.
// Additionally,The elements of an array are stored in a contiguous memory location.
// It is a data structure where we store similar elements.

/*public class Arrays {
    public static  void main(String args[]){
        int arr[]=new int[4];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=6;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}*/

/*public class Arrays{
    public static  void main(String args[]){
        String cars[]={"bmw","toyota","ford"};
        cars[0]="tata";
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}*/

//Mutli dimesional array
/*public class Arrays{
    public static  void main(String args[]){
        int a[][]={{1,2,3},{3,4,5},{5,6,7}};
        for(int i=0;i<3;i++){ //rows
            for(int j=0;j<3;j++){ //cols
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}*/

//jagged array:A jagged array is an array of arrays such that member arrays can be of
// different sizes,i.e., we can create a 2-D array but with a variable number of columns
// in each row.
public class Arrays {
    public static void main(String args[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[]{1, 2, 3};        // First row with 3 elements
        arr[1] = new int[]{4, 5};           // Second row with 2 elements
        arr[2] = new int[]{6, 7, 8, 9, 10}; // Third row with 5 elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Use arr[i].length for the inner loop
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
