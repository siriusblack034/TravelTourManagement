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
    private int idTour;
    private int idClient;

    public Booking(int id, int amountClient, float pricePerTicket, int idTour, int idClient) {
        this.id = id;
        this.amountClient = amountClient;
        this.pricePerTicket = pricePerTicket;
        this.idTour = idTour;
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

    public int getIdTour() {
        return idTour;
    }

    public int getIdClient() {
        return idClient;
    }

   
}
