

package gt.umg.ordenacion.guardar;


import gt.umg.borrar.Borrar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import umg.gt.ordenacion.estudiantes.EstudiantesCarrera;



public class OrderCarrera {
  /*
    *Funcion EscribirDatos()
    *@param none
    *@return void
    *Permite el registro de los datos al archivo
     */
    public void LeerArchivo(){
        
        String f_entrada = "entrada.txt";
        Borrar delete = new Borrar();
        File f_salida = new File("salida.txt");
        String linea = null;
        String[] datos = null;
        ArrayList<EstudiantesCarrera> estudiantes = new ArrayList<>();
        EstudiantesCarrera estudiante = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f_entrada));
            // leer todas la lineas del archivo
            while ((linea = br.readLine()) != null) {
                // cada linea tiene los datos para crear un producto
                datos = linea.split(" ");
                estudiante = new EstudiantesCarrera(datos[0],datos[1],datos[2],datos[3]);
                // agregamos el producto a la lista de productos
                estudiantes.add(estudiante);
            }
            br.close();
            // imprimir archivo en orden original
            System.out.println("REGISTROS ORIGINALES:");
            System.out.println(estudiantes);
            Collections.sort(estudiantes);
            // imprimir archivo ordenado
            System.out.println("REGISTROS ORDENADOS:");
            System.out.println(estudiantes);
            delete.BorrarFile();
            FileWriter escribir = new FileWriter(f_salida, true);
            for(EstudiantesCarrera e:estudiantes){

                escribir.write(e.getCarne().trim());
                escribir.write(e.getNombre().trim());
                escribir.write(e.getApellido().trim()); 
                escribir.write(e.getCarrera().trim()+"\r\n");
            }


            escribir.close();
            System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
