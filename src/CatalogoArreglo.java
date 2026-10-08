package recuperacion;
@SuppressWarnings("unchecked")
public class CatalogoArreglo<T> implements Catalogo<T> {
    private T[] elementos;
    private int contador;

    public CatalogoArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        }
        this.elementos = (T[]) new Object[capacidad];
        this.contador = 0;
    }

    @Override
    public void agregar(T elemento) {
        if (contador >= elementos.length) {
            throw new IllegalStateException("El catálogo está lleno. No se pueden agregar más elementos.");
        }
        elementos[contador] = elemento;
        contador++;
    }

    @Override
    public T obtener(int indice) {
        validarIndice(indice);
        return elementos[indice];
    }

    @Override
    public void eliminar(int indice) {
        validarIndice(indice);
        // Recorrer los elementos hacia la izquierda
        for (int i = indice; i < contador - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[contador - 1] = null;
        contador--;
    }

    @Override
    public int buscar(T elemento) {
        for (int i = 0; i < contador; i++) {
            if (elementos[i] == null) {
                if (elemento == null) return i;
            } else if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int tamanio() {
        return contador;
    }

    private void validarIndice(int indice) {
        if (indice < 0 || indice >= contador) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice + ". Tamaño actual: " + contador);
        }
    }
}
