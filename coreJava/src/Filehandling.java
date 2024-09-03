//create file
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*public class Filehandling {
    public static void main(String args[]){
        try{
            File obj=new File("myfile.txt");
            if(obj.createNewFile()){
                System.out.println("File created:"+obj.getName());
            }else{
                System.out.println("File already exists");
            }

        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}*/

//Read from file
/*public class Filehandling {
    public static void main(String args[]) {
        try {
            File obj = new File("myfile.txt");
            Scanner Reader = new Scanner(obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}*/
//Write file
/*public class Filehandling{
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("myfile.txt");
            fw.write("This is java file");
            fw.close();
            System.out.println("Successfully written");
        }catch (IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}*/

//Delete file
public class Filehandling{
    public static void main(String args[]){
        File obj=new File("myfile.txt");
        if(obj.delete()){
            System.out.println("File is deleted:"+obj.getName());
        }else{
            System.out.println("Error in deleting file");
        }
    }
}