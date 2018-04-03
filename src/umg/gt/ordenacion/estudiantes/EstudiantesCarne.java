package umg.gt.ordenacion.estudiantes;
/**
 * Clase EstudiantesCarne que implemnta la interfaz Comparable
 * para luego sobreescriir el metodo compareTo para la ordenacion
 * de la lista estudiantes
 * @author walte
 */
public class EstudiantesCarne implements Comparable<EstudiantesCarne> {
/**
 * Declaracion de las variables
 */
    private String carne;
    private String nombre;
    private String apellido;
    private String carrera;
    /**
     * Declaracion del constructor de la clase EstudiantesCarne inicializando
     * las variables
     * @param carne es el carne ingresado por el usuario
     * @param nombre es el nombre ingresado por el usuario
     * @param apellido es el apellido ingresado por el usuario
     * @param carrera  es la carrera ingresdo por el usuario
     */
    public EstudiantesCarne(String carne, String nombre, String apellido,String carrera) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera=carrera;
    }
/**
 * Sobrecargando el constructor de la clase EstudiantesCarne
 */
    public EstudiantesCarne() {
    }

    /**
     * Metodos Getter y Setter de las variables de la clase
     * @return void para Setter
     * @return String para Getter
     * @param String para los metodos Setter
     */
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
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
/**
 * Sobreescritura del metodo abstracto toString el cual imprime en 
 * pantalla los registros de los estudiantes
 * @return String 
 * @param none
 */
    @Override
    public String toString() {
        return carne + " " + nombre + " " + apellido+" "+carrera+"\n";
    }
/**
 * Sobreescritura del metodo abstracto compareTo el cual compara el parametro
 * carne de los estudiantes y ordenarlo del menor al mayor
 * @param e Objeto de estudiante para tener acceso a los metodos Get
 * @return int 
 */
    @Override
    public int compareTo(EstudiantesCarne e) {
        return this.getCarne().compareTo(e.getCarne());
    }
    
}
