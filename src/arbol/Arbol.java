package arbol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arbol {

    public String carne;
    public String nombre;
    public String apellido;
    public String carrera;
    Scanner txt = new Scanner(System.in);

    public void IngresarDatos() {
        System.out.print("  INGRESE SU CARNÉ: ");
        carne = txt.nextLine();
        Nodo raiz = new Nodo(carne);
        System.out.print("  INGRESE SU NOMBRE: ");
        nombre = txt.nextLine();
        Nodo izquierda = new Nodo(nombre);
        System.out.print("  INGRESE SU APELLIDO: ");
        apellido = txt.nextLine();
        Nodo derecha = new Nodo(apellido);

        raiz.setDer(izquierda);
        raiz.setIzq(derecha);

        Nodo der = new Nodo();
        Nodo izq = new Nodo();

        der.setDer(new Nodo(carne));
        izq.setDer(new Nodo(nombre));
        der.setIzq(new Nodo(apellido));
        izq.setIzq(new Nodo(carne));
        
    }

    public void inorden(Nodo raiz) {

        if (raiz != null) {
            inorden(raiz.getIzq());
            System.out.print(raiz.getCarne());
            System.out.println(raiz.getNombre());
            System.out.println(raiz.getApellido());
            inorden(raiz.getDer());
        }
    }

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
                escribir.write(carne + "|");
                escribir.write(nombre + "|");
                escribir.write(apellido + "|");
                escribir.write(carne + ";");
                escribir.write("\r\n");
                /*
                *Se cierra el archivo
                 */
                escribir.close();
                System.out.println("ARCHIVO DATOS REGISTRADOS EXITOSAMENTE");
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
