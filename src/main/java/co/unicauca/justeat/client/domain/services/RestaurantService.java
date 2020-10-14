package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IRestaurantAccess;
import co.unicauca.justeat.commons.domain.Restaurant;
import java.util.List;

/**
 *  Es una fachada para comunicar la presentación con el
 * dominio
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 * MUÑOZ.
 */
public class RestaurantService {

    private final IRestaurantAccess service;
    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IRestaurantAcces
     */
    public RestaurantService(IRestaurantAccess service) {
        this.service = service;
    }
     /**
     * Busca un Restaurante en el servidor remoto
     *
     * @param id identificador del restaurante
     * @return Objeto tipo Restaurante, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Restaurant findRestaurant(String id) throws Exception {
        return service.findRestaurant(id);
    }
    /**
     * Crear un obeto restaurante en el servidor remoto
     * @param restaurant el objeto a crear
     * @return un string con el id del objeto creado
     * @throws Exception 
     */
    public String createRestaurant(Restaurant restaurant) throws Exception {
        return service.createRestaurant(restaurant);
    }
    /**
     * Obtiene una lista de restaurantes donde se encuentran todas las listas del servidor
     * @return lista de restauranes 
     * @throws Exception 
     */
    public List<Restaurant> listRestaurant() throws Exception {
        return service.ListRestaurant();
    }
}
