/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Dao.BaseDatos;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author EstebanRM
 */
public class Servicio {
    private  List<Persona> listPersona = BaseDatos.getInstancia().getListado();
    
    public List<Persona> getPersonas(){
        return listPersona;
    }
    
    public Persona getPersona(int idPers){
        for(Persona persona : listPersona){
            if(persona.getId() == idPers){
                return persona;
            }
        }
        return null;
    }
    
    public Persona addPersona(Persona persona){
        persona.setId(getMaximo());
        listPersona.add(persona);
        return persona;
    }
    
    public void deletePersona(int id){
        int posicion= getPosicion(id);
        listPersona.remove(id);
    }
    
    public int getPosicion(int id ){
        for(int i=0;i<listPersona.size();i++){
            if(listPersona.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public int getMaximo(){
        int size= listPersona.size();
        if(size>0){
            return listPersona.get(size-1).getId()+1;           
        }
        else{
            return 1;
        }
    }
    
}
