/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlphaDevs.Comercial.OnaEkak.SessionBeans;

import com.AlphaDevs.Comercial.OnaEkak.Entities.Vehicle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MKarunarathne
 */
@Stateless
public class VehicleFacade extends AbstractFacade<Vehicle> {
    @PersistenceContext(unitName = "OnaEkakPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehicleFacade() {
        super(Vehicle.class);
    }
    
}
