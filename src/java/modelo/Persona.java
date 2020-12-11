/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author EstebanRM
 */
public class Persona {
    private int id;
    private String nombre;
    private String contrasenia;
    private String correo;
    
    public Persona(){
        
    }
    
    public Persona(int id, String nombre, String contrasenia, String correo){
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo= correo;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
