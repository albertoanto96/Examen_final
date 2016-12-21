package edu.upc.dsa;

import com.google.gson.Gson;

import javax.inject.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Path("/json")
public class JSONService  {
Interface i=new Manager();
    @GET
    @Path("/get/{usuari}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuariInJSON(@PathParam("usuari") String usuari) {
       return i.getUsuariInJSON(usuari);
    }
    @POST
    @Path("/etakemon/{usuari}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String newEtakemon(@PathParam("usuari") String usuari, Etakemon etakemon) {
        return i.newEtakemon(usuari,etakemon);


    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String iniciarSesion(Usuari user) {
        return i.iniciarSesion(user);
    }
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String registro(Usuari user) {
        return i.registro(user);


    }
}