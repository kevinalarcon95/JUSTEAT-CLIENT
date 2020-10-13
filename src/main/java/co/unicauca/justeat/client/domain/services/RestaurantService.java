package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IRestaurantAccess;
import co.unicauca.justeat.commons.domain.Restaurant;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ.
 */

public class RestaurantService {
    
    private final IRestaurantAccess service;

    public RestaurantService(IRestaurantAccess service) {
        this.service = service;
    }
    
   public Restaurant  findRestaurant(String id) throws Exception{
       return service.findRestaurant(id);
   }
   
   public String createRestaurant(Restaurant restaurant) throws Exception{
       return service.createRestaurant(restaurant);
   }
   
   public List<Restaurant> listRestaurant() throws Exception{
   return service.ListRestaurant();
   }
}
