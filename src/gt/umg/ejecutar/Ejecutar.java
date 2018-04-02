/**
 *Programa que permite la escritura y lectura de archivos y 
 *ordenarlos a ciertos criterios
 *@autor Walter Castro
 *@version 1.0
 *@
 */
package gt.umg.ejecutar;

/**
 * Importacion de librerias
 */
import gt.umg.esritura.EscribirArchivo;
import java.util.Scanner;
import gt.umg.lectura.LeerArchivo;
import gt.umg.ordenacion.guardar.OrderCarne;
import gt.umg.ordenacion.guardar.OrderCarrera;
import gt.umg.ordenacion.guardar.OrderNombre;


/**
 * La clase Ejecutar permite arrancar el programa
 * el cual tendra en su contexto la funcion principal
 * del programa
 */
public class Ejecutar {
    /**
     *Funcion principal del programa
     *@param args Array de argumentos
     *@return void
     */
    public static void main(String[] args) {
        
      
        /**
         *Instanciacion de los objetos
         */
        EscribirArchivo escribir = new EscribirArchivo();
        LeerArchivo lectura = new LeerArchivo();
        OrderCarne ordenarCarne = new OrderCarne();
        OrderNombre ordenarNombre = new OrderNombre();
        OrderCarrera ordenarCarrera = new OrderCarrera();

        
         /**
          *Captura de valores por teclado
          */
        Scanner ingreso = new Scanner(System.in);
        Scanner salida = new Scanner(System.in);
        /**
         *Inicializacion de varaibles
         */
        int opt;
        boolean condicion = true;
        /**
         * Ciclo do while permite mostrar el menu y salir del programa 
         * a travez de un case de opciones
         */
        do {
            /**
             *Inicializacion del menu
             */
            System.out.println("\n");
            System.out.println("**********************************************************");
            System.out.println("************ 1-------- REGISTRAR ESTUDIANTES    **********");
            System.out.println("************ 2-------- ALMACENAR ESTUDIANTES    **********");
            System.out.println("************ 3-------- VER REGISTRO ESTUDIANTES **********");
            System.out.println("************ 4-------- ORDENAR POR CARNE        **********");
            System.out.println("************ 5-------- ORDENAR POR NOMBRE       **********");
            System.out.println("************ 6-------- ORDENAR POR CARRERA      **********");
            System.out.println("************ 7-------- SALIR                    **********");
            System.out.println("**********************************************************");
            System.out.println("\n");
            
            /**
             * Instruccion que permite solicitar una opcion del menu
             */
            System.out.print("SELECCIONE UNA OPCION: ");
            opt = ingreso.nextInt();

            System.out.println("\n");
            /**
             *Case de opciones de seleccion
             */
            switch (opt) {
                case 1:escribir.Datos();
                break;
                case 2:escribir.EsribirDatos();
                break;
                case 3:lectura.Lectura();
                break;
                case 4:ordenarCarne.LeerArchivo();
                break;
                case 5:ordenarNombre.LeerArchivo();
                break;
                case 6:ordenarCarrera.LeerArchivo();
                break;
                case 7: 
                    /**
                     * Condicional para poder salir o no
                     * del programa
                     */
                    if(opt==7){
                    System.out.print("ESTA SEGURO DE SALIR? S/N: ");
                    String exit = salida.nextLine();
                    if("S".equals(exit) | "s".equals(exit)){ //Comparacion entre dos caracteres
                        condicion = false;
                        System.out.println("HAS SALIDO DEL PROGRAMA...");
                    }else{
                        condicion = true;
                    }
                }
                        
                break;
                default: System.out.println("OPCION NO ES VALIDA");
            }

        } while (condicion);

    }
    
  
}
