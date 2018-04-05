package gt.umg.esritura;

/**
 *Importacion de librerias
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import umg.gt.ordenacion.estudiantes.EstudiantesCarrera;

/**
 * Clase EscribirArchivo contendra los parametros
 * y metodos para poder escribir en un archivo entrada.txt
 * @author walte
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
    EstudiantesCarrera estudiante = new EstudiantesCarrera();

    /**
     *Funcion IngresarDatos() Permite el ingreso de nuevos datos 
     * y almacenarlo temporalmente en la variables
     */
    public void Datos() {
        /**
         * Solicitar la informacion de cada estudiante
         * y almacenarlo en variables temporales
         */
        System.out.print("   INGRESE SU CARNÉ: ");
        carnet = txt.nextLine();
        estudiante.setCarne(carnet);
        System.out.print("  INGRESE SU NOMBRE: ");
        nombre = txt.nextLine();
        estudiante.setNombre(nombre);
        System.out.print("INGRESE SU APELLIDO: ");
        apellido = txt.nextLine();
        estudiante.setNombre(apellido);
        System.out.print(" INGRESE SU CARRERA: ");
        carrera = txt.nextLine();
        estudiante.setCarrera(carrera);
    }

    /**
     *Funcion EscribirDatos() Permite el registro de los datos al archivo
     */
    public void EsribirDatos() {
        Datos();
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
                 * Proceso de escritura en el archivo utilizando
                 * el metodo write del objeto escribir
                 */
                escribir.write(carnet + " | ");
                escribir.write(nombre + " | ");
                escribir.write(apellido + " | ");
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
