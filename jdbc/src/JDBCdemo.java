

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
    public static void main(String[] args) {
         //driver load
        try{
            String url = "jdbc:mysql://localhost:3306/bank_db";
            String userName = "root";
            String password = "8965";
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement stm = conn.createStatement();
            System.out.println("Connected Successfully");
            String query = "create database db;";
            stm.execute(query);

            System.out.println("Database created");
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        
         //conn establish
         //statement create
         //execute
         //conn close
        
    }
}
