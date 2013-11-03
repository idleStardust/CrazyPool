package colecciones;

/**
 * Interfaz encargada de serializar a cada objeto con un identificador único.
 * @author ArturoMora
 *
 */
public interface ISerializable 
{
	/**
	 * Imprime en consola el identificador unico del objeto.
	 */
	void printID();
	
	/**
	 * @param pSerie {@link Integer}
	 */
	void setID(int pSerie);
	
	/**
	 * 
	 * @return ID {@link String}
	 */
	String getID();
	
	/**
	 * @return Serie {@link Integer}
	 */
	int getSerie();
	
	/**
	 * @return Tipo {@link String}
	 */
	String getTipo();
}
