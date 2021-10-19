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
    public boolean existe(String nombreArchivo) throws AccesoADatosEx;
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo, String busqueda) throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoADatosEx;
    public void borrar(String nombreArchivo) throws AccesoADatosEx;
}
