

package gt.umg.borrar;

import java.io.File;



public class Borrar {
    public void BorrarFile(){
        File fichero = new File("salida.txt");
        fichero.delete();
    }
}
