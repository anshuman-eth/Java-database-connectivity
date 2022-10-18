import java.sql.*;



public class insertJDBC {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Creating a conection
            
            String url="jdbc:mysql://localhost:3306/student";
            String username="root";
            String password="007619432Aa@";
            Connection con=DriverManager.getConnection(url, username, password);

            //create a query
            String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // create a statement
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in database...");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
    }    
}
