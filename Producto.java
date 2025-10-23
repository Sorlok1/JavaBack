import java.util.Scanner;

public abstract class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected static int contador = 1; 

    public Producto(String nombre, double precio) {
        this.id = contador++;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void modificarDatos(Scanner scanner);

    
    @Override
    public abstract String toString();
}
