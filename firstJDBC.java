import java.sql.*;

public class firstJDBC{
    public static void main(String[] args) {
        try {
            
            //load the driver
            // Class.forName("com.mysql.cj.jdbc.Driver");
    
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url="jdbc:mysql://localhost:3306/student";
            String username="root";
            String password="007619432Aa@";
            Connection con= DriverManager.getConnection(url, username, password);
            System.out.println("HI");
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }       
            else{
                System.out.println("Connection is created.....");
            }

        } 
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}