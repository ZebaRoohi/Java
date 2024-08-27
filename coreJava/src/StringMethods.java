//String methods
public class StringMethods {
    public static  void main(String args[]){
        String str="Hello,World";

        //length
        int length=str.length();
        System.out.println("Length of string:"+length);

        //charAt
        char ch=str.charAt(2);
        System.out.println("Charcter at index 2:"+ch);

        //substring
        String sub_string=str.substring(7);
        System.out.println("Substring from index 7:"+sub_string);

        //substring b/w 2 & 5.
        String sub_bt=str.substring(2,5);
        System.out.println("Substring from index 2 to 5:"+sub_bt);

        //uppercase
        String uppcase=str.toUpperCase();
        System.out.println("Uppercase string:"+uppcase);

        //lowercase
        String lowcase=str.toLowerCase();
        System.out.println("Lowercase string:"+lowcase);

        //replace
        String replaceStr=str.replace("World","Java");
        System.out.println("String after replacement:"+replaceStr);

        //contains
        boolean containHello=str.contains("Hello");
        System.out.println("Does string contains Hello:"+containHello);

        //indexOf
        int index=str.indexOf(',');
        System.out.println("Index of comma:"+index);

        //trim
        String trimStr="       Hello,World   " .trim();
        System.out.println("Trimmed string:"+trimStr+"'");


    }
}
