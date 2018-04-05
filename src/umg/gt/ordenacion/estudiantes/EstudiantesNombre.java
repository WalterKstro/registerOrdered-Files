package umg.gt.ordenacion.estudiantes;
/**
 * Clase EstudiantesCarne que implemnta la interfaz Comparable
 * para luego sobreescriir el metodo compareTo para la ordenacion
 * de la lista estudiantes
 * @author walte
 */
public class EstudiantesNombre implements Comparable<EstudiantesNombre> {

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
    public EstudiantesNombre(String carne, String nombre, String apellido,String carrera) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera=carrera;
    }
/**
 * Sobrecargando el constructor de la clase EstudiantesCarne
 */
    public EstudiantesNombre() {
    }

/**
 * Metodo para obtener la carrera
 * @return carrera
 */
    public String getCarrera() {
        return carrera;
    }
/**
 * Metodo para asignar la carrera
 * @param carrera 
 */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Metodo para obtener el carne
     * @return carne
     */
    public String getCarne() {
        return carne;
    }
/**
 * Metodo para asignar el carne
 * @param carne 
 */
    public void setCarne(String carne) {
        this.carne = carne;
    }
/**
 * Metodo para obtener el nombre
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Metodo para asignar el nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo para obtener el apellido
 * @return apellido
 */
    public String getApellido() {
        return apellido;
    }
/**
 * Metodo para asignar el apellido
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * Sobreescritura del metodo abstracto toString el cual imprime en 
 * pantalla los registros de los estudiantes
 * @return String
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
    public int compareTo(EstudiantesNombre e) {
        return this.getNombre().compareTo(e.getNombre());
    }
    
}


