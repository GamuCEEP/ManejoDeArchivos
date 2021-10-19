/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.negocio;

/**
 *
 * @author Alumno Mañana
 */
public interface iCatalogoPeliculas {
    public void agregarPelicula(String nombrePelicula, String nombreArchivo);
    public void listarPeliculas(String nombreArchivo);
    public void buscarPelicula(String nombreArchivo, String busqueda);
    public void iniciarCatalogo(String nombreArchivo);
}
