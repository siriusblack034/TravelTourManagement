/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewForEmployee.InformTicketFrm;
import View.ViewForEmployee.PenaltyTicketFrm;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;

import java.time.LocalDate;

import java.util.Date;


/**
 *
 * @author Admin88
 */
public class TicketDAO {
    
    public TicketDAO() {
    }
    public void SearchTicket(int id) throws SQLException {
        
        ConnectDB connect = new ConnectDB();
        Statement stt = connect.getState();
        String QUERY = "SELECT ticket.id, user.name, booking.amountClient, booking.priceTicket, client.nameClient,tbltour.nameTour,tbltour.whereStart,tbltour.arrival, tbltour.dateStart, ticket.paymentDate, ticket.totalPrice  "
                + "FROM ticket,    user,    booking,    tblTour,    client "
                + "WHERE    ticket.id = "+id +" AND "
                + "ticket.idUser = user.id AND "
                + "ticket.idBooking = booking.id AND "
                + "booking.idTour = tblTour.id AND "
                + "booking.idClient = client.id ";
        
        ResultSet kq = stt.executeQuery(QUERY);
        while(kq.next()){
            int idTicket = kq.getInt("id");
            String nameClient = kq.getString("nameClient");
            String nameTour = kq.getString("nameTour");
            Date date = kq.getDate("paymentDate");
            float totalPrice = kq.getFloat("totalPrice");
            InformTicketFrm TicketFrm = new InformTicketFrm(idTicket,nameClient,nameTour,date, totalPrice);
        }
           
    }

    public void CancelTicket(int idTicket, String nameClient, String nameTour, Date date, float totalPrice) {
          LocalDate currentDate = LocalDate.now();
          LocalDate bookingDate =  LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(date) );
          int day1= currentDate.getDayOfYear();
          int day2 = bookingDate.getDayOfYear();
          int daysBetween = day1 - day2;
          int percentPenalty =0;
          if(daysBetween<0){
              percentPenalty = 100;
          }
          if(daysBetween >7){
              percentPenalty = 10;
          } else if(daysBetween <=7 && daysBetween >5){
              percentPenalty = 20;
          }else if(daysBetween<= 5 && daysBetween >3){
              percentPenalty = 30;
          }else {
              percentPenalty = 50;
          }
          totalPrice -= totalPrice*percentPenalty;
          
          ConnectDB connect = new ConnectDB();
         Statement stt = connect.getState();
         
    }
    
}
