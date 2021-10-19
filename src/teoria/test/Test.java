/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.test;
import practica.videoclub.datos.*;
import practica.videoclub.dominio.Pelicula;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        iAccesoADatos test = new AccesoADatosImp();
        String nombreArchivo = "BaseDeDatosVideoclub";
        
        
        try {
            test.crear(nombreArchivo);
            assert test.existe(nombreArchivo) == true;
            test.escribir(new Pelicula("Titanic"), nombreArchivo, true);
            test.escribir(new Pelicula("Matrix"), nombreArchivo, true);
            test.escribir(new Pelicula("Pokemon"), nombreArchivo, true);
            assert test.buscar(nombreArchivo, "Titanic") != null;
            assert test.buscar(nombreArchivo, "tiTaNic") != null;
            test.borrar(nombreArchivo);
            assert test.existe(nombreArchivo);
            
        } catch (Exception e) {
            
        }
        
    }
}
