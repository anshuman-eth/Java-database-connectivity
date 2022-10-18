import java.sql.*;
public class test {
    public static void main(String[] args) {
        Class.forName("com.mysql.jdbc.Driver");

            mysql = new MySQL("localhost", 3306, "test", "root", "");
            MySQL.connect();
    }
}
