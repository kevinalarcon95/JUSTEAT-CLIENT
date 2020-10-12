package co.unicauca.justeat.client.access;

import co.unicauca.justeat.client.infra.UserSocket;
import co.unicauca.justeat.commons.domain.User;
import co.unicauca.justeat.commons.infra.JsonError;
import co.unicauca.justeat.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 *      SANTIAGO MUÑOZ 
 *      KEVIN ALARCON 
 *      JUAN JOSE LOPEZ 
 *      SANTIAGO CORDOBA 
 *      DANIEL MUÑOZ
 */

public class UserAccessImplSockets implements IUserAccess{
    
    private UserSocket mySocket;
    
    UserAccessImplSockets(){
        mySocket = new UserSocket();
    }

    @Override
    public User findUser(String id) throws Exception {
        String jsonResponse = null;
        String requestJson = findUserRequestJson(id);
        
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(UserAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        
        if(jsonResponse == null){
            throw  new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor este escuchando");
        }else{
            if(jsonResponse.contains("error")){
                //Devolvio algun error
                 Logger.getLogger(UserAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                 throw new Exception(extractMessages(jsonResponse));
            }else{
                //Encontro un usuario
                User user = jsonToUser(jsonResponse);
                return user;
            }
        }
        
    }

    @Override
    public String createUser(User user) throws Exception {
        String jsonResponse = null;
        String requestJson = createUserRequestJson(user);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(UserAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(UserAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve el userName del usuarioS 
                return user.getUserName()+ "";
            }

        }
    }
    
    private String findUserRequestJson(String userName){
        Protocol protocol = new Protocol();
        protocol.setResource("user");
        protocol.setAction("get");
        protocol.addParameter("userName", userName);

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
     * objeto User
     *
     * @param jsonUser objeto cliente en formato json
     */
    private User jsonToUser(String jsonUser) {

        Gson gson = new Gson();
        User user = gson.fromJson(jsonUser, User.class);

        return user;

    }
    
    /**
     * Crea la solicitud json de creación del user para ser enviado por el
     * socket
     *
     * @param user objeto customer
     * @return devulve algo como:
     * {"resource":"customer","action":"post","parameters":[{"name":"id","value":"980000012"},{"name":"fistName","value":"Juan"},...}]}
     */
    
    
    private String createUserRequestJson(User user) {

        Protocol protocol = new Protocol();
        protocol.setResource("Usuario");
        protocol.setAction("post");
        protocol.addParameter("UserName", user.getUserName());
        protocol.addParameter("UserContraseña", user.getUserContrasena());
        protocol.addParameter("UserNombre", user.getUserNombre());
        protocol.addParameter("UserApellido", user.getUserApellido());
        protocol.addParameter("UserCedula", user.getUserCedula());
        protocol.addParameter("UserCiudad", user.getUserCiudad());
        protocol.addParameter("UserDireccion", user.getUserDireccion());
        protocol.addParameter("UserCelular", user.getUserCelular());

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }
}
