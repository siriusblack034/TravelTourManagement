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
public class PenaltyBill  implements Serializable {
    private Date dateCancelDate;
    private int percentPenalty;
    private int idTicket;
   
    public PenaltyBill(Date dateCancelDate, int percentPenalty, int idTicket) {
        this.dateCancelDate = dateCancelDate;
        this.percentPenalty = percentPenalty;
        this.idTicket = idTicket;
    }

    public PenaltyBill() {
    }

    public Date getDateCancelDate() {
        return dateCancelDate;
    }

    public int getPercentPenalty() {
        return percentPenalty;
    }

    public int getIdTicket() {
        return idTicket;
    }
    
    
}
