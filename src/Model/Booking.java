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
public class Booking implements Serializable{
    private int id;
    private int amountClient ;
    private float pricePerTicket ;
    private String note;
    private int idClient;

    public Booking(int id, int amountClient, float pricePerTicket, String note, int idClient) {
        this.id = id;
        this.amountClient = amountClient;
        this.pricePerTicket = pricePerTicket;
        this.note = note;
        this.idClient = idClient;
    }

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public int getAmountClient() {
        return amountClient;
    }

    public float getPricePerTicket() {
        return pricePerTicket;
    }

    public String getNote() {
        return note;
    }

    public int getIdClient() {
        return idClient;
    }
    
}
