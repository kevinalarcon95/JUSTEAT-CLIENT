package co.unicauca.justeat.client.access;

import co.unicauca.justeat.commons.domain.User;

/**
 * Interface que define los servicios de persistencia de Usuarios de la app
 *
 * @author SANTIAGO MUÑOZ
 */
public interface IUserAccess {

    /**
     * Buscar un Usuario utlizando un socket
     *
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public User findUser(String id) throws Exception;

    /**
     * Crea un Usario
     *
     * @param user
     * @return
     * @throws Exception
     */
    public String createUser(User user) throws Exception;
}
