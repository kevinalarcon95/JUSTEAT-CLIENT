package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.domain.Dish;

/**
 * Interface que define los servicios de persistencia de plato de la app
 *
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 */
public interface IDishAccess {

    /**
     * Buscar un Plato utlizando un socket
     *
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public Dish findDish(String id) throws Exception;

    /**
     * Crea un Plato
     *
     * @param dish
     * @return
     * @throws Exception
     */
    public String createDish(Dish dish) throws Exception;
}
