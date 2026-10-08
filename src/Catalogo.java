public interface Catalogo <T>{

	void agregar(T documento);
	T obtener(int posicion);
	void eliminar(int posicion);
	int buscar(T nombre);
	int tamaño();

}
