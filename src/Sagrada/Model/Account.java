package Sagrada.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Account extends Database {

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

    public String getPassword() {
        return password;
    }

    public static Account GetAccount(String username){
        try {
            PreparedStatement ps = con.prepareStatement("select * from account where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            rs.next();
            return new Account(rs.getString(1), rs.getString(2));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
