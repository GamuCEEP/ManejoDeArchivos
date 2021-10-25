package practica.videoclub.negocio;

import java.util.List;
import practica.videoclub.datos.AccesoADatosImp;
import practica.videoclub.datos.iAccesoADatos;
import practica.videoclub.dominio.Pelicula;
import practica.videoclub.excepciones.AccesoADatosEx;
import practica.videoclub.excepciones.EscrituraDatosEx;
import practica.videoclub.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImp implements iCatalogoPeliculas {

    private final iAccesoADatos datos;

    public CatalogoPeliculasImp() {
        datos = new AccesoADatosImp();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)) {
                datos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);
            }

        } catch (EscrituraDatosEx e) {
            e.printStackTrace();
        } catch (AccesoADatosEx e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> listado = datos.listar(nombreArchivo);

            for (Pelicula pelicula : listado) {
                System.out.println(pelicula.getNombre());
            }

        } catch (LecturaDatosEx e) {
            e.printStackTrace();
        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String busqueda) {
        try {
            String buscado = datos.buscar(nombreArchivo, busqueda, Pelicula.campos.NOMBRE);
            System.out.println("La pelicula " + (buscado != null ? buscado : "no se encontró"));

        } catch (LecturaDatosEx e) {
            e.printStackTrace();
        }

    }

    @Override
    public void iniciarCatalogo(String nombreArchivo) {
        try {
            datos.crear(nombreArchivo);

        } catch (AccesoADatosEx e) {
            e.printStackTrace();
        }
    }

}
