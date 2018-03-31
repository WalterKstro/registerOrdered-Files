package umg.gt.order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarArchivo {

    public void Ordenar() {
        String filename = "entrada.txt";
        String linea = null;
        String[] datos = null;
        List<Producto> productos = new ArrayList<Producto>();
        Producto producto = null;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(filename));
            // leer todas la lineas del archivo
            while ((linea = br.readLine()) != null) {
                // cada linea tiene los datos para crear un producto
                datos = linea.split("");
                producto = new Producto(datos[0], datos[1], datos[2], datos[3]);
                // agregamos el producto a la lista de productos
                productos.add(producto);
            }
            br.close();
            // imprimir archivo en orden original
            System.out.println("Elementos originales:");
            System.out.println(productos);
            Collections.sort(productos);
            // imprimir archivo ordenado
            System.out.println("Elementos ordenados:");
            System.out.println(productos);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// Clase que representa lo que queremos ordenar
// Notar que estamos implementado Comparable
class Producto implements Comparable<Producto> {

    String carne;
    String nombre;
    String apellido;
    String carrera;

    public Producto(String carne, String nombre, String apellido, String carrera) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return carne + " " + nombre + " "
                + apellido + " " + carrera + "\n";

    }

    // Este metodo es el que nos permite comparar
    // entre productos y de esta forma puedan ser ordenados.
    @Override
    public int compareTo(Producto p) {
        return this.getNombre().compareTo(p.getNombre());
    }
}
