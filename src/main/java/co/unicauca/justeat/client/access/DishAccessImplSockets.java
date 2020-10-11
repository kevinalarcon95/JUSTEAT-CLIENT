/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.client.access;

import co.unicauca.justeat.client.infra.RestaurantSocket;
import co.unicauca.justeat.commons.domain.Dish;
import co.unicauca.justeat.commons.infra.JsonError;
import co.unicauca.justeat.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class DishAccessImplSockets implements  IDishAccess{
    private RestaurantSocket mySocket;

    @Override
    public Dish findDish(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createDish(Dish dish) throws Exception {
       String jsonResponse=null;
       String requestJson = CreteDishRequestJson(dish);
        try {
            mySocket.connect();
            jsonResponse= mySocket.sendStream(requestJson);
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
                return dish.getPlatoId() + "";
            }

        }
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
    private String CreteDishRequestJson(Dish dish){
        Protocol protocol =new Protocol();
        protocol.setResource("Dish");
        protocol.setAction("post");
        protocol.addParameter("PlatoId", dish.getPlatoId());
        protocol.addParameter("PlatNombre", dish.getPlanNom());
        protocol.addParameter("PlatDescripcion", dish.getPlacDesc());
        protocol.addParameter("PlatPrecion", dish.getPlaPrecio()+"");
        Gson gson= new Gson();
        String requestJson =gson.toJson(protocol);
        System.out.println("Json"+requestJson);
        
        return requestJson;
    }
    
}
