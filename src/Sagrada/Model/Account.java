package Sagrada.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
    //TODO Delete
    //Function for testing purposes will delete later
    public void TestSetUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public static Account getAccount(String username){
        try {
            Statement stmt = null;
         /*   PreparedStatement ps = con.prepareStatement("select * from account where username = 'Emarii'");*/

      /*      ps.setString(1, username);*/
            String ps = "select * from account where username = 'Emarii'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(ps);

            rs.next();
            return new Account(rs.getString(1), rs.getString(2));

        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
