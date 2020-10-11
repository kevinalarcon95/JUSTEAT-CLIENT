package co.unicauca.justeat.client.access;

import co.unicauca.justeat.client.infra.RestaurantSocket;
import co.unicauca.justeat.commons.domain.Restaurant;
import co.unicauca.justeat.commons.infra.JsonError;
import co.unicauca.justeat.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SANTIAGO MUÑOZ KEVIN ALARCON JUAN JOSE LOPEZ SANTIAGO CORDOBA DANIEL
 * MUÑOZ
 */
public class RestaurantAccessImplSockets implements IRestaurantAccess {

    private RestaurantSocket mySocket;

    public RestaurantAccessImplSockets() {
        mySocket = new RestaurantSocket();
    }

    @Override
    public Restaurant findRestaurant(String id) throws Exception {
        String jsonResponse = null;
        String requestJson = findRestaurantRequestJson(id);

        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor este escuchando");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvio algun error
                Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontro el Restaurant
                Restaurant restaurant = jsonToRestaurant(jsonResponse);
                return restaurant;
            }
        }
    }

    @Override
    public String createRestaurant(Restaurant restaurant) throws Exception {
        String jsonResponse = null;
        String requestJson = createRestaurantRequestJson(restaurant);
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
                return restaurant.getResId() + "";
            }

        }

    }

    private String findRestaurantRequestJson(String idRestaurant) {

        Protocol protocol = new Protocol();
        protocol.setResource("restaurant");
        protocol.setAction("get");
        protocol.addParameter("id", idRestaurant);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;

    }

    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }

    /**
     * Convierte el jsonError a un array de objetos jsonError
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
     * Convierte jsonRestaurant, proveniente del server socket, de json a un
     * objeto Restaurant
     *
     * @param jsonCustomer objeto cliente en formato json
     */
    private Restaurant jsonToRestaurant(String jsonRestaurant) {

        Gson gson = new Gson();
        Restaurant restaurant = gson.fromJson(jsonRestaurant, Restaurant.class);

        return restaurant;

    }

    /**
     * Crea la solicitud json de creación del customer para ser enviado por el
     * socket
     *
     * @param customer objeto customer
     * @return devulve algo como:
     * {"resource":"customer","action":"post","parameters":[{"name":"id","value":"980000012"},{"name":"fistName","value":"Juan"},...}]}
     */
    private String createRestaurantRequestJson(Restaurant restaurant) {

        Protocol protocol = new Protocol();
        protocol.setResource("Restaurante");
        protocol.setAction("post");
        protocol.addParameter("RestId", restaurant.getResId());
        protocol.addParameter("`UserName", restaurant.getUserName());
        protocol.addParameter("RestNombre", restaurant.getResNom());
        protocol.addParameter("RestDireccion", restaurant.getResDireccion());
        protocol.addParameter("RestCiudad", restaurant.getResCiudad());
        protocol.addParameter("RestTematicaComida", restaurant.getResTematicaComida());

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

}
