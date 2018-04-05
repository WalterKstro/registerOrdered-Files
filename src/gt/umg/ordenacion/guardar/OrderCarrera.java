

package gt.umg.ordenacion.guardar;

/**
 * Importacion de las librerias necesarias
 */
import gt.umg.borrar.Borrar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import umg.gt.ordenacion.estudiantes.EstudiantesCarrera;


/**
 * Clase OrderCarrera contiene la implementacion para poder
 * ordenar a los estudiantes por su carrera en orden alfabetico
 * @author walte
 */
public class OrderCarrera {
  /**
    *Funcion LeerArchivo() Permite la lectura del archivo
    * de entrada, ordenarlo de acuerdo a ciertos criterios
    * y copiarlos a otro archivo de salida
    *
    */
    public void LeerArchivo(){
         /**
         * Declaracio de varaibles, asi como la instanciacion
         * de objetos(delete, f_salida)
         */
        String f_entrada = "entrada.txt";
        Borrar delete = new Borrar();
        File f_salida = new File("salida.txt");
        String linea = null;
        String[] datos = null;
        /**
         * Declaracion de la lista de estudiantes
         */
        ArrayList<EstudiantesCarrera> estudiantes = new ArrayList<>();
        EstudiantesCarrera estudiante = null;
        try {
            /**
             * Instanciacion del objeto br de la clase BufferedReader
             * @method BufferedReader() contructor de la clase BufferedReader
             * @param objeto recibe como una nueva instanciacion de la clase
             * FileReader
             * @method FileReader() constructor de la clase FileReader
             * @param f_entrada contiene la ruta del archivo de entrada para su lectura
             */
            BufferedReader br = new BufferedReader(new FileReader(f_entrada));
            /**
             * Ciclo while que permite leer todas las lineas del archivo
             * de entrada
             */
            while ((linea = br.readLine()) != null) {
               /**
                 * Cada linea se separa por una barra inclinada
                 */
                datos = linea.split("\\|");
                /**
                 * Creacion del objeto estudiante
                 * @method EstudiantesCarne constructor de la clase EstudiantesCarne
                 * @param datos son los parametros que forman a un objeto
                 * 
                 */
                estudiante = new EstudiantesCarrera(datos[0],datos[1],datos[2],datos[3]);
                  /**
                 * Se utiliza el metodo add para poder agregar al nuevo 
                 * estudiante a la lista
                 * @param estudiante cada estudiante que se instancia
                 */
                estudiantes.add(estudiante);
            }
            br.close();//Se cierra el archivo de lectura
            // imprimir archivo en orden original
            System.out.println("REGISTROS ORIGINALES:");
            System.out.println(estudiantes);
             /**
             * Utilizando el metodo sort de la  API Collections de Java
             * @method sort() metodo que ordena a los estudiantes
             * @param estudiantes listado de los estudiantes
             */
            Collections.sort(estudiantes);
            // imprimir archivo ordenado
            System.out.println("REGISTROS ORDENADOS:");
            System.out.println(estudiantes);
             /**
             * Objeto delete
             * @method BorrarFile() permite borrar el archivo de salida
             */
            delete.BorrarFile();
             /**
             * Objeto escribir 
             * @method FileWriter() permite la escritura en el archivo
             * @param f_salida contiene la ruta del archivo de salida
             * @param true determina la forma de escritura en el archivo
             */
            FileWriter escribir = new FileWriter(f_salida, true);
             /**
             * Ciclo Foreach para recorrer el listado
             * y obtener los parametros de los estudiantes y 
             * escribirlo en el archivo de f_salida
             */
            for(EstudiantesCarrera e:estudiantes){

                escribir.write(e.getCarne()+"|");
                escribir.write(e.getNombre()+"|");
                escribir.write(e.getApellido()+"|"); 
                escribir.write(e.getCarrera()+"\r\n");
            }


            escribir.close();//Cerrado del archivo de f_salida
            System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
