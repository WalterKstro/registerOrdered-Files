package gt.umg.ordenacion.lectura;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import umg.gt.ordenacion.estudiantes.Estudiantes;

public class Lectura {

    public void LecturaArchivo() {

        String filename = "entrada.txt";
        String linea = null;
        String[] datos = null;
        List<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        Estudiantes estudiante = null;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(filename));
            // leer todas la lineas del archivo
            while ((linea = br.readLine()) != null) {
                // cada linea tiene los datos para crear un producto
                datos = linea.split(" ");
                estudiante = new Estudiantes("\t"+ datos[0],datos[1],datos[2]);
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
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
