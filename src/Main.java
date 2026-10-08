public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS CON CATALOGO DE LIBROS ===");
        Catalogo<Libro> catalogoLibros = new CatalogoArreglo<>(3);

        Libro l1 = new Libro("Don Quijote", "Cervantes");
        Libro l2 = new Libro("Cien Años de Soledad", "García Márquez");
        Libro l3 = new Libro("Dune", "Herbert");

        catalogoLibros.agregar(l1);
        catalogoLibros.agregar(l2);
        catalogoLibros.agregar(l3);

        System.out.println("Tamaño del catálogo: " + catalogoLibros.tamanio());

        // Búsqueda por contenido (creando un objeto diferente)
        Libro busqueda = new Libro("Don Quijote", "Cervantes");
        int pos = catalogoLibros.buscar(busqueda);
        System.out.println("Posición de 'Don Quijote': " + pos);

        // Eliminación y reubicación
        catalogoLibros.eliminar(0);
        System.out.println("Elemento en índice 0 tras eliminar el primero: " + catalogoLibros.obtener(0));
        System.out.println("Nuevo tamaño: " + catalogoLibros.tamanio());

        System.out.println("\n=== PRUEBAS CON CATALOGO DE STRINGS ===");
        Catalogo<String> catalogoTextos = new CatalogoArreglo<>(3);
        catalogoTextos.agregar("A");
        catalogoTextos.agregar("B");
        catalogoTextos.agregar("C");

        System.out.println("Buscar 'C': " + catalogoTextos.buscar("C"));
        System.out.println("Buscar 'Z': " + catalogoTextos.buscar("Z"));
    }
}
