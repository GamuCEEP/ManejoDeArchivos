/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.manejodearchivos;

//Representa un archivo
import java.io.File;
//Para leer
import java.io.BufferedReader;
import java.io.FileReader;//Una sola linea
//Para escribir
import java.io.FileWriter;
import java.io.PrintWriter;
//Exceptions 
import java.io.IOException;
import java.io.FileNotFoundException;


/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {

    public static void createFile(String nombreArchivo){
        //Se crea el objeto 
        File archivo = new File(nombreArchivo);
        try{
            //Se instancia en el disco duro
            PrintWriter salida = new PrintWriter(archivo);            
            salida.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.err);
        }
    }
    public static void writeFile(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(archivo);
            pw.println(contenido);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
        }
        
    }
    public static void appendToFile(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true));
            pw.println(contenido);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
        }catch (IOException e){
            e.printStackTrace(System.err);
        }
    }
    public static void readFile(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader( new FileReader(archivo));
            String lectura;
            while((lectura = entrada.readLine()) != null){
                System.out.println("lectura = "+lectura);
                //lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
        } catch (IOException e){
            e.printStackTrace(System.err);
        }
    }
}
