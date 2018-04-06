package gt.umg.esritura;

/**
 * Importacion de librerias
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import umg.gt.ordenacion.estudiantes.EstudiantesCarne;

/**
 * Clase EscribirArchivo contendra los parametros y metodos para poder escribir en un archivo entrada.txt
 *
 * @author walte
 */
public class EscribirArchivo {

    /**
     * Inicializacion de varaibles con modificadores de acceso private
     */
    private String nombre;
    private String apellido;
    private String carrera;
    private String carne;
    Scanner txt = new Scanner(System.in);
    EstudiantesCarne estudiante = new EstudiantesCarne();
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String[] datos = null;

    /**
     * Funcion IngresarDatos() Permite el ingreso de nuevos datos y almacenarlo temporalmente en la variables
     */
    public void Datos() {
        /**
         * Solicitar la informacion de cada estudiante y almacenarlo en variables temporales
         */
        /**
         * Manejo de las excpeciones con try y catch
         */
        try {
            /**
             * Instanciacion del objeto archivo de la clase File
             *
             * @method File() constructor de la clase File
             * @param archivo ruta del archivo
             */
            archivo = new File("entrada.txt");
            try {
                /**
                 * Creacion del objeto fr, de la clase FileReader
                 *
                 * @method FileReader() contructor de la clase FileReader
                 * @param archivo objeto con la ruta del archivo
                 */
                fr = new FileReader(archivo);
            } /**
             * @exception FileNotFoundException ERROR: En la la ruta del arhivo
             */
            catch (FileNotFoundException e) {
                System.out.println("Error:" + e.getMessage());
            }
            /**
             * Instanciacion del objeto br de la clase BufferedReader
             *
             * @method BufferedReader constructor de la clase BufferedReader
             * @param fr
             */
            br = new BufferedReader(fr);

            /**
             * Lectura del archivo
             */
            String linea;

            try {
                System.out.print("   INGRESE SU CARNÉ: ");
                carne = txt.nextLine();
                estudiante.setCarne(carne);
                while ((linea = br.readLine()) != null) {

                    datos = linea.split("\\|");

                    String c = datos[0].trim();
                    if (c.equals(carne)) {
                        System.out.println("ERROR: CARNE YA ESTA EN USO");
                        System.out.println(c + "=" + carne);
                        System.out.print("   INGRESE SU CARNÉ: ");
                        carne = txt.nextLine();
                        estudiante.setCarne(carne);
                    }
                }
                System.out.print("  INGRESE SU NOMBRE: ");
                nombre = txt.nextLine();
                estudiante.setNombre(nombre);
                System.out.print("INGRESE SU APELLIDO: ");
                apellido = txt.nextLine();
                estudiante.setNombre(apellido);
                System.out.print(" INGRESE SU CARRERA: ");
                carrera = txt.nextLine();
                estudiante.setCarrera(carrera);
                br.close();
            } /**
             * @exception IOException ERROR: en la lectura del archivo
             */
            catch (IOException io) {
                System.out.println("ERROR:" + io.getMessage());
            }
        } /**
         * @exception Exception ERROR: en la instancia del objeto fr
         */
        catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        } /**
         * En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien como si salta una excepcion.
         */
        finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } /**
             * @exception Exception ERROR: en el cierre del archivo
             *
             */
            catch (Exception e2) {
                System.out.println("ERROR:" + e2.getMessage());
            }
        }
    }

    /**
     * Funcion EscribirDatos() Permite el registro de los datos al archivo
     */
    public void EsribirDatos() {
        Datos();
        /**
         * Manejo de excepciones para la escritura de nuevos registros al archivo entrada.txt
         */
        try {
            File archivo = new File("entrada.txt"); //Se crea un objeto de tipo File con el archivo entrada.txt

            try {
                /**
                 * Se crea el objeto escribir de la libreria FileWriter
                 *
                 * @method FileWriter constructor de la clase FileWriter
                 * @param archivo directorio del archivo
                 * @param true como apila la informacion en el archivo
                 */
                FileWriter escribir = new FileWriter(archivo, true);
                /**
                 * Proceso de escritura en el archivo utilizando el metodo write del objeto escribir
                 */
                escribir.write(carne + " | ");
                escribir.write(nombre + " | ");
                escribir.write(apellido + " | ");
                escribir.write(carrera + "; \r\n");
                /**
                 * Se cierra el archivo
                 */
                escribir.close();
                System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
                /**
                 * @exception IOException ERROR: en el registro de los datos
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
