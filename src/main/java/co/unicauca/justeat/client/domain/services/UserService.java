package co.unicauca.justeat.client.domain.services;

import co.unicauca.justeat.client.access.IUserAccess;
import co.unicauca.justeat.commons.domain.User;

/**
 * Es una fachada para comunicar la presentación con el
 * dominio
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 * MUÑOZ.
 */
public class UserService {

    private final IUserAccess service;
      /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IUserAccess
     */
    public UserService(IUserAccess service) {
        this.service = service;
    }
     /**
     * Busca un Usuario en el servidor remoto
     *
     * @param id identificador del Usuario
     * @return Objeto tipo User, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public User findUser(String id) throws Exception {
        return service.findUser(id);
    }
        /**
     * Crear un obeto Usuario en el servidor remoto
     * @param user el objeto a crear
     * @return un string con el id del objeto creado
     * @throws Exception 
     */
    public String createUser(User user) throws Exception {
        return service.createUser(user);
    }
}
