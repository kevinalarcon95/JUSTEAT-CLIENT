package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.domain.Restaurant;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */

public interface IRestaurantAccess {
    
    /**
     * Buscar un restaurante utlizando un socket
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception 
     */
    public Restaurant findRestaurant(String id) throws Exception;
    
    /**
     * Crea un Restaurant
     * @param restaurant 
     * @return
     * @throws Exception 
     */
    
    public String createRestaurant(Restaurant restaurant) throws Exception;
    
    public List<Restaurant> ListRestaurant() throws Exception;
}
