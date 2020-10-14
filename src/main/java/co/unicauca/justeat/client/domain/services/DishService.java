/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IDishAccess;
import co.unicauca.justeat.client.access.IRestaurantAccess;
import co.unicauca.justeat.commons.domain.Dish;
import co.unicauca.justeat.commons.domain.Restaurant;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class DishService {
        private final IDishAccess service;
    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IRestaurantAcces
     */
    public DishService(IDishAccess service) {
        this.service = service;
    }
     /**
     * Busca un plato en el servidor remoto
     *
     * @param id identificador del restaurante
     * @return Objeto tipo plato, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Dish findDish(String id) throws Exception {
        return service.findDish(id);
    }
    /**
     * Crear un obeto plato en el servidor remoto
     * @param dish el objeto a crear
     * @return un string con el id del objeto creado
     * @throws Exception 
     */
    public String createDish(Dish dish) throws Exception {
        return service.createDish(dish);
    }
}
