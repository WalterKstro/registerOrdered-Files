package escritura;

import java.util.Scanner;

public class IngresarDatos extends EscribirArchivo {

    EscribirArchivo escribirarchivo = new EscribirArchivo();
    private String nombre;
    private String apellido;
    private String carrera;
    private String carnet;
    Scanner txt = new Scanner(System.in);

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
}
