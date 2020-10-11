package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IUserAccess;
import co.unicauca.justeat.commons.domain.User;

/**
 *
 * @author Kevin Alarcón
 */
public class UserService {
    /**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ.
 */

public class RestaurantService {
    
    private final  IUserAccess service;

    public RestaurantService(IUserAccess service) {
        this.service = service;
    }
    
   public User  findRestaurant(String id) throws Exception{
       return service.findUser(id);
   }
   
   public String createRestaurant(User user) throws Exception{
       return service.createUser(user);
   }
}

}
