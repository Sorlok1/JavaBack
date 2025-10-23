import java.util.Scanner;

public class Articulos extends Producto{

    private int stock;



    public Articulos(String nombre, double precio, int stock) {
        
        super(nombre, precio);

        this.stock = stock;
    }

    @Override
    public void modificarDatos(Scanner scanner) {
        System.out.print("Nuevo nombre (actual: " + getNombre() + "): ");
        setNombre(scanner.nextLine());

        System.out.print("Nuevo precio (actual: $" + getPrecio() + "): ");
        setPrecio(scanner.nextDouble());

        System.out.print("Nuevo stock (actual: " + stock + "): ");
        stock = scanner.nextInt();
        scanner.nextLine(); 
    }

    @Override
    public String toString() {
    return "ID: " + id + " - Articulo: " + nombre + " - Precio: $" + precio + " - Stock: " + stock;}



public int getStock() { 
    return stock; 

}

public void setStock(int stock) { 
    this.stock = stock; 


}








    

    

    // ejemplo de un method que no es un getter ni un setter 
/*     public String mostrarInfo() {
        return "Articulo{id=" + id + ", nombre='" + nombre + "', precio=" + precio +
               ", categoria=" + categoria.getNombre() + "}";
    }
    // sobrecarga del method mostrarInfo
    public String mostrarInfo(boolean conCategoria) {
        if (conCategoria) {
            return "Articulo{id=" + id + ", nombre='" + nombre + "', precio=" + precio +
                   ", categoria=" + categoria.getNombre() + "}";
        } else {
            return "Articulo{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
        }
    }

 */    // sobreescribimos el metodo toString() para mostrar la informacion del articulo
    // toString() es un metodo de la clase Object que todas las clases heredan
    // sirve para representar un objeto como una cadena de texto
    // por defecto devuelve la direccion de memoria del objeto
    // podemos sobreescribirlo para mostrar la informacion que queramos
    // @Override es una anotacion que indica que estamos sobreescribiendo un metodo de la superclase
    // nos ayuda a evitar errores de sintaxis y a mejorar la legibilidad del codigo
    // ejemplo: si queremos mostrar el nombre y el precio del articulo, podemos sobreescribir toString()
    // y devolver una cadena con esa informacion
    // cuando imprimimos un objeto, java llama automaticamente al metodo toString()
    // System.out.println(articulo) --> articulo.toString()
/*     @Override
    public String toString() {
        return "Articulo{id=" + id + ", nombre='" + nombre + "', precio=" + precio +
               ", categoria=" + categoria.getNombre() + "}";
    } */
}