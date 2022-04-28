package Sagrada.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    protected static Connection con;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021_sagrada","root","root");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void CloseConnection() {
        try {
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
