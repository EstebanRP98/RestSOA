/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restSoa;

import Dao.BaseDatos;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import modelo.Persona;
import servicio.Servicio;

/**
 *
 * @author EstebanRM
 */
@Stateless
@Path("/persona")
public class Prueba {
    Servicio servicio = new Servicio();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getPersona(){              
        return servicio.getPersonas();
    }
    
    @GET
    @Path("/{personaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getPersona(@PathParam("personaId") int id){
        return servicio.getPersona(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona addPersona(Persona persona){
        return servicio.addPersona(persona);
    }
}
