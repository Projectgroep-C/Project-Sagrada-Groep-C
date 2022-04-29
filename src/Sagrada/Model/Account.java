package Sagrada.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Account {

    private String username;
    private String password;

    public Account() {}

    Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    //TODO Delete
    //Function for testing purposes will delete later
    public void TestSetUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public static Account GetAccount(String username){
        try {
            Connection con = Database.CreateConnection();
            PreparedStatement ps = con.prepareStatement("select * from account where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            rs.next();
            con.close();
            return new Account(rs.getString(1), rs.getString(2));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
