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
    private String nameTour;
    private String whereStart;
    private String description;
    private String arrival ;
    private Date dateStart;

    public Tour() {
    }

    public Tour(int id, String nameTour, String whereStart, String description, String arrival, Date dateStart) {
        this.id = id;
        this.nameTour = nameTour;
        this.whereStart = whereStart;
        this.description = description;
        this.arrival = arrival;
        this.dateStart = dateStart;
    }

    public int getId() {
        return id;
    }

    public String getNameTour() {
        return nameTour;
    }

    public String getWhereStart() {
        return whereStart;
    }

    public String getDescription() {
        return description;
    }

    public String getArrival() {
        return arrival;
    }

    public Date getDateStart() {
        return dateStart;
    }
    
    
    
}
