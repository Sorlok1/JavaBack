import java.util.Scanner;
import java.util.ArrayList;


public class Inicio{
        private static ArrayList<Producto> productos = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);



    public static void main(String [] args){


        System.out.println("Ingrese su nombre: ");
        String cliente = scanner.nextLine();


        System.out.println("Hola " + cliente + ", decime que te gustaria hacer: ");

        Menu();        
    }





/* Menu */
    public static void Menu() {
        int opcion;
    do {
            System.out.println("\n===== MENU DE ARTICULOS =====");
            System.out.println("1. Crear articulo");
            System.out.println("2. Modificar articulo");
            System.out.println("3. Listar artículo por posicion");
            System.out.println("4. Eliminar articulo");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1: Crear();
                    
                break;                

                case 2:Modificar();
                
                break;

                case 3:Listar();
                
                break;

                case 4:Eliminar();
                
                break;
                
                case 5:
                
                break;

                default: System.out.println("Por favor, ingrese una opcion valida.");
                break;
            }


        } while (opcion != 5);
}

/* Crear */
    public static void Crear() {

        System.out.println("¿Qué desea crear? (1) Articulo  (2) Servicio");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {

        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese cantidad en stock: ");
        int stock = scanner.nextInt();

        productos.add(new Articulos(nombre, precio, stock));

        System.out.println("Articulo creado: " );



        } else if (tipo == 2){

        System.out.println("Ingrese el nombre del servicio:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio:");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese la duracion en horas:");
        double duracion = scanner.nextDouble();

        productos.add(new Servicio(nombre, precio, duracion));
        }

        


    }


/* Modificar */
    public static void Modificar() {
        System.out.println("\n-- Listado --");
        if (productos.isEmpty()) {
            System.out.println("(sin artículos)");
            return;
        
        }
        for (Producto a : productos) {
            System.out.println(a);
        }

        System.out.println("\nIngrese el ID del artículo que desee modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // para limpiar buffer. De lo contrario me baja la linea sin tomar el input

        // Buscar artículo
        Producto encontrado = null;
        for (Producto a : productos) {
        if (a.getId() == id) {
            encontrado = a;
            break;
        }
    }

        if (encontrado != null) {
            encontrado.modificarDatos(scanner);
            System.out.println("Producto modificado: " + encontrado);
        } else {
            System.out.println("No se encontró un producto con ID " + id);
        }




    }



/* Listar por posición */
    public static void Listar() {

        System.out.println("\n-- Listado --");
        if (productos.isEmpty()) {
            System.out.println("(sin artículos)");
            return;
        
        }
        for (Producto a : productos) {
            System.out.println(a);
        }


    }





/* Eliminar */
    public static void Eliminar() {
    System.out.println("\n-- Listado de artículos --");
    if (productos.isEmpty()) {
        System.out.println("(sin artículos)");
        return;
    }

    for (Producto a : productos) {
        System.out.println(a);
    }

    System.out.print("\nIngrese el ID del artículo a eliminar: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    Producto encontrado = null;
    for (Producto a : productos) {
        if (a.getId() == id) {
            encontrado = a;
            break;
        }
    }

    if (encontrado != null) {
        productos.remove(encontrado);
        System.out.println("Artículo eliminado: " + encontrado);
    } else {
        System.out.println("No se encontró un artículo con ID " + id);
    }
}



    }

;


