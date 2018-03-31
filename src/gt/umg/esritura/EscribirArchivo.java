package gt.umg.esritura;

/*
*Importacion de librerias
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {

    /*
    *Inicializacion de varaibles
     */
    private String nombre;
    private String apellido;
    private String carrera;
    private String carnet;
    Scanner txt = new Scanner(System.in);

    /*
    *Funcion IngresarDatos()
    *@param none
    *@return void
    *Permite el ingreso de nuevos datos y almacenarlo temporalmente en la variables
     */
    public void Datos() {
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
    *Funcion EscribirDatos()
    *@param none
    *@return void
    *Permite el registro de los datos al archivo
     */
    public void EsribirDatos() {
        try {
            File archivo = new File("entrada.txt");

            try {
                /*
                *Se crea el objeto escribir de la libreria FileWriter
                *@method FileWriter constructor de la clase FileWriter
                @param archivo = directorio del archivo, true = como apila la informacion en el archivo
                 */
                FileWriter escribir = new FileWriter(archivo, true);
                escribir.write(carnet + "|");
                escribir.write(nombre + "|");
                escribir.write(apellido + "|");
                escribir.write(carrera + "; \r\n");
                /*
                *Se cierra el archivo
                 */
                escribir.close();
                System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
                /*
                *@exception IOException ERROR: en el registro de los datos
                 */
            } catch (IOException ioe) {
                System.out.println("ERROR::" + ioe.getMessage());
            }
            /*
            * @exception ERROR: en la ubicacion del archivo
             */
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
