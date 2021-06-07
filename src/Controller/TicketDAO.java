/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
        String QUERY = "SELECT ticket.id, user.name, booking.amountClient, booking.priceTicket, client.nameClient,tbltour.nameTour,tbltour.whereStart,tbltour.arrival, tbltour.dateStart  "
                + "FROM ticket,    user,    booking,    tblTour,    client "
                + "WHERE    ticket.id = "+id +" AND "
                + "ticket.idUser = user.id AND "
                + "ticket.idBooking = booking.id AND "
                + "booking.idTour = tblTour.id AND "
                + "booking.idClient = client.id ";
        
        ResultSet kq = stt.executeQuery(QUERY);
           
    }
}
