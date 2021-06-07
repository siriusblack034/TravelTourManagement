/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin88
 */
public class User implements Serializable{
    private int id ;
    private String name ;
    private String position;
    private String phoneNumber;
    private String account;
    private String password;
    public User() {
    }

    public User(int id, String name, String position, String phoneNumber, String account, String password) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

   
    
}
