package gt.umg.esritura;

/**
 *Importacion de librerias
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase EscribirArchivo contendra los parametros
 * y metodos para poder escribir en un archivo entrada.txt
 * 
 */
public class EscribirArchivo {

    /**
     *Inicializacion de varaibles con 
     * modificadores de acceso private
     */
    private String nombre;
    private String apellido;
    private String carrera;
    private String carnet;
    Scanner txt = new Scanner(System.in);

    /**
     *Funcion IngresarDatos() Permite el ingreso de nuevos datos 
     * y almacenarlo temporalmente en la variables
     *@param none
     *@return void no retorna nada
     */
    public void Datos() {
        /**
         * Solicitar la informacion de cada estudiante
         * y almacenarlo en variables temporales
         */
        System.out.print("  INGRESE SU CARNÉ: ");
        carnet = txt.nextLine();
        System.out.print("  INGRESE SU NOMBRE: ");
        nombre = txt.nextLine();
        System.out.print("INGRESE SU APELLIDO: ");
        apellido = txt.nextLine();
        System.out.print(" INGRESE SU CARRERA: ");
        carrera = txt.nextLine();
    }

    /*
    *Funcion EscribirDatos() Permite el registro de los datos al archivo
    *@param none
    *@return void no retorna nada
     */
    public void EsribirDatos() {
        /**
         * Manejo de excepciones para la escritura 
         * de nuevos registros al archivo entrada.txt
         */
        try {
            File archivo = new File("entrada.txt"); //Se crea un objeto de tipo File con el archivo entrada.txt

            try {
                /**
                 *Se crea el objeto escribir de la libreria FileWriter
                 *@method FileWriter constructor de la clase FileWriter
                 *@param archivo directorio del archivo
                 * @param true  como apila la informacion en el archivo
                 */
                FileWriter escribir = new FileWriter(archivo, true);
                /**
                 * Proceso de escritura en el archivo
                 */
                escribir.write(carnet + "| ");
                escribir.write(nombre + "|");
                escribir.write(apellido + "|");
                escribir.write(carrera + "; \r\n");
                /**
                 *Se cierra el archivo
                 */
                escribir.close();
                System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
                /**
                 *@exception IOException ERROR: en el registro de los datos
                 */
            } catch (IOException ioe) {
                System.out.println("ERROR::" + ioe.getMessage());
            }
            /**
             * @exception ERROR: en la ubicacion del archivo
             */
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
