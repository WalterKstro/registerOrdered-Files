

package gt.umg.ordenacion.guardar;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import umg.gt.ordenacion.estudiantes.Estudiantes;



public class OrderGuardar {
  /*
    *Funcion EscribirDatos()
    *@param none
    *@return void
    *Permite el registro de los datos al archivo
     */
    public void LeerArchivo(){
        
        String f_entrada = "entrada.txt";
        File f_salida = new File("salida.txt");
        String linea = null;
        String[] datos = null;
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        Estudiantes estudiante = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f_entrada));
            // leer todas la lineas del archivo
            while ((linea = br.readLine()) != null) {
                // cada linea tiene los datos para crear un producto
                datos = linea.split(" ");
                estudiante = new Estudiantes(datos[0],datos[1],datos[2]);
                // agregamos el producto a la lista de productos
                estudiantes.add(estudiante);
            }
            br.close();
            // imprimir archivo en orden original
            System.out.println("Elementos originales:");
            System.out.println(estudiantes);
            Collections.sort(estudiantes);
            // imprimir archivo ordenado
            System.out.println("Elementos ordenados:");
            System.out.println(estudiantes);
            FileWriter escribir = new FileWriter(f_salida, true);
            for(Estudiantes e:estudiantes){
                String c = e.getCarne();
                String n = e.getNombre();
                String a = e.getApellido();
                escribir.write(c);
                escribir.write(n);
                escribir.write(a +"\r\n");
            }
            escribir.close();
            System.out.println("ARCHIVO: DATOS REGISTRADOS EXITOSAMENTE");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
