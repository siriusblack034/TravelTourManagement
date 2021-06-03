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
public class Tour implements Serializable{
    private int id ;
    private String whereStart;
    private String description;
    private Date dateStart;
    private int idBooking ;
    
    public Tour(int id, String whereStart, String description, Date dateStart,int idBooking) {
        this.id = id;
        this.whereStart = whereStart;
        this.description = description;
        this.dateStart = dateStart;
        this.idBooking = idBooking;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public Tour() {
    }

    public int getId() {
        return id;
    }

    public String getWhereStart() {
        return whereStart;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateStart() {
        return dateStart;
    }
    
}
