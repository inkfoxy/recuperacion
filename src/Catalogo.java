package recuperacion;
/**
 * Interfaz genérica para gestionar un catálogo de documentos o elementos.
 * @param <T> El tipo de elementos almacenados en el catálogo.
 */
public interface Catalogo<T> {

    /**
     * Agrega un elemento al catálogo.
     * @param elemento Objeto de tipo T a agregar.
     */
    void agregar(T elemento);

    /**
     * Obtiene el elemento ubicado en un índice específico.
     * @param indice Posición del elemento a recuperar.
     * @return El elemento de tipo T en la posición indicada.
     */
    T obtener(int indice);

    /**
     * Elimina el elemento en un índice determinado y recorre los elementos posteriores.
     * @param indice Posición del elemento a eliminar.
     */
    void eliminar(int indice);

    /**
     * Busca la primera ocurrencia de un elemento por contenido.
     * @param elemento Objeto a buscar.
     * @return El índice (0-based) si se encuentra, o -1 si no existe.
     */
    int buscar(T elemento);

    /**
     * Obtiene la cantidad actual de elementos en el catálogo.
     * @return Número total de elementos presentes.
     */
    int tamanio();
}
