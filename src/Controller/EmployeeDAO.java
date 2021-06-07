/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;

/**
 *
 * @author Admin88
 */
public class EmployeeDAO {
    private User user;
    public EmployeeDAO() {
    }

    public EmployeeDAO(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    
}
