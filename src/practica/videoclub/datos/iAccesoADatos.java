/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.datos;

import java.util.List;
import practica.videoclub.dominio.Pelicula;
import practica.videoclub.excepciones.*;

/**
 *
 * @author Alumno Mañana
 */
public interface iAccesoADatos {
    /**
     * Devuelve true si el archivo existe
     * @param nombreArchivo
     * @return
     * @throws AccesoADatosEx 
     */
    public boolean existe(String nombreArchivo) throws AccesoADatosEx;
    /**
     * Devuelve un List de las peliculas que hay en el archivo
     * @param nombreArchivo
     * @return
     * @throws LecturaDatosEx 
     */
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    /**
     * Apunta una pelicula en el archivo dado
     * @param pelicula
     * @param nombreArchivo
     * @param anexar
     * @throws EscrituraDatosEx 
     */
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    /**
     * Busca una pelicula en un archivo y devuelve la posición en la que está
     * @param nombreArchivo
     * @param busqueda
     * @param campo
     * @return
     * @throws LecturaDatosEx 
     */
    public String buscar(String nombreArchivo, String busqueda, Pelicula.campos campo) throws LecturaDatosEx;
    /**
     * Crea el archivo dado
     * @param nombreArchivo
     * @throws AccesoADatosEx 
     */
    public void crear(String nombreArchivo) throws AccesoADatosEx;
    /**
     * Borra el archivo dado
     * @param nombreArchivo
     * @throws AccesoADatosEx 
     */
    public void borrar(String nombreArchivo) throws AccesoADatosEx;
}
