
package gt.umg.borrar;

import java.io.File;


/**
 * Clase Borrar permite el borrado
 * del archivo salida.txt
 */
public class Borrar {
/**
 * Metodo BorrarFile permitira borrar el archivo salida.txt
 */
    public void BorrarFile(){
        /**
         * Instancia un nuevo objeto de tipo File
         * @method File() es el constructor de la clase File
         * @param salida que es el archivo que se va a eliminar
         */
        File fichero = new File("salida.txt");
        fichero.delete();
    }
}
