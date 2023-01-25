package model;

public class Admin extends RegisteredUser {
    public Admin(){

    }

    public Admin(String username, String salt, String hashedPassword, String statut)
    {
        super(username, salt, hashedPassword, statut);
    }
}
