package gt.umg.lectura;
/**
 *Importacion de librerias
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase LeerArchivo permite la lectura del 
 * archivo externo
 * @author walte
 */
public class LeerArchivo {
    /*
    *Inizialicacion de las variables con null
    */
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    /**
    *@method Letura() permite leer el archivo
    *@param none
    *@return void
    */
    public void Lectura() {
        /**
         * Manejo de las excpeciones con try
         * y catch
         */
        try {
            /**
             * Instanciacion del objeto archivo de la clase File
            *@method File() constructor de la clase File
            *@param archivo  ruta del archivo
            */
            archivo = new File("entrada.txt");
            try {
                /**
                 * Creacion del objeto fr, de la clase FileReader
                 * @method FileReader() contructor de la clase FileReader
                 * @param archivo objeto con la ruta del archivo
                 */
                fr = new FileReader(archivo);
            }
            /**
            *@exception FileNotFoundException
            *ERROR: En la la ruta del arhivo
            */
            catch (FileNotFoundException e) {
                System.out.println("Error:" + e.getMessage());
            }
            /**
             * Instanciacion del objeto br de la clase BufferedReader
             * @method BufferedReader constructor de la clase BufferedReader
             * @param fr 
             */
            br = new BufferedReader(fr);

            /**
             *Lectura del archivo
             */
            String linea;
            try {
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
            /**
             *@exception IOException ERROR: en la lectura del archivo
             */
            catch (IOException io) {
                System.out.println("ERROR:" + io.getMessage());
            }
        }
        /**
        *@exception Exception ERROR: en la instancia del objeto fr
        */
        catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        /**
         *En el finally cerramos el fichero, para asegurarnos
         *que se cierra tanto si todo va bien como si salta 
         *una excepcion.
         */
        finally {
           
            try {
                if (null != fr) {
                    fr.close();
                }
            }
            /**
            *@exception Exception ERROR: en el cierre del archivo
            *
            */
            catch (Exception e2) {
                System.out.println("ERROR:" + e2.getMessage());
            }
        }

    }

}
