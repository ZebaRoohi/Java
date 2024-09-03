
import java.util.*;


//ArrayList - A Resizable Array
/*public class CollectionFrameWork {
    public static void main(String args[]){
        ArrayList<String> fruits=new ArrayList<>();
        //adding ele
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple"); //duplication is allowed

        //access ele
        System.out.println("Element at index 1:"+fruits.get(1));

        //modifying ele
        fruits.set(2,"Mango"); //replace orange to mango
        System.out.println("Updated ArrayList:"+fruits);

        //sorting
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList:"+fruits);

        //removing ele
        fruits.remove("Apple");
        System.out.println("Arraylist after removal:"+fruits);
    }
}*/

//HashSet - A Collection of Unique Elements
/*public class CollectionFrameWork{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Banglore");
        cities.add("Chennai");
        cities.add("Banglore");//duplication is not allowed
        System.out.println("Hashset:"+cities);

        //checking elem exists
        if(cities.contains("Hyderabad")){
            System.out.println("Hyderabad is in sourth");
        }
        cities.remove("Chennai");
        System.out.println("After removal:"+cities);
    }
}*/

//HashMap - A Collection of Key-Value Pairs, It does not allow duplicate keys but allows duplicate values.
/*public class CollectionFrameWork{
    public static void main(String args[]){
        HashMap<Integer,String> students=new HashMap<>();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"Jerry");
        //stundets.put(101,"Tom"); //overwrites value of key 101
        System.out.println("Hashmap:"+students);

        //Accessing values by key
        String name=students.get(102);
        System.out.println("Student with id 102:"+name);

        students.remove(103);
        System.out.println("Hashmap after removal:"+students);

        //iterate over hashmap
        for(Map.Entry<Integer,String>entry:students.entrySet()){
            System.out.println("Id:"+entry.getKey()+"Name:"+entry.getValue());
        }
    }
}*/

//TreeSet is another implementation of the Set interface, which maintains its elements in a sorted order.
// It uses a Red-Black tree data structure internally.
public class CollectionFrameWork{
    public static void main(String args[]){
        TreeSet<String> countries=new TreeSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("Australia");//duplicate is not added

        System.out.println("Treeset:"+countries);

        //checking first and last ele
        System.out.println("First:"+countries.first());
        System.out.println("Last:"+countries.last());
    }
}