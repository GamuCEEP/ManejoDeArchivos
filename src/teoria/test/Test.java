/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.test;
import static teoria.manejodearchivos.ManejoDeArchivos.*;
/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        String nombreArchivo = "Prueba.txt";
        
        //createFile(nombreArchivo);
        appendToFile(nombreArchivo, "textasdrueba");
        readFile(nombreArchivo);
    }
}
