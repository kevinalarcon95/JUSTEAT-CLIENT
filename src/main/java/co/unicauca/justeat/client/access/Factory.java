package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.infra.Utilities;



/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */

public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }
    public IRestaurantAccess getsRestaurantSerive(){
        IRestaurantAccess result =null;
        String type =Utilities.loadProperty("restaurant.service");
          switch (type) {
            case "default":
                result = new RestaurantAccessImplSockets();
                break;
        }

        return result;
    }
    /**
     * Método que crea una instancia concreta de la jerarquia IRestaurantService
     *
     * @return una clase hija de la abstracción IRepositorioRestaurantes
     */
    public IRestaurantAccess getRestaurantService() {

        IRestaurantAccess result = null;
        String type = Utilities.loadProperty("restaurant.service");

        switch (type) {
            case "default":
                result = new RestaurantAccessImplSockets();
                break;
        }

        return result;
    }
    
     /**
     * Método que crea una instancia concreta de la jerarquia IDishAccess
     *
     * @return una clase hija de la abstracción IRepositorioDish
     */
    public IDishAccess getDishService(){
        IDishAccess result= null;
        String type= Utilities.loadProperty("restaurant.service");
        
        switch(type){
            case "default":
                result= new DishAccessImplSockets();
                break;
        }
        return result;
    }
    
    /**
     * Método que crea una instancia concreta de la jerarquia IUserAccess
     *
     * @return una clase hija de la abstracción IRepositorioUser
     */
    public IUserAccess getUserService(){
        IUserAccess result = null;
        String type = Utilities.loadProperty("restaurant.service");
        
        switch(type){
            case "default":
            result = new UserAccessImplSockets();
            break;
        }
        return result;
    }
}
