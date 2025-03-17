import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC{
    public static void main(String args[]){
        //Data base credentials
        String url="jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="zeba123";

        Connection con=null;
        Statement st=null;

        try{
            //1.Register JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.Open conenction
            System.out.println("Connection to database");
            con= DriverManager.getConnection(url,username,password);
            //3.Execute a query
            System.out.println("Creating a statement");
            st=con.createStatement();
            String sql="SELECT id,name,email FROM users";
            ResultSet rs=st.executeQuery(sql);
            //4.Extract data from result set
            while (rs.next()){
                //Retrive by colname
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");

                //Display values
                System.out.print("ID:"+id);
                System.out.print(", Name:"+name);
                System.out.print(", Email:"+email);
            }
            //cleanup env
            rs.close();
            st.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}