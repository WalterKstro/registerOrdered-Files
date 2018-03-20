package lectura;
/*
*Importacion de librerias
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    /*
    *Inizialicacion de las variables con null
    */
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    /*
    *@method Letura() permite leer el archivo
    *@param none
    *@return void
    */
    public void Lectura() {

        try {
            /*Apertura del fichero y creacion de BufferedReader para poder
            *hacer una lectura comoda (disponer del metodo readLine()).
            *archivo = new File("entrada.txt");
            @method FileReader(archivo) constructor de la clase FileReader
            @param archivo = ruta del archivo
            */
            try {
                fr = new FileReader(archivo);
            }
            /*
            *@exception FileNotFoundException
            *ERROR: En la la ruta del arhivo
            */
            catch (FileNotFoundException e) {
                System.out.println("Error:" + e.getMessage());
            }
            br = new BufferedReader(fr);

            /*
             *Lectura del archivo
             */
            String linea;
            try {
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
            /*
             *@exception IOException ERROR: en la lectura del archivo
             */
            catch (IOException io) {
                System.out.println("ERROR:" + io.getMessage());
            }
        }
        /*
        *@exception Exception ERROR: en la instancia del objeto fr
        */
        catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        /*En el finally cerramos el fichero, para asegurarnos
         *que se cierra tanto si todo va bien como si salta 
         *una excepcion.
         */
        finally {
           
            try {
                if (null != fr) {
                    fr.close();
                }
            }
            /*
            *@exception Exception ERROR: en el cierre del archivo
            *
            */
            catch (Exception e2) {
                System.out.println("ERROR:" + e2.getMessage());
            }
        }

    }

}
