/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import practica.videoclub.dominio.Pelicula;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoADatosEx {
    public boolean existe(String nombreArchivo){
        return false;
    }
    public List<Pelicula> listar(String nombreArchivo){
        return null;
    }
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar){
        
    }
    public String buscar(String nombreArchivo, String busqueda){
        return null;
    }
    public void crear(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);            
            salida.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.err);
        }
    }
    public void borrar(String nombreArchivo){
        
    }
}
