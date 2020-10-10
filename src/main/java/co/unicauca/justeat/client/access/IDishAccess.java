/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.domain.Dish;



/**
 *
 * @author SANTIAGO MUÑOZ
 */
public interface IDishAccess {
     /**
     * Buscar un Plato utlizando un socket
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception 
     */
    public Dish findDish(String id) throws Exception;
    
    /**
     * Crea un Plato
     * @param dish 
     * @return
     * @throws Exception 
     */
    
    public String createDish(Dish dish) throws Exception;
}
