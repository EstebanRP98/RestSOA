/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author EstebanRM
 */
public class BaseDatos {
    
    private final static BaseDatos bd = new BaseDatos();
    private final List<Persona> listPersona = new ArrayList<>();
    
    
    private BaseDatos(){
        Persona p1 = new  Persona(1,"esteban","1234","este@gmail.com");
        Persona p2 = new  Persona(2,"angel","5555","ang@gmail.com");
        
        listPersona.add(p1);
        listPersona.add(p2);
        
    }
    
    public static BaseDatos getInstancia(){
        return bd;
    }
    
    public List<Persona> getListado(){
        return listPersona;
    }
        
    
}
