/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 02/02/2023 por Radwane Abdessamie Belkassemi.
 * Esta es la versión 2.3.1
 */
public class EntradaBlogRAB {
        /**
         * separador es el ccarácter que separa ENTRADA DE del
         * nombre del autor
         */

    public static char separador = ':';
    private final int id;
    private final String texto;
    private final String autor;

        /**
         * Constructor de la clase. recibe el número de entrada, el nombre del autor
         * de la entrada y el texto que contiene la entrada. Si el número de entrada
         * es negativo, lanza una excepción.
         * @param id
         * @param autor
         * @param texto
         * @throws IllegalArgumentException
         */
    public EntradaBlogRAB(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public String toString() {
        String cad = "";
        cad += "ENTRADA DE" + separador + autor;
        cad += "\n" + texto;
        return cad;
    }

    /**
     * Devuelve el número de la entrada
     *
     * @return int
     */
    public int getId() {
        return this.id;
    }


    /**
     * Devuelve el texto completo de la entrada
     *
     * @return String
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * devuelve el nombre del autor de la entrada en mayúsculas
     *
     * @return String
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }


    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     *
     * @return String
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * No tiene porqué tener argumentos.
     *
     * @param args
     */
    public static void main(String[] args) {
        EntradaBlogRAB e1 = new EntradaBlogRAB(5, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
