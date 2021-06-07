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
public class Client implements Serializable{
    private int id ;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String typeID;

    public Client() {
    }

    public Client(int id, String name, String phoneNumber, String email, String address, String typeID) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.typeID = typeID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getTypeID() {
        return typeID;
    }
    
   
}
