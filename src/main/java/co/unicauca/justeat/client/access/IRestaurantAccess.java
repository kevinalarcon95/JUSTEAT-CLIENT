package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.domain.Restaurant;
import java.util.List;

/**
 * Interface que define los servicios de persistencia de Clientes de la agencia.
 *
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 * MUÑOZ
 */
public interface IRestaurantAccess {

    /**
     * Buscar un restaurante utlizando un socket
     *
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public Restaurant findRestaurant(String id) throws Exception;

    /**
     * Crea un Restaurant
     *
     * @param restaurant
     * @return
     * @throws Exception
     */
    public String createRestaurant(Restaurant restaurant) throws Exception;

    /**
     * Retorna una lista con todos los restaurantes registrados previamente.
     *
     * @return List<Restaurant> Lista de restaurantes
     * @throws Exception
     */
    public List<Restaurant> ListRestaurant() throws Exception;
}
