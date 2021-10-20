/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub.datos;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import practica.videoclub.dominio.Pelicula;
import practica.videoclub.excepciones.*;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoADatosImp implements iAccesoADatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoADatosEx {
        File archivo = new File(nombreArchivo);
        try {
            return archivo.exists();
        } catch (SecurityException e) {
            e.printStackTrace(System.err);
            throw new AccesoADatosEx("No se pudo comprobar si \"" + nombreArchivo + "\" existe");
        }
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        List<Pelicula> listadoPeliculas = new LinkedList<>();

        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            while ((lectura = entrada.readLine()) != null) {
                listadoPeliculas.add(new Pelicula(lectura));
            }
            entrada.close();
            return listadoPeliculas;
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
            throw new LecturaDatosEx();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            throw new LecturaDatosEx();
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            salida.println(pelicula);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
            throw new EscrituraDatosEx();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            throw new EscrituraDatosEx();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String busqueda) throws LecturaDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            int contador = 0;
            while ((lectura = entrada.readLine()) != null) {
                if (lectura.equalsIgnoreCase(busqueda)) {
                    return lectura + " está en la linea " + contador;
                }
                contador++;
            }
            
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
            throw new LecturaDatosEx();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            throw new LecturaDatosEx();
        }
        return null;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoADatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
            throw new AccesoADatosEx("Error al crear el archivo, \"" + nombreArchivo + "\" no se pudo crear");
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoADatosEx {
        File archivo = new File(nombreArchivo);
        try {
//            archivo.delete();
            Files.delete(archivo.toPath());
            
        } catch (SecurityException e) {
            e.printStackTrace(System.err);
            throw new AccesoADatosEx("Error al borrar el archivo, \"" + nombreArchivo + "\" no se pudo borrar");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
