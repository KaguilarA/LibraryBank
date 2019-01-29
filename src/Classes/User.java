package Classes;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;

public class User {
    protected String id, name, surname, secondSurname, username, email, password;
    protected ArrayList<Account> accountList  = new ArrayList<>();

    public User() {
    }

    public User(String id, String name, String surname, String secondSurname, 
            String username, String email, String password) 
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getter

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondSurname() {
        return secondSurname;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    // Setter
 
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    // To String

    @Override
    public String toString() {
        return "{" + "id: " + id + ", name: " + name + ", surname: " + surname 
                + ", secondSurname: " + secondSurname + ", username: "
                + username + ", email: " + email + ", password: " + password + 
                ", accountList: " + accountList + '}';
    }
    
    // Methods
    
    public void addNewAccount(Account newAccount) {
        this.accountList.add(newAccount);
    }
    
    public Boolean validateAccountRepeat(int accountNumber){
        boolean validate = false;
        for(Account account : accountList) {
            if(account.getAccountNumber() == accountNumber) {
                validate = false;
            }
        }
        return validate;
    }
}
