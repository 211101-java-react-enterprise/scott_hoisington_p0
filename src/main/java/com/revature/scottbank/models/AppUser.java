package com.revature.scottbank.models;

import java.util.Objects;

public class AppUser extends Object {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String acctNum;

    public AppUser(String firstName, String lastName, String email,
                   String password) {
        this.id = "";
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.acctNum = "";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAcctNum() { return acctNum; }
    public void setAcctNum(String acctNum) { this.acctNum = acctNum; }

}
