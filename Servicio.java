import java.util.Scanner;

public class Servicio extends Producto {
    private double duracion; //(en horas)

    public Servicio(String nombre, double precio, double duracion) {
        super(nombre, precio);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public void modificarDatos(Scanner scanner) {
    System.out.print("Nuevo nombre (actual: " + getNombre() + "): ");
    setNombre(scanner.nextLine());

    System.out.print("Nuevo precio (actual: $" + getPrecio() + "): ");
    setPrecio(scanner.nextDouble());

    System.out.print("Nueva duración en horas (actual: " + duracion + "): ");
    duracion = scanner.nextDouble();
    scanner.nextLine();
}

    @Override
    public String toString() {
        return "ID: " + id + " - Servicio: " + nombre + " - Precio: $" + precio + " - Duración: " + duracion + " horas";
    }
}
