/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Bookmaster;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;





/**
 *
 * @author NENCY
 */



@Stateless
public class BookmasterFacade extends AbstractFacade<Bookmaster> {

    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookmasterFacade() {
        super(Bookmaster.class);
    }
    
}
