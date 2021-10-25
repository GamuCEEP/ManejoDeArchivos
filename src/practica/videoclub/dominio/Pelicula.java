
package practica.videoclub.dominio;

public class Pelicula {
    private int id;
    private String nombre;
    private double precio;
    public enum campos{
        ID(1), 
        NOMBRE(2), 
        PRECIO(3);
        public final int pos;
        private campos(int pos){
            this.pos = pos;
        }
    }

    public Pelicula(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Pelicula(String ... datos){
        this.id = Integer.parseInt(datos[campos.ID.pos]);
        this.nombre = datos[campos.NOMBRE.pos];
        this.precio = Double.parseDouble(datos[campos.PRECIO.pos]);
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.id+","+this.nombre+","+this.precio;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((Pelicula)obj).nombre); 
    }
    
}
