/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin88
 */
public class Ticket implements Serializable{
    private int id;
    private float totalPrice;
    private Date dayPayment;
    private String typePayment;
    private String amountPayment;
    private String note;
    
    private int idUser;

    public Ticket() {
    }

    public Ticket(int id, float totalPrice, Date dayPayment, String typePayment, String amountPayment, String note, int idUser) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.dayPayment = dayPayment;
        this.typePayment = typePayment;
        this.amountPayment = amountPayment;
        this.note = note;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Date getDayPayment() {
        return dayPayment;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public String getAmountPayment() {
        return amountPayment;
    }

    public String getNote() {
        return note;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

  
    
}
