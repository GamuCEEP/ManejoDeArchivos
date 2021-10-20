/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Pelicula {
    private String nombre;
    public Pelicula(){
        
    }
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((Pelicula)obj).nombre); 
    }
    
}
