/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.test;
import java.util.List;
import practica.videoclub.datos.*;
import practica.videoclub.dominio.Pelicula;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
//    public static void main(String[] args) {
//        accesoADatosImp_test();
//        
//    }
    private static void accesoADatosImp_test(){
        System.out.println("Testeando accesoADatosImp");
        iAccesoADatos test = new AccesoADatosImp();
        String nombreArchivo = "BaseDeDatosVideoclub";
        
        Pelicula titanic = new Pelicula("Titanic");
        Pelicula matrix = new Pelicula("Matrix");
        try {
            test.crear(nombreArchivo);
            test.escribir(matrix, nombreArchivo, true);
            test.borrar(nombreArchivo);
        } catch (Exception e) {
            
        }
    }
}
