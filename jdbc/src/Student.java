
import java.io.IOError;
import java.lang.classfile.attribute.StackMapFrameInfo;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

    public void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/bank_db";
            String userName = "root";
            String password = "8965";
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();
            System.out.println("Connected Successfully");
            String query = "create database db;";
            stm.execute(query);

            System.out.println("Database created");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // conn establish
        // statement create
        // execute
        // conn close

    }

    public void createTable() throws Exception {
        String url = "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "8965";
        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement stm = conn.createStatement();
        System.out.println("Connected Successfully");
        String query = "CREATE TABLE student ("
                + "sid INT PRIMARY KEY, "
                + "sname VARCHAR(100) NOT NULL, "
                + "semail VARCHAR(100)"
                + ");";
        stm.execute(query);

        System.out.println("Table created");
        conn.close();
    }

    public void insertData() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "8965";
        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement stm = conn.createStatement();
        System.out.println("Connection Successful");
        String query = "insert into student(sid,sname) values"
        + "(1,'Aman'),"
        + "(2,'Karan'),"
        + "(3, 'John');";
        stm.execute(query);
        System.out.println("Value inserted");
        conn.close();
    }

    public void deleteData() throws SQLException{
        String url= "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "8965";
        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement stm = conn.createStatement();
        System.out.println("Connection Successfull");
        String query = "delete from student where sid=3;";
        stm.execute(query);
        System.out.println("Value deleted");
        conn.close();
    }
    public void updateData() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "8965";
        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement stm = conn.createStatement();
        System.out.println("Connection Successful");
        String query = "UPDATE student SET sname='John Doe', semail='john.doe@example.com' WHERE sid=2;";
        stm.execute(query);
        System.out.println("Value updated");
        conn.close();
    }
    public void readData() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "8965";
        Connection conn = DriverManager.getConnection(url, userName, password);
        String query = "Select * from student;";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()) {
            System.out.println("id:"+rs.getInt(1));
            System.out.println("name:"+rs.getString(2));
            System.out.println("email:"+rs.getString(3));
        }
    }
}
