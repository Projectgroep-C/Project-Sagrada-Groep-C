package Sagrada.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public Database() {

    }

    public static Connection CreateConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/2021_sagrada","root","root");
        }
        catch(Exception e){
            System.out.println(e);
        }

        return null;
    }

}
