package co.unicauca.justeat.client.access;

import co.unicauca.justeat.client.infra.DishSocket;
import co.unicauca.justeat.commons.domain.Dish;
import co.unicauca.justeat.commons.infra.JsonError;
import co.unicauca.justeat.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servicio de Plato. Permite hacer el CRUD de Platos solicitando los servicios.
 * con la aplicación server. Maneja los errores devueltos.
 *
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 * MUÑOZ
 */
public class DishAccessImplSockets implements IDishAccess {

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private DishSocket mySocket;

    public DishAccessImplSockets() {
        mySocket = new DishSocket();
    }

    /**
     * Busca un Plato Utiliza socket para pedir el servicio al servidor.
     *
     * @param id PlatoId
     * @return Objeto Dish
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Dish findDish(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un Plato Utiliza socket para pedir el servicio al servidor.
     *
     * @param dish cliente de la agencia de viajes
     * @return devuelve la el platoID del cliente creado
     * @throws Exception error crear el plato
     */
    @Override
    public String createDish(Dish dish) throws Exception {
        String jsonResponse = null;
        String requestJson = CreteDishRequestJson(dish);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve el id del restaurante 
                return dish.getPlatoId();
            }

        }
    }

    /**
     * Extra los mensajes de la lista de errores.
     *
     * @param jsonResponse lista de mensajes json
     * @return Mensajes de error
     */
    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }

    /**
     * Convierte el jsonError a un array de objetos jsonError.
     *
     * @param jsonError
     * @return objeto MyError
     */
    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }

    /**
     * Crea la solicitud json de creación del customer para ser enviado por el.
     * socket.
     *
     * @param dish objeto customer
     * @return devulve algo como:
     * {"resource":"Dish","action":"post","parameters":[{"name":"PlatoId","value":"980000012"},{"name":"PlatNombre","value":"Arroz"},...}]}
     */
    private String CreteDishRequestJson(Dish dish) {
        Protocol protocol = new Protocol();
        protocol.setResource("Dish");
        protocol.setAction("post");
        protocol.addParameter("PlatoId", dish.getPlatoId());
        protocol.addParameter("PlatNombre", dish.getPlanNom());
        protocol.addParameter("PlatDescripcion", dish.getPlacDesc());
        protocol.addParameter("PlatPrecion", dish.getPlaPrecio() +"");
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("Json" + requestJson);

        return requestJson;
    }

    /**
     * Convierte jsonCustomer, proveniente del server socket, de json a un
     * objeto dish
     *
     * @param jsonCustomer
     * @return dish
     */
    private Dish jsonToCustDish(String jsonCustomer) {
        Gson gson = new Gson();
        Dish dish = gson.fromJson(jsonCustomer, Dish.class);
        return dish;
    }

}
