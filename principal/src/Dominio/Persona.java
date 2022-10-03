/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ingri
 */
public class Persona {
        private int id;
        private String nombre;
        private String apellido;
        
    //nuestro contador de persona
        private static int contadorPersona;

    public Persona() {
        this.id= ++Persona.contadorPersona;
    }

    public final void imprimir(){
        System.out.println("imprimiendo desde la clase padre");
    }
    
    public Persona( String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

//        public void setId(int id) {
//            this.id = id;
//        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
       
       
      
    
    
}
