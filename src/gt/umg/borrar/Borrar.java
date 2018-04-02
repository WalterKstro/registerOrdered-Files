
package gt.umg.borrar;

import java.io.File;


/**
 * Clase Borrar permite el borrado
 * del archivo salida.txt
 */
public class Borrar {
/**
 * Metodo BorrarFile permitira borrar el archivo salida.txt
 * @param none
 * @return void no retorna nada
 */
    public void BorrarFile(){
        File fichero = new File("salida.txt");
        fichero.delete();
    }
}
