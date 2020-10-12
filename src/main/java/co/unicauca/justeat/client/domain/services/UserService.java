package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IUserAccess;
import co.unicauca.justeat.commons.domain.User;



 /**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ.
 */

public class UserService {
    
    private final  IUserAccess service;

    public UserService(IUserAccess service) {
        this.service = service;
    }
    
   public User  findUser(String id) throws Exception{
       return service.findUser(id);
   }
   
   public String createUser(User user) throws Exception{
       return service.createUser(user);
   }
}


