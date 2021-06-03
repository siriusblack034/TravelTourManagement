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
public class PenaltyBill implements Serializable{
    private Date dateCancelDate;
    private int percentPenalty;

    public PenaltyBill() {
    }
     public PenaltyBill(PenaltyBill bill) {
         this.dateCancelDate = bill.dateCancelDate;
         this.percentPenalty = bill.percentPenalty;
    }

    public PenaltyBill(Date dateCancelDate, int percentPenalty) {
        this.dateCancelDate = dateCancelDate;
        this.percentPenalty = percentPenalty;
    }
    
    public Date getDateCancelDate() {
        return dateCancelDate;
    }

    public int getPercentPenalty() {
        return percentPenalty;
    }
    
}
