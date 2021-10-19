/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.excepciones;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoADatosEx extends Exception{
    public AccesoADatosEx(String error){
        super(error);
    }
    public AccesoADatosEx(){
        super("Error al acceder al archivo");
    }
}
