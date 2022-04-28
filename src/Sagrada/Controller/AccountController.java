package Sagrada.Controller;

import Sagrada.Model.Account;

import java.util.Objects;

public class AccountController {

    private Account account;

    public void RegisterAccount(String username, String password) {

    }

    public boolean LoginAccount(String username, String password){
        this.account = Account.GetAccount(username);

        if (Objects.equals(this.account.getPassword(), password)){
            System.out.println("HIJ DOET HET");
            return true;
        }
        else {
            System.out.println("HIJ DOET HET NIET");
            return false;
        }
    }
}
