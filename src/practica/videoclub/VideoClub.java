/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.videoclub;

import java.util.Scanner;
import practica.videoclub.negocio.CatalogoPeliculasImp;

/**
 *
 * @author Alumno Mañana
 */
public class VideoClub {

    public static void main(String[] args) {
        menu();
    }

    /*
    Supongo que falta el paquete de ui
    Menu:
    opc1->iniciar catalogo
    opc2->agregar una pelicula
    opc3->listar paliculas
    opc4->bucar una pelicula
    opc0->salir
     */
    public static void menu() {
        CatalogoPeliculasImp control = new CatalogoPeliculasImp();
        Scanner scan = new Scanner(System.in);
        String nombreArchivo = "ArchivoDefault";
        String[] opciones = {"Iniciar catalogo", "Agregar una pelicula", "Listar peliculas", "Buscar una pelicula"};

        while (true) {
            showMenu(opciones);
            switch (getMenuOption(opciones, scan)) {
                case 0:
                    return;
                case 1:
                    System.out.println("Escribe el nombre del archivo de guardado:");
                    nombreArchivo = scan.nextLine();
                    control.iniciarCatalogo(nombreArchivo);
                    System.out.println("Archivo de guardado creado");
                    break;
                case 2:
                    System.out.println("Escribe el nombre de la pelicula que quieres agregar:");
                    control.agregarPelicula(scan.nextLine(), nombreArchivo);
                    System.out.println("Pelicula guardada en \"" + nombreArchivo + "\"");
                    break;
                case 3:
                    System.out.println("Las peliculas guardadas en el archivo " + nombreArchivo + " son:");
                    control.listarPeliculas(nombreArchivo);
                    break;
                case 4:
                    System.out.println("Escribe el nombre de la pelicula que quieres buscar");
                    control.buscarPelicula(nombreArchivo, scan.nextLine());
                    break;
            }
        }
    }

    public static void showMenu(String[] opciones) {
        System.out.println("________________________________________________________");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + " - " + opciones[i]);
        }
        System.out.println("0 - Salir");
        System.out.println("________________________________________________________");
    }

    public static int getMenuOption(String[] opciones, Scanner scan) {
        int opcion;
        while (true) {
            try {
                opcion = Integer.parseInt(scan.nextLine());
                if (opcion <= opciones.length && opcion >= 0) {
                    return opcion;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor introduce un número valido");

            } catch (Exception e) {//Debería crear una excepción para no usar Exception :|
                System.out.println("Por favor introduce un número entre 0 y " + opciones.length);
            }
            showMenu(opciones);
        }
    }
}


/*
    
    for(int i = 0; i < arr.length; i++){
        Pelicula elem = arr[i];
    }
    for(Pelicula elem : arr){

    }


 */
