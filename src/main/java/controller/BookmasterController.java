/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import model.BookmasterFacade;

/**
 *
 * @author NENCY
 */
@Named(value = "bookmasterController")
@Dependent
public class BookmasterController {

    @EJB
    private BookmasterFacade bookmasterFacade;

    /**
     * Creates a new instance of BookmasterController
     */
    
    public BookmasterController() {
    }
    
}
